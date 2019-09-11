package com.pritam.SpringMvcThymeleaf.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.pritam.SpringMvcThymeleaf.model.Employee;

@Controller
public class EmployeeController {
	List<Employee> emp = new ArrayList<Employee>();

	@PostConstruct
	public void init() throws Exception {
		emp.add(new Employee(1, "Nikita", "Pune"));
		emp.add(new Employee(2, "PRITAM", "Pune"));
	}

//	@GetMapping
//	public String index() {
//		return "redirect:/employee";
//	}

	@GetMapping("/employee")
	public String getEmployee(Model model) {
		model.addAttribute("employee", emp);
		return "employee/employee.html";
	}

}
