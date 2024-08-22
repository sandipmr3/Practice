package demo;

interface Anonymos{
	
	void show();
}
public class AnonymosClass {
	
	
	public static void main(String[] args) {
		
		
		Anonymos anonymos = new Anonymos() {
			
			@Override
			public void show() {
			
				System.out.println("Implemented method show");
				
			}
		};
		
		
		anonymos.show();
		
		
		
		Thread thread = new Thread() {
			
			@Override
			public void run() {
			
				System.err.println("Thread running");
			}
		};
		
		
		thread.start();
	}
	

}
