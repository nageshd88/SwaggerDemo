package com.nagesh.SwaggerDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class EmployeeService {
	
	
	@Autowired
	Repository repo;
	

	
	public List<Employee> getAllEmployee() {
		List<Employee> emp=new ArrayList<Employee>();
		repo.findAll().forEach(emp::add);
		return emp;
	}
	
	public Employee getEmployee( String id)
	{
		return repo.findOne(id);
	}
	
	public void newEmployee(Employee emp)
	{
		repo.save(emp);
	}
	
	public void update(Employee emp)
	{
		repo.save(emp);
		
	}
	public void delete( String id)
	{
		repo.delete(id);
	}
	

}
