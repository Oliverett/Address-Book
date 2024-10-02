import java.util.Scanner;

public class People {
	//Instance variables
	private String Name;
	private String Address;
	
	//Constructors
	public People() {
		
	}
	public People(String fn, String ln,String ad){
  	  Name = ln + "," + fn;
  	  Address = ad;
	}
	//Get methods
	public String getName() {
		return Name;
	}
	public String getAddress() {
		return Address;
	}
	
	//set method
	public void setPpl(String fn, String ln,String ad) {
		Name = ln + "," + fn;
	  	  Address = ad;
   	 
	}
	
	// Display method   
	   public void displayEntries () {
			System.out.printf("|\t%s\t|\t%s\t|\n",Name,Address);
		}
}
