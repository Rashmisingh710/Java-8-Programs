package com.jsp.task;

import java.util.Arrays;
import java.util.List;

public class EmployeeRunner {

	static List<com.jsp.task.Employee> getAll(){
	
		
		com.jsp.task.Employee e1=new com.jsp.task.Employee(1, "Virat", 30, 20000.0);
		com.jsp.task.Employee e2=new com.jsp.task.Employee(2, "Rahul", 35, 80000.0);
		com.jsp.task.Employee e3=new com.jsp.task.Employee(3, "Dhoni", 36, 50000.0);
		com.jsp.task.Employee e4=new com.jsp.task.Employee(4, "Rohit", 40, 40000.0);
		com.jsp.task.Employee e5=new com.jsp.task.Employee(5, "Hardik",50, 30000.0);
		List<com.jsp.task.Employee> l1=Arrays.asList(e1,e2,e3,e4,e5);
		return l1;
				

	}

}
