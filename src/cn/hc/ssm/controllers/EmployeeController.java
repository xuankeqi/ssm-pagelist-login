package cn.hc.ssm.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import cn.hc.ssm.entities.Employee;
import cn.hc.ssm.service.EmployeeService;
import cn.hc.ssm.utils.PageBean;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	/*82812345*/
	@RequestMapping("/getPageBean")
	public ModelAndView getPageBean(@RequestParam(value="pageNo",required=false,defaultValue="1") Integer pageNo,
			@RequestParam(value="pageSize",required=false,defaultValue="10") Integer pageSize){
		ModelAndView mv = new ModelAndView();
		PageBean<Employee> pageBean = employeeService.findPageBean(pageNo, pageSize);
		mv.addObject("pageBean",pageBean);
		mv.setViewName("emp-pageList");
		return mv;
	}
	
}
