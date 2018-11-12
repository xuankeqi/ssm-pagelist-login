package cn.hc.ssm.dao;

import org.apache.ibatis.annotations.Param;

import cn.hc.ssm.entities.User;

public interface UserMapperVo {
    
	User selectLogin(@Param("userName") String userName, @Param("password") String password);

}