package com.itheruan.service.impl;

import java.util.List;

import com.itheruan.dao.Impl.ImageDaoImpl;
import com.itheruan.doamin.Image;
import com.itheruan.service.IImageService;

public class ImageServiceImpl implements IImageService{

	@Override
	public List<Image> findAllImage() {
		// TODO Auto-generated method stub
		return new ImageDaoImpl().findAllImage();
	}

	@Override
	public List<Image> findImagesByUserId(int userid) {
		// TODO Auto-generated method stub
		return new ImageDaoImpl().findImagesByUserId(userid);
	}

	@Override
	public Image findImageByUserIdAndImageId(int userid, int imageid) {
		// TODO Auto-generated method stub
		return new ImageDaoImpl().findImageByUserIdAndImageId(userid,imageid);
	}

	@Override
	public void saveImage(Image image) {
		// TODO Auto-generated method stub
		new ImageDaoImpl().saveImage(image);
	}

	@Override
	public void deleteImageByImageId(int imageId) {
		// TODO Auto-generated method stub
		new ImageDaoImpl().deleteImageByImageId(imageId);
	}

}
