package com.jsp;

public class Runner {
public static void main(String[] args) {
	FunctionInterface f1=()->{System.out.println("Hello");};
	f1.display();
	
	FunctionInterface f2=()->{System.out.println("bye");};
	f2.display();
	
	FunctionalInterface2 f3=(x,y)->{System.out.println("sum:"+(x+y));};
	f3.show(52,7);
	
	FunctionalInterface3 f4=()->"hello"+67;
	System.out.println(f4.displayy());
	
}
}
