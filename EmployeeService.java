package com.nit.Serrvice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Singleton;

import com.nit.Beans.Employee;


public class EmployeeService {
	static Map<Integer,Object> map =null;
	static{
		map = new HashMap<>();
	}
	
	public Map<Integer,Object> getAllEmployees() {
		Employee e1 = new Employee(101, "Sai", "SE");
		Employee e2 = new Employee(102, "kiran", "SSE");
		map.put(1, e1);
		map.put(2, e2);
		return map;
	}
	public Map<Integer,Object> addEmployee(Employee emp) {
		map.put(3, emp);
		return map;
	}
	public Map<Integer,Object> updateEmployee(int no, Employee emp) {
			map.put(no, emp);	 
		 return map;
		}
	public void deleteEmployee(int no) {
		map.remove(no);

	}
	public Employee getEmployeebyId(int no){
	return	(Employee)map.get(no);
		
	}

}
