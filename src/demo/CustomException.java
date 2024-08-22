package demo;


class MyCustomException extends Exception{
	
	MyCustomException(String exceptionMessage){
		
		super(exceptionMessage);
	}
	
	
	
}
public class CustomException {
	
	public static void main(String[] args) {
		
		int age =10;
		
		try {
			if(age < 18) {
				
				System.out.println("Invalid age");
				throw new MyCustomException("Invalid age for vote");
			
			}else {
				
				System.out.println("Valid age");
			}
		}catch(MyCustomException exception) {
			
			System.out.println("Excepiton -- > " +exception);
		}
	}

}
