package proj2;

import java.util.Optional;
import java.util.function.Supplier;

public class OptionalClass2 {

	public static void main(String[] args) {
		String[] arr=new String[4];
		arr[0]="hello";
		arr[2]="hii";
		
		Supplier<String>s1=()->"-1";
		for(String ele:arr) {
			Optional<String>op=Optional.ofNullable(ele);
			System.out.println(op.orElse("Here you are"));//using orElse method for-->replacing null/empty 
		}
		
		System.out.println("*********************************************");
		
    for(String ele:arr) {
    	Optional<String>op=Optional.ofNullable(ele);
    	System.out.println(op.orElseGet(s1));
    }
	}

}

