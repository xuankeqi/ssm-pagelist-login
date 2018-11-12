package cn.hc.ssm.service;

import cn.hc.ssm.entities.User;

public interface UserService {

	User login(String userName, String password);
	
}
