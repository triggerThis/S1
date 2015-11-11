package com.lqSite1.smvc1.employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import  com.lqSite1.smvc1.employee.EmployeeManager;

@Controller
@RequestMapping("/employee-module")
public class EmployeeController 
{
	//http://127.0.0.1:8080/spring-mvc-showcase/employee-module/getAllEmployees
	@Autowired
	EmployeeManager manager;

	@RequestMapping(value = "/getAllEmployees", method = RequestMethod.GET)
	public String getAllEmployees(Model model)
	{
		model.addAttribute("employees", manager.getAllEmployees());
		return "employeesListDisplay";
		//lq , using show case redirect;
		//return "redirect/employeesListDisplay";
	}
	
	@RequestMapping(value = "/getRemark", method = RequestMethod.GET)
	public String getRemark(Model model)
	{
		model.addAttribute("employees", manager.getAllEmployees());
		return "remark/hibernate";
		//lq , using show case redirect;
		//return "redirect/employeesListDisplay";
	}
}