
public class Students {
	
	int sid;
	String sname;
	double sgpa;
	String sbranch;
	void insertRecord(int si, String sn, double sg, String sb){
		sid = si;
		sname = sn;
		sgpa = sg;
		sbranch = sb;	
	}
	void display() {
		System.out.println(sid+" "+sname+" "+sgpa+" "+sbranch);
	}

public class student1{
	public static void main(String args[]){ 
	
		System.out.println("Welcome in M12 batch ");
	
		
		 Students s1=new Students();  
		  Students s2=new Students();  
		  s1.insertRecord(1,"Akbar",8.8,"MCA");  
		  s2.insertRecord(2,"Asad",8.5,"MBA");  
		  s1.display();  
		  s2.display();  
		  }  
	}
}
