package com.nagesh.SwaggerDemo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("/All")
	public List<Employee> getAllEmployee() {
	
		return employeeService.getAllEmployee() ;
	}
	
	@GetMapping("/{id}")
	public Employee getEmployee(@PathVariable String id)
	{
		return employeeService.getEmployee(id);
	}
	
	
	@PostMapping("/post")
	public void getnewEmployee(@RequestBody Employee emp)
	{
		employeeService.newEmployee(emp);
	}
	
	@PutMapping("/put")
	public void getupdate(@RequestBody Employee emp)
	{
		employeeService.update(emp);
		
	}
	@DeleteMapping("/{id}")
	public void getdelete(@PathVariable String id)
	{
		employeeService.delete(id);
	}
	
	

}
