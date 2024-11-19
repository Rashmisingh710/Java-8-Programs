package com.jsp.test;

import java.util.List;
import java.util.Collections;
import java.util.Comparator;

public class EmployeeSortByAge {
	public static void main(String[] args) {
		List<Employee> l1 = EmployeeService.getAll();

		Comparator<Employee> c1 = (obj1, obj2) -> obj1.getAge() - obj2.getAge();
		Collections.sort(l1, c1);

		l1.forEach((ele) -> System.out.println(ele));
	}

}
