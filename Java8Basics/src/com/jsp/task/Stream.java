package com.jsp.task;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Stream {

	public static void main(String[] args) {
		List<Employee> l = EmployeeRunner.getAll();
		l.forEach(ele -> System.out.println(ele));
		System.out.println();

		// converting ename int upper case and returning as list
		List<Employee> l1 = l.stream().map((obj) -> {
			obj.setName(obj.getName().toUpperCase());
			return obj;
		}).collect(Collectors.toList());
		l1.forEach(ele -> System.out.println(ele));

		System.out.println();
		// name as upper case and increase sal by 10000 .Return map of eid and sal
		Map<Integer, Double> m1 = l.stream().map((obj) -> {
			obj.setName(obj.getName().toUpperCase());
			obj.setSal(obj.getSal() + 10000);
			return obj;
		}).collect(Collectors.toMap(obj -> obj.getEid(), obj -> obj.getSal()));
		System.out.println(m1);
		
		System.out.println();
		//print only employee who has age >25
		l.stream().filter((e)->e.getAge()>25).forEach(ele->System.out.println(ele));
		
		
		

     System.out.println("*************************************************");	
		
Predicate<Employee>	p1=(e)->e.getAge()>24;

List<Employee> l3=l1.stream().filter(p1).map((e)->{
	e.setSal(e.getSal()+5000);
	return e;}).collect(Collectors.toList());

l3.forEach(ele->System.out.println(ele));
	
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


