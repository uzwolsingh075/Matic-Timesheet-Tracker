package com.maaticit.timesheet.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.maaticit.timesheet.entity.Employee;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository {

	@Override
	public void save(List<Employee> employee) {
		List<Employee> list=new ArrayList<>();
		
		list.addAll(employee);
		System.out.println("the list of employees are: \n");
		for(Employee e:list) {
			System.out.println(e);
		}
		
	}

}
