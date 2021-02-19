package com.itheruan.dao.Impl;

import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.itheruan.dao.IImageDao;
import com.itheruan.doamin.Image;
import com.itheruan.doamin.User;
import com.itheruan.utils.JDBCUtils;

public class ImageDaoImpl implements IImageDao {
	private JdbcTemplate jdbcTemplate = new JdbcTemplate(JDBCUtils.getDataSource());
	/**
	 * 查询所有图片信息
	 * 
	 * @return
	 */
	
	@Override
	public List<Image> findAllImage() {
		// TODO Auto-generated method stub
		 try {
				String sql = "select * from image ";
				 return jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(Image.class));  
			} catch (DataAccessException e) {
				// TODO Auto-generated catch block
				return null;
			}
			
	}

	/**
	 * 根据用户id查询图片
	 * 
	 * @param userid
	 * @return
	 */
	@Override
	public List<Image> findImagesByUserId(int userid) {
		// TODO Auto-generated method stub
		 try {
				String sql = "select * from image where imageuserid = ?";
				 return jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(Image.class),userid);  
			} catch (DataAccessException e) {
				// TODO Auto-generated catch block
				return null;
			}
	}

	/**
	 * 根据用户id和图片id判断当前图片是否是他的
	 * 
	 * @param userid
	 * @param imageid
	 * @return
	 */
	@Override
	public Image findImageByUserIdAndImageId(int userid, int imageid) {
		 try {
				String sql = "select * from image where imageuserid = ? and imgaeid = ?";
				 return jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper<>(Image.class),userid,imageid);
			} catch (DataAccessException e) {
				// TODO Auto-generated catch block 
				return null;
			}
	}

	/**
	 * 保存图片
	 * 
	 * @param image
	 */
	@Override
	public void saveImage(Image image) {
		// TODO Auto-generated method stub
		String sql = "insert into image(imagename,imageuserid) values (?,?)";
		
		 jdbcTemplate.update(sql, image.getImagename(),image.getImageuserid());
	}
	public static void main(String[] args) {  
		 new ImageDaoImpl().deleteImageByImageId(1);
	}
	/**
	 * 根据图片id删除图片
	 * 
	 * @param imageId
	 */
	@Override
	public void deleteImageByImageId(int imageId) {
		// TODO Auto-generated method stub
		System.out.println(imageId);
		String sql = "delete from image where imgaeid = ?";
		
		 jdbcTemplate.update(sql, imageId);
	}

}
