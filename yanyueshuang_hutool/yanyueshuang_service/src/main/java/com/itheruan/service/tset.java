package com.itheruan.service;

import java.awt.Color;
import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Date;

import javax.imageio.ImageIO;

import com.alibaba.druid.util.StringUtils;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.img.ImgUtil;
import cn.hutool.core.io.FileUtil;

public class tset {
@SuppressWarnings("resource")
public static void main(String[] args) throws Exception {
	
String file = "C:\\Users\\11137\\Desktop\\image\\us.jpg";



File picture=new File(file);
BufferedImage sourceImg=ImageIO.read(new FileInputStream(picture));
int width = sourceImg.getWidth();
System.out.println(width);
int height = sourceImg.getHeight();



//图片位置
int widrhWei = width/2;
int heightWei = height/2;
String font = "旅途点评";
int size = font.length();
int count = 0;
if (count>3) {
	count = 30;
}


System.out.println(height);

	ImgUtil.pressText(//
		    FileUtil.file(file), //
		    FileUtil.file("C:\\Users\\11137\\Desktop\\image\\1233.jpg"), //
		    font, Color.WHITE, //文字
		    new Font("黑体", Font.BOLD, 20), //字体
		    widrhWei-45, //x坐标修正值。 默认在中间，偏移量相对于中间偏移
		    heightWei, //y坐标修正值。 默认在中间，偏移量相对于中间偏移
		    0.8f//透明度：alpha 必须是范围 [0.0, 1.0] 之内（包含边界值）的一个浮点数字
		);
boolean empty = StringUtils.isEmpty("s");
System.out.println(empty);
}
}
