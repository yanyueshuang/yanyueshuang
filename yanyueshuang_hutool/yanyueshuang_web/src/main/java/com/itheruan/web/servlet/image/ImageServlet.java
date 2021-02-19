package com.itheruan.web.servlet.image;

import java.awt.Color;
import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import com.itheruan.doamin.Image;
import com.itheruan.doamin.User;
import com.itheruan.service.impl.ImageServiceImpl;
import com.itheruan.service.impl.UserServiceImpl;
import com.itheruan.utils.FileUtils;
import com.itheruan.utils.JsonUtil;
import com.itheruan.utils.UuidUtil;

import cn.hutool.core.img.ImgUtil;
import cn.hutool.core.io.FileUtil;

@WebServlet("/image/imageServlet.do")
public class ImageServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String method = request.getParameter("method");
		if ("findAllImage".equals(method)) {
			// 查询所有图片
			findAllImage(request, response);
		} 
			else if ("findImagesByUserId".equals(method)) {
			
			//根据用户id查询图片
				findImagesByUserId(request,response);
		}else if ("saveImage".equals(method)) {
			// 保存图片
			try {
				saveImage(request, response);
			} catch (FileUploadException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}else if ("deleteImageByImageId".equals(method)) {
			
			//删除图片
			deleteImageByImageId(request,response);
		}
	}

	/**
	 * 根据用户id查询图片
	 * @param request
	 * @param response
	 * @throws IOException 
	 * @throws ServletException 
	 */
	private void findImagesByUserId(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
System.out.println("jinru");
		// 获取session中用户信息
		User user = (User) request.getSession().getAttribute("user");
		int userIdS = user.getUserid();
		List<Image> imageList = new ImageServiceImpl().findImagesByUserId(userIdS);
		//System.out.println(imageList);
		request.setAttribute("imageList", imageList);
		//转向
		request.getRequestDispatcher("/index_02.jsp").forward(request, response);
	}

	/**
	 * 删除图片
	 * 
	 * @param request
	 * @param response
	 * @throws IOException
	 */
	
	private void deleteImageByImageId(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		String imageId = request.getParameter("imageId");
		new ImageServiceImpl().deleteImageByImageId(Integer.parseInt(imageId));
		JsonUtil.writeValue(true, response);
	}

	/**
	 * 保存图片
	 * 
	 * @param request
	 * @param response
	 * @throws IOException
	 * @throws FileUploadException
	 */
	private void saveImage(HttpServletRequest request, HttpServletResponse response)
			throws IOException, FileUploadException {
		System.out.println(request.getParameter("filesss"));
		// TODO Auto-generated method stub
		// 设置图片上传的位置
		String realPath = request.getSession().getServletContext().getRealPath("/uploadImages");
		// 判断是否有该文件夹
		File file = new File(realPath);
		if (!file.exists()) {
			System.out.println("sss");
			// 文件夹为空，创建该文件夹
			file.mkdir();
		}

		// 创建ServletFileUpload解析器
		ServletFileUpload servletFileUpload = new ServletFileUpload(new DiskFileItemFactory());
		// 处理中文乱码
		servletFileUpload.setHeaderEncoding("utf-8");
		// 获取解析的list集合
		List<FileItem> itemList = servletFileUpload.parseRequest(request);
		// 发布点评的用户
		// 获取session中用户信息
		User user = (User) request.getSession().getAttribute("user");
		int user_id = user.getUserid();
		
		ImageServiceImpl imageServiceImpl = new ImageServiceImpl();
		System.out.println(itemList);
		// 判断集合是否为空
		if (itemList != null || itemList.size() > 0) {
			// 遍历集合
			for (FileItem item : itemList) {
				// 如果是文件就上传
				if (!item.isFormField()) {// 普通表单字段为true 否者费false
					// 创建图片实体类
					Image remarkimage = new Image();
					// 图片完整路径
					String filePath = realPath + "\\" + UuidUtil.getUuid() + ".png";
					
					
					
					

					// FileOutputStream fos = new FileOutputStream();
					org.apache.commons.io.FileUtils.copyInputStreamToFile(item.getInputStream(), new File(filePath));
					//获取图片尺寸
					File picture=new File(filePath);
					BufferedImage sourceImg=ImageIO.read(new FileInputStream(picture));
					int width = sourceImg.getWidth();
					System.out.println(width);
					int height = sourceImg.getHeight();
					//图片位置
					int widrhWei = width/2;
					int heightWei = height/2;
					String font = "旅途点评";
					//添加水印
					ImgUtil.pressText(//
						    FileUtil.file(filePath), //
						    FileUtil.file(filePath), //
						    font, Color.WHITE, //文字
						    new Font("黑体", Font.BOLD, 20), //字体
						    widrhWei-45, //x坐标修正值。 默认在中间，偏移量相对于中间偏移
						    heightWei, //y坐标修正值。 默认在中间，偏移量相对于中间偏移
						    0.8f//透明度：alpha 必须是范围 [0.0, 1.0] 之内（包含边界值）的一个浮点数字
						);
					// 图片名称
					String imageName = FileUtils.upload(filePath, "remarkImage/" + UuidUtil.getUuid());
					// 删除文件
					//new File(filePath).delete();

					remarkimage.setImagename(imageName);
					remarkimage.setImageuserid(user_id);
					imageServiceImpl.saveImage(remarkimage);
					;

				}

			}

		}

		 response.sendRedirect(request.getContextPath()+"/image/imageServlet.do?method=findImagesByUserId");

	}

	/**
	 * 查询所有图片
	 * 
	 * @param request
	 * @param response
	 * @throws IOException
	 */
	private void findAllImage(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub

		ImageServiceImpl serviceImpl = new ImageServiceImpl();
		UserServiceImpl userServiceImpl = new UserServiceImpl();

		// 获取session中用户信息
		User user = (User) request.getSession().getAttribute("user");
		int userIdS = user.getUserid();
		// 查询所有图片
		List<Image> imageList = serviceImpl.findAllImage();
		System.out.println(imageList);

		// 遍历图片集合
		for (Image image : imageList) {
			// 获取图片的用户id
			Integer userId = image.getImageuserid();
			// 获取图片id
			Integer imageId = image.getImgaeid();
			// 获取用户信息，添加到图片实体类中
			User userById = userServiceImpl.findUserById(userId);
			image.setUser(userById);
			// 根据用户id和图片id判断当前图片是否是当前登录的用户
			Image andImageId = serviceImpl.findImageByUserIdAndImageId(userId, imageId);
			boolean flag = false;
			if (andImageId != null) {
				// 属于当前用户
				flag = true;
			}
			image.setFlaguser(flag);
		}

		JsonUtil.writeValue(imageList, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {  

		doGet(request, response);

	}

}
