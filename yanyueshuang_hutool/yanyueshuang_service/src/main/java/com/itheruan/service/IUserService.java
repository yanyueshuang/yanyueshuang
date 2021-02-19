package com.itheruan.service;

import java.util.List;

import com.itheruan.doamin.User;

public interface IUserService {
	/**
	 * 查询所有用户
	 * 
	 * @return
	 */
	List<User> findAllUser();
	
	/**
	 * 根据id查询用户
	 * @param userId
	 * @return
	 */
	User findUserById(int userId);
	
	
	/**
	 * 根据用户名和密码查找用户
	 * @param username
	 * @param userpassword
	 * @return
	 */
	User findUserByNameAndPassoword(String username ,String userpassword);
	
	
	/**
	 * 保存用户
	 * @param user
	 */
	void saveUser(User user);
}
