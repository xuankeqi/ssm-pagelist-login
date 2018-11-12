package cn.hc.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.hc.ssm.dao.UserMapper;
import cn.hc.ssm.dao.UserMapperVo;
import cn.hc.ssm.entities.User;
import cn.hc.ssm.service.UserService;

@Transactional
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	@Autowired
	private UserMapperVo userMapperVo;
	
	@Override
	public User login(String userName, String password) {
		
		return userMapperVo.selectLogin(userName,password);
	}

}
