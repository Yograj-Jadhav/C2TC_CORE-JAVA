package Snior_dev;
import junior_dev.CarModel; //using packagename OR packagename.classname


public class Ferrari_car {

	public static void main(String[] args) 
	{
		
		CarModel b=new CarModel();
		
		
	//🤔 	//Junior_dev.CarModel b=new Junior_dev.CarModel();
		   //using direct  (Fully Qualified Name) 
		
		//b.display(); //display() from the type CarModel is not visible change visibility to public 
		b.speed();
		
	}

}