package com.itheruan.service;

import java.util.List;

import com.itheruan.doamin.Image;

public interface IImageService {

	/**
	 * 查询所有图片信息
	 * @return
	 */
	List<Image> findAllImage();
	
	
	
	
	/**
	 * 根据用户id查询图片
	 * @param userid
	 * @return
	 */
	List<Image> findImagesByUserId(int userid);
	
	/**
	 * 根据用户id和图片id判断当前图片是否是他的
	 * @param userid
	 * @param imageid
	 * @return
	 */
	Image findImageByUserIdAndImageId(int userid,int imageid);
	
	
	/**
	 * 保存图片
	 * @param image
	 */
	void saveImage(Image image);
	
	
	/**
	 * 根据图片id删除图片
	 * @param imageId
	 */
	void deleteImageByImageId(int imageId);
}
