package proj2;

import java.util.Optional;

public class OptionalClass {

	public static void main(String[] args) {
		
		
		String[] arr=new String[4];
		//System.out.println(arr[0].charAt(0));
		
		arr[0]="hello";
		Optional<String> op=Optional.ofNullable(arr[0]);
		if(op.isPresent()) {
			System.out.println("It Contains..!!");
			System.out.println(op);
			System.out.println(op.get());
		}else {
			System.out.println("Its Empty..!!");
		}
				
		

	}

}
