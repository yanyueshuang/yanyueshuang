package com.itheruan.dao.Impl;

import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.itheruan.dao.IUserDao;
import com.itheruan.doamin.User;
import com.itheruan.utils.JDBCUtils;


public class UserDaoImpl implements IUserDao{
	private JdbcTemplate jdbcTemplate = new JdbcTemplate(JDBCUtils.getDataSource());
	/**
	 * 查询所有用户
	 * 
	 * @return
	 */
	/*
	 * public static void main(String[] args) { List<User> findAllUser = new
	 * UserDaoImpl().findAllUser(); System.out.println(findAllUser); }
	 */
	public static void main(String[] args) {
		 User user = new UserDaoImpl().findUserByNameAndPassoword("zhangsan", "t7z3r8h5");
		 System.out.println(user);
	}
	@Override
	public List<User> findAllUser() {
		// TODO Auto-generated method stub
		 try {
			String sql = "select * from user ";
			 return jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(User.class));  
		} catch (DataAccessException e) {
			// TODO Auto-generated catch block
			return null;
		}
		
	}
	/**
	 * 根据id查询用户
	 * @param userId
	 * @return
	 */
	@Override
	public User findUserById(int userId) {
		 try {
				String sql = "select * from user where userid = ?";
				 return jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper<>(User.class),userId);
			} catch (DataAccessException e) {
				// TODO Auto-generated catch block 
				return null;
			}
	}
	

	/**
	 * 根据用户名和密码查找用户
	 * @param username
	 * @param userpassword
	 * @return
	 */
	@Override
	public User findUserByNameAndPassoword(String username, String userpassword) {
		 try {
				String sql = "select * from user where username = ? and userpassword = ?";
				 return jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper<>(User.class),username,userpassword);
			} catch (DataAccessException e) {
				// TODO Auto-generated catch block 
				return null;
			}
	}


	/**
	 * 保存用户
	 * @param user
	 */
	@Override
	public void saveUser(User user) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				String sql = "insert into user(username,userpassword) values (?,?)";
				
				 jdbcTemplate.update(sql, user.getUsername(),user.getUserpassword());
	}
	
	
}
