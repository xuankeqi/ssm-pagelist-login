package cn.hc.ssm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.hc.ssm.entities.Employee;

public interface EmployeeMapperVo {

	List<Employee> queryPageBean(@Param("pageNo") Integer pageNo,@Param("pageSize") Integer pageSize);
	
	Integer getCount();
	
}