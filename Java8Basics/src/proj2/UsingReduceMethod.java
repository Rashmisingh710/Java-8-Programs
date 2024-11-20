package proj2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class UsingReduceMethod {

	public static void main(String[] args) {
		
		List<Integer>l1=Arrays.asList(12,34,5,6,1,8);
		Optional<Integer>ans=l1.stream().reduce((a,b)->a+b);
		System.out.println(ans.get());
		
		
		System.out.println("*************************");
		
		List<Integer>l2=Arrays.asList(12,34,5,6,1,8);
		Optional<Integer>ans2=l2.stream().reduce((a,b)->a>b?a:b);
		System.out.println(ans2.get());
		
		
		System.out.println("*****************************");
		
		List<String>l3=Arrays.asList("hello","hii","hi everyone");
		Optional<String>ans3=l3.stream().reduce((a,b)->a.length()>b.length()?a:b);
		Optional<String>ans4=l3.stream().reduce((a,b)->a+" "+b);
		
		System.out.println(ans3.get());
		System.out.println(ans4.get());
		
		
	

	}

}
