package cn.hc.ssm.service;

import java.util.List;

import cn.hc.ssm.entities.Employee;
import cn.hc.ssm.utils.PageBean;

public interface EmployeeService {
	
	PageBean<Employee> findPageBean(Integer pageNo,Integer pageSize);
	
}
