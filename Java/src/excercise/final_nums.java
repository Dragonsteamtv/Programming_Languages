package excercise;
import java.util.Scanner;

public class final_nums {
	// create a local interface with one abstract
    // method run()
    public interface runInterface {
        void run();
    }
    
    // array and index for check and update
 	static int[] numarray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
 	static int i;
 	static boolean run = true; 
  
    // function have implements another function run()
    static void Foo()
    {
        // implement run method inside Foo() function
        runInterface r = new runInterface() {
            public void run()
            {
            	System.out.println("check or update Array? \n"
        				+ "a) check \n"
        				+ "b) update \n"
        				+ "c) check for index");
        		@SuppressWarnings("resource")
				Scanner input = new Scanner(System.in);
        		String choicein = input.next();
        		
        		switch(choicein) {
        		case "a":
        			System.out.println("Please enter a number: ");
        			int inputnum = input.nextInt();
        			Check(inputnum);	
        		case "b":
        			System.out.println("Enter a number to update");
        			int updatenum = input.nextInt();
        			Update(updatenum);
        		case "c":
        			System.out.println("Which index do you want to check?");
        			int checkindex = input.nextInt();
        			Checkindex(checkindex);
        		default:
        			System.out.println("This is nod a valid option");
        			run();
        		}	
        		
            };
            
            static void Checkindex(int indexnum) {
            	
        	};
            
            static void Update(int updatenum) {
        		String index;
        		index = numarray.toString(); 
        		if (index == numarray.length)  {
        			numarray[index] = updatenum;
        			System.out.println("your number has been added to index " + index);
        			Foo();
        		}
        		
        	};
        	
        	static void Check(int num) {
        		int checkarray = numarray.length;
        		if (num > checkarray) {
        			System.out.println("too big of a number");
        			Foo();
        		}
        		else if (num > 0) {
        			for (i = 0; i != num; i++) {
        				System.out.println("searching...");
        			}
        			System.out.println("your number " + i + " is at index " + (i-1));
        			Foo();
        		}
        		else {
        			System.out.println("ERORR Number \n Please try again");
        			Foo();
        		}
        	};
        };
        r.run();
    }
    
    public static void main(String[] args) {
    	Foo();
	}
}
