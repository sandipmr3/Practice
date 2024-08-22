package demo;


final class Immutable{
	
	final private String name;
	final private int roll;
	
	public Immutable(String name, int roll) {
		
		this.name = name;
		this.roll = roll;
	}
	
	public String getName() {
		return name;
	}

	public int getRoll() {
		return roll;
	}
	
}

public class ImmutableClass {

	public static void main(String[] args) {
		
		Immutable immutable = new Immutable("Sandip",1);
		
		System.out.println(immutable.getName());
		System.out.println(immutable.getRoll());
	}
}
