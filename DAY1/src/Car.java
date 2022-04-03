

public class Car {
	
	int noofcars;
	String Model;
	
	void display1()
	{
		System.out.println("Welcome to Kia-Motors ");
	}

	void display2()
	{
		System.out.println("Welcome to Maruti ");
	}
	
	void display3()
	{
		System.out.println("Welcome to TATA ");
	}
	public static void main(String[] args) {
		
		Car obj = new Car();
		obj.display1();
		obj.display2();
		obj.display3();
		
	}

}