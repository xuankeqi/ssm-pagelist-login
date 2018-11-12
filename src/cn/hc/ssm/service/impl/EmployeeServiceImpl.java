package cn.hc.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.hc.ssm.dao.EmployeeMapper;
import cn.hc.ssm.dao.EmployeeMapperVo;
import cn.hc.ssm.entities.Employee;
import cn.hc.ssm.service.EmployeeService;
import cn.hc.ssm.utils.PageBean;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeMapperVo employeeMapperVo;

	@Override
	public PageBean<Employee> findPageBean(Integer pageNo,Integer pageSize) {
		
		PageBean<Employee> pageBean = new PageBean<>();
		
		pageBean.setPageNo(pageNo);
		pageBean.setPageSize(pageSize);
		System.out.println("pageNo" + pageNo);System.out.println("pageSize" + pageSize);
		int totalCount = employeeMapperVo.getCount();
		
		pageBean.setTotalCount(totalCount);
		pageBean.setTotalPageCount(totalCount);
		
		List<Employee> list = employeeMapperVo.queryPageBean((pageBean.getPageNo()-1)*pageBean.getPageSize(),pageBean.getPageSize());
		
		pageBean.setList(list);
		
		return pageBean;
	}
	
}
