import java.util.ArrayList;

import java.util.Scanner;

public class AddressBook {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        People [] ppl = new People [10];
       
       ppl[0] = new People ("Genghis","Khan","Khentii Aimag, Mongolia");
       ppl[1] = new People ("Rasputin"," ","St. Petersburg, Russia");
       ppl[2] = new People ("Helen","Mirren","London, England");
        
       
        int p = 3;
        
        
        boolean flag = true; 
        while (flag) {

           System.out.println("0. Add Name");
           System.out.println("1. Look up Name");
           System.out.println("2. Update address");
           System.out.println("3. Delete an entry");
           System.out.println("4. Display All entries ");
           System.out.println("5. Quit");
          
           System.out.print("\nSelect an option (0-5): ");
           if (input.hasNextInt()) {
            int userOption = input.nextInt(); 
            
            
            
            switch(userOption){
               case 0: 
            	   for (int i = 0; i < ppl.length; i++) {    
            		    ppl[i] = new People();
            	   System.out.print("Enter first name:\n");
	               String fn = input.next();
	               System.out.print("Enter last name:\n");
	               String ln = input.next();
	               System.out.print("Enter address:\n");
	               String ad = input.next();
	               ppl[i].setPpl(fn,ln,ad);
            	   }
	               p++;
	               	break; 
               case 1: int rIndex = searchName(ppl,p);
               if (rIndex != -1) {
              	 //found person 
              	  System.out.printf("|\t\t%s\t|\t\t| %d \t|\n",
              			  ppl[rIndex].getName(), ppl[rIndex].getAddress());
                }
                else {
              	  //cant find person
              	  System.out.print("Person not found");
              		  
                }
               		break;
               case 2: int uIndex = searchName(ppl,p);
               if (uIndex != -1) {
                	 //found person 
                	  System.out.printf("|\t\t%s\t|\t\t| %d \t|\n",
                			  ppl[uIndex].getName(), ppl[uIndex].getAddress());
                	  System.out.println("Enter a new address\n.");
                	  	String newad = input.next();
                	  	System.out.printf("|\t\t%s\t|\t\t| %d \t|\n",
                  			  ppl[uIndex].getName(), newad);
                	 System.out.printf("|\t\t%s\t|\t\t| %d \t|\n",
               			  ppl[uIndex].getName(), ppl[uIndex].getAddress());
                  }
                  else {
                	  //cant find person
                	  System.out.print("Person not found");
                  }
               break;
               case 3: int dIndex = searchName(ppl,p);
               String name = input.nextLine();
               if (dIndex != -1) {
                	 //found person 
            	   for (int i = 0; i < ppl.length; ) {
                       ppl[i].getName().equals(name);

                       
                       p--;
                       System.out.println("|\tName\t|\t Address\t|");
                       System.out.println("--------------------------------------------------");
                       for (int q = 0; q < p; q++) {
                        	  ppl[q].displayEntries();
                          }
                         break; 
                       }

                  }
                  else {
                	  //cant find person
                	  System.out.print("Person not found");
                  }
               case 4:System.out.println("|\tName\t|\t Address\t|");
               System.out.println("----------------------------------------------------------");
               for (int q = 0; q < p; q++) {
             	  ppl[q].displayEntries();
               }
               break;
               case 5: flag = false;
               default: System.out.println("\nInvalid option. Please try again."); break;
            }   
            
            } else {
               System.out.println("\n\n****INVALID INPUT****");
               input.nextLine();
            }
        }
	}
	public static int searchName(People[] fn, int p) {
		  Scanner input = new Scanner(System.in);
		  
		  //prompt and take user input
		  System.out.println("Enter a first name for search: ");
		  String name = input.next();
		  
		  // for loop to search in array
		  for (int i = 0; i<p; i++) {
			  if (fn[i].getName().contains(name)) {
				  return i;
			  }
		  }
		  
		  //return
		  
		  return -1;
	   }
}

	