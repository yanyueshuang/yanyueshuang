package com.itheruan.service.impl;

import java.util.List;

import com.itheruan.dao.Impl.UserDaoImpl;
import com.itheruan.doamin.User;
import com.itheruan.service.IUserService;

public class UserServiceImpl implements IUserService{

	@Override
	public List<User> findAllUser() {
		// TODO Auto-generated method stub
		return new UserDaoImpl().findAllUser();
	}

	@Override
	public User findUserById(int userId) {
		// TODO Auto-generated method stub
		return new UserDaoImpl().findUserById(userId);
	}

	@Override
	public User findUserByNameAndPassoword(String username, String userpassword) {
		// TODO Auto-generated method stub
		return new UserDaoImpl().findUserByNameAndPassoword(username,userpassword);
	}

	@Override
	public void saveUser(User user) {
		// TODO Auto-generated method stub
		 new UserDaoImpl().saveUser(user);
	}

}
