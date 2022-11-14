package excercise;

import java.util.Scanner;
import java.math.*;
public class poker {
	
	interface runInterface {
        void run();
    }

	private static final boolean True = false;
	private static final boolean False = false;
	/* hand, position and action dictionaries */
	static String[] cards = {"A","K","Q","J","10","9","8","7","6","5","4","3","2"};
	static String[] suits = {"♦", "♣", "♠", "♥"};
	static String[] position = {"UTG", "SB", "BB", "Middle", "Late"};
	static String[] oponents = {"Fold", "Raise", "Call", };
	/* Hand Table */
	static String[] early_suited_pair = {
	"A-A", "A-K", "A-Q", "A-J", "A-10", 
	"K-K", "K-Q", "K-J", "K-10",
	"Q-Q", "Q-J", "Q-10",
	"J-J", "J-10", "J-9",
	"10-10", "10-9", "9-9", "8-8", "7-7"
	};
	static String[] early_unsuited = {
	"A-K", "A-Q", "A-J", "A-10", 
	"K-Q", "K-J"
	};

	static String[] middle_suited_pair = {
	"A-A", "A-K", "A-Q", "A-J", "A-10", "A-9", "A-8", "A-7", "A-6",
	"K-K", "K-Q", "K-J", "K-10", "K-9",
	"Q-Q", "Q-J", "Q-10", "Q-9","Q-8",
	"J-J", "J-10", "J-9", "J-8",
	"10-10", "10-9", "10-8",
	"9-8",
	"9-9", "8-8", "7-7", "6-6", "5-5"
	};
	static String[] middle_unsuited = {
	"A-K", "A-Q", "A-J", "A-10", 
	"K-K", "K-Q", "K-10",
	"Q-J", "Q-10",
	"J-10"
	};
	
	static String[] late_suited_pair = {
	"A-A", "A-K", "A-Q", "A-J", "A-10", "A-9", "A-8", "A-7", "A-6", "A-5", "A-4", "A-3", "A-2",
	"K-K", "K-Q", "K-J", "K-10", "K-9", "K-8", "K-7", "K-6", "K-5", "K-4", "K-3", "K-2",
	"Q-Q", "Q-J", "Q-10", "Q-9", "Q-8",
	"J-J", "J-10", "J-9", "J-8", "J-7",
	"10-9", "10-8", "10-7",
	"9-8", "9-7", "9-6",
	"8-7", "8-6",
	"7-6", "7-5",
	"6-5",
	"5-4",
	"10-10", "9-9", "8-8", "7-7", "6-6", "5-5", "4-4", "3-3", "2-2"
	};
	static String[] late_unsuited = {
	"A-K", "A-Q", "A-J", "A-10", "A-9", "A-8", "A-7",
	"K-Q", "K-10", "K-9",
	"Q-J", "Q-10", "Q-9",
	"J-10", "J-9", "J-8",
	"10-9", "10-8",
	"9-8", "9-7",
	"8-7",
	};
	
	

	/* Hand generator and main game function*/
	
	public void hand(){
		/*number Generator for picking a hand*/
	    int picker1 = (int)(Math.random() * 13);
	    int picker2 =(int)(Math.random() * 13);
	    int suit_picker1 = (int)(Math.random() * 4);
	    int suit_picker2 = (int)(Math.random() * 4);
	    
	    /*hand output*/
	    String hand = cards[picker1] + suits[suit_picker1] + "-" + cards[picker2] + suits[suit_picker2];
	    System.out.println("Your hand is: " + hand);
	    /*storing a separate hand value for easier comparison in the program*/
	    
	    
	    /*position output*/
	    int position_picker = (int)(Math.random() * 5);
	    String table_position = position[position_picker];
	    System.out.println("You are: " + table_position);
	    
	    /*opponent output*/
	    int oponent = (int)(Math.random() * 3);
	    String oponent_decision = oponents[oponent];
	    System.out.println("Your oponent chose to: " + oponent_decision);
	    
	    /*checking if the cards are suited to set a boolean for later comparison*/
	    if (suits[suit_picker1] == suits[suit_picker2]) {
	    	System.out.println("your suited");
	    	boolean suited = True;
	    }else {
	    	boolean suited = False;
	    }
	  
	    
	 /*switch statement for seat position*/  
	 switch(table_position) {
	 /*Case of sitting in UTG position*/
	 case "UTG":
		 boolean inside;
		 Scanner input = new Scanner(System.in);
		 String hand_program = cards[picker1] + "-" + cards[picker2];
	        if (oponent_decision == "Fold"){
		        for (int i = 0; i <  early_suited_pair.length; i ++) {
		        	if (early_suited_pair[i] == hand_program) {
		        		inside = True;
		        	}
		        	else {
		        		inside = False;
		        	}
			     if (inside) {
			    	 System.out.println("What do you want to do?: \n fold \n call \n raise ");
				     String choice_input = input.next();
			    	 if (choice_input == "call") {
			    		 System.out.println("Good Choice!");
			    	 }else if (choice_input == "raise") {
			    		 System.out.println("Good Choice!");
			    	 }else {
			    		 System.out.println("Sorry you are wrong");
			    	 }
			    	 
			     }else {
			    	 System.out.println("What do you want to do?: \n fold \n call \n raise ");
				     String choice_input = input.next();
			    	 if (choice_input == "call") {
			    		 System.out.println("Sorry you are wrong");
			    	 }else if (choice_input == "raise") {
			    		 System.out.println("Sorry you are wrong");
			    	 }else {
			    		 System.out.println("Good Choice!");
			    	 }
			     	};
			        };
	        }else if (oponent_decision == "Raise"){
	        	for (int i = 0; i <  early_suited_pair.length; i ++) {
		        	if (early_suited_pair[i] == hand_program) {
		        		inside = True;
		        	}
		        	else {
		        		inside = False;
		        	}
			     if (inside) {
			    	 System.out.println("What do you want to do?: \n fold \n call \n raise ");
				     String choice_input = input.next();
			    	 if (choice_input == "call") {
			    		 System.out.println("Good Choice!");
			    	 }else if (choice_input == "raise") {
			    		 System.out.println("Good Choice!");
			    	 }else {
			    		 System.out.println("Sorry you are wrong");
			    	 }
			    	 
			     }else {
			    	 System.out.println("What do you want to do?: \n fold \n call \n raise ");
				     String choice_input = input.next();
			    	 if (choice_input == "call") {
			    		 System.out.println("Sorry you are wrong");
			    	 }else if (choice_input == "raise") {
			    		 System.out.println("Sorry you are wrong");
			    	 }else {
			    		 System.out.println("Good Choice!");
			    	 }
			     	};
			        };
	        }else{
	        	for (int i = 0; i <  early_suited_pair.length; i ++) {
		        	if (early_suited_pair[i] == hand_program) {
		        		inside = True;
		        	}
		        	else {
		        		inside = False;
		        	}
			     if (inside) {
			    	 System.out.println("What do you want to do?: \n fold \n call \n raise ");
				     String choice_input = input.next();
			    	 if (choice_input == "call") {
			    		 System.out.println("Good Choice!");
			    	 }else if (choice_input == "raise") {
			    		 System.out.println("Good Choice!");
			    	 }else {
			    		 System.out.println("Sorry you are wrong");
			    	 }
			    	 
			     }else {
			    	 System.out.println("What do you want to do?: \n fold \n call \n raise ");
				     String choice_input = input.next();
			    	 if (choice_input == "call") {
			    		 System.out.println("Sorry you are wrong");
			    	 }else if (choice_input == "raise") {
			    		 System.out.println("Sorry you are wrong");
			    	 }else {
			    		 System.out.println("Good Choice!");
			    	 }
			     	};
			        };
	        }
	        
	 /*Case of sitting in SB position*/       
	 case "SB": 
		 boolean inside1;
		 Scanner input1 = new Scanner(System.in);
		 String hand_program1 = cards[picker1] + "-" + cards[picker2];
	        if (oponent_decision == "Fold"){
		        for (int i = 0; i <  early_suited_pair.length; i ++) {
		        	if (early_suited_pair[i] == hand_program1) {
		        		inside1 = True;
		        	}
		        	else {
		        		inside1 = False;
		        	}
			     if (inside1) {
			    	 System.out.println("What do you want to do?: \n fold \n call \n raise ");
				     String choice_input = input1.next();
			    	 if (choice_input == "call") {
			    		 System.out.println("Good Choice!");
			    	 }else if (choice_input == "raise") {
			    		 System.out.println("Good Choice!");
			    	 }else {
			    		 System.out.println("Sorry you are wrong");
			    	 }
			    	 
			     }else {
			    	 System.out.println("What do you want to do?: \n fold \n call \n raise ");
				     String choice_input = input1.next();
			    	 if (choice_input == "call") {
			    		 System.out.println("Sorry you are wrong");
			    	 }else if (choice_input == "raise") {
			    		 System.out.println("Sorry you are wrong");
			    	 }else {
			    		 System.out.println("Good Choice!");
			    	 }
			     	};
			        };
	        }else if (oponent_decision == "Raise"){
	        	for (int i = 0; i <  early_suited_pair.length; i ++) {
		        	if (early_suited_pair[i] == hand_program1) {
		        		inside1 = True;
		        	}
		        	else {
		        		inside1 = False;
		        	}
			     if (inside1) {
			    	 System.out.println("What do you want to do?: \n fold \n call \n raise ");
				     String choice_input = input1.next();
			    	 if (choice_input == "call") {
			    		 System.out.println("Good Choice!");
			    	 }else if (choice_input == "raise") {
			    		 System.out.println("Good Choice!");
			    	 }else {
			    		 System.out.println("Sorry you are wrong");
			    	 }
			    	 
			     }else {
			    	 System.out.println("What do you want to do?: \n fold \n call \n raise ");
				     String choice_input = input1.next();
			    	 if (choice_input == "call") {
			    		 System.out.println("Sorry you are wrong");
			    	 }else if (choice_input == "raise") {
			    		 System.out.println("Sorry you are wrong");
			    	 }else {
			    		 System.out.println("Good Choice!");
			    	 }
			     	};
			        };
	        }else{
	        	for (int i = 0; i <  early_suited_pair.length; i ++) {
		        	if (early_suited_pair[i] == hand_program1) {
		        		inside1 = True;
		        	}
		        	else {
		        		inside1 = False;
		        	}
			     if (inside1) {
			    	 System.out.println("What do you want to do?: \n fold \n call \n raise ");
				     String choice_input = input1.next();
			    	 if (choice_input == "call") {
			    		 System.out.println("Good Choice!");
			    	 }else if (choice_input == "raise") {
			    		 System.out.println("Good Choice!");
			    	 }else {
			    		 System.out.println("Sorry you are wrong");
			    	 }
			    	 
			     }else {
			    	 System.out.println("What do you want to do?: \n fold \n call \n raise ");
				     String choice_input = input1.next();
			    	 if (choice_input == "call") {
			    		 System.out.println("Sorry you are wrong");
			    	 }else if (choice_input == "raise") {
			    		 System.out.println("Sorry you are wrong");
			    	 }else {
			    		 System.out.println("Good Choice!");
			    	 }
			     	};
			        };
	        }
	 /*Case of sitting in BB position*/
	 case "BB":
		 boolean inside2;
		 Scanner input2 = new Scanner(System.in);
		 String hand_program2 = cards[picker1] + "-" + cards[picker2];
	        if (oponent_decision == "Fold"){
		        for (int i = 0; i <  early_suited_pair.length; i ++) {
		        	if (early_suited_pair[i] == hand_program2) {
		        		inside2 = True;
		        	}
		        	else {
		        		inside2 = False;
		        	}
			     if (inside2) {
			    	 System.out.println("What do you want to do?: \n fold \n call \n raise ");
				     String choice_input = input2.next();
			    	 if (choice_input == "call") {
			    		 System.out.println("Good Choice!");
			    	 }else if (choice_input == "raise") {
			    		 System.out.println("Good Choice!");
			    	 }else {
			    		 System.out.println("Sorry you are wrong");
			    	 }
			    	 
			     }else {
			    	 System.out.println("What do you want to do?: \n fold \n call \n raise ");
				     String choice_input = input2.next();
			    	 if (choice_input == "call") {
			    		 System.out.println("Sorry you are wrong");
			    	 }else if (choice_input == "raise") {
			    		 System.out.println("Sorry you are wrong");
			    	 }else {
			    		 System.out.println("Good Choice!");
			    	 }
			     	};
			        };
	        }else if (oponent_decision == "Raise"){
	        	for (int i = 0; i <  early_suited_pair.length; i ++) {
		        	if (early_suited_pair[i] == hand_program2) {
		        		inside2 = True;
		        	}
		        	else {
		        		inside2 = False;
		        	}
			     if (inside2) {
			    	 System.out.println("What do you want to do?: \n fold \n call \n raise ");
				     String choice_input = input2.next();
			    	 if (choice_input == "call") {
			    		 System.out.println("Good Choice!");
			    	 }else if (choice_input == "raise") {
			    		 System.out.println("Good Choice!");
			    	 }else {
			    		 System.out.println("Sorry you are wrong");
			    	 }
			    	 
			     }else {
			    	 System.out.println("What do you want to do?: \n fold \n call \n raise ");
				     String choice_input = input2.next();
			    	 if (choice_input == "call") {
			    		 System.out.println("Sorry you are wrong");
			    	 }else if (choice_input == "raise") {
			    		 System.out.println("Sorry you are wrong");
			    	 }else {
			    		 System.out.println("Good Choice!");
			    	 }
			     	};
			        };
	        }else{
	        	for (int i = 0; i <  early_suited_pair.length; i ++) {
		        	if (early_suited_pair[i] == hand_program2) {
		        		inside2 = True;
		        	}
		        	else {
		        		inside2 = False;
		        	}
			     if (inside2) {
			    	 System.out.println("What do you want to do?: \n fold \n call \n raise ");
				     String choice_input = input2.next();
			    	 if (choice_input == "call") {
			    		 System.out.println("Good Choice!");
			    	 }else if (choice_input == "raise") {
			    		 System.out.println("Good Choice!");
			    	 }else {
			    		 System.out.println("Sorry you are wrong");
			    	 }
			    	 
			     }else {
			    	 System.out.println("What do you want to do?: \n fold \n call \n raise ");
				     String choice_input = input2.next();
			    	 if (choice_input == "call") {
			    		 System.out.println("Sorry you are wrong");
			    	 }else if (choice_input == "raise") {
			    		 System.out.println("Sorry you are wrong");
			    	 }else {
			    		 System.out.println("Good Choice!");
			    	 }
			     	};
			        };
	        }
	 /*Case of sitting in middle position*/
	 case "Middle":
		 boolean inside3;
		 Scanner input3 = new Scanner(System.in);
		 String hand_program3 = cards[picker1] + "-" + cards[picker2];
	        if (oponent_decision == "Fold"){
		        for (int i = 0; i <  early_suited_pair.length; i ++) {
		        	if (early_suited_pair[i] == hand_program3) {
		        		inside3 = True;
		        	}
		        	else {
		        		inside3 = False;
		        	}
			     if (inside3) {
			    	 System.out.println("What do you want to do?: \n fold \n call \n raise ");
				     String choice_input = input3.next();
			    	 if (choice_input == "call") {
			    		 System.out.println("Good Choice!");
			    	 }else if (choice_input == "raise") {
			    		 System.out.println("Good Choice!");
			    	 }else {
			    		 System.out.println("Sorry you are wrong");
			    	 }
			    	 
			     }else {
			    	 System.out.println("What do you want to do?: \n fold \n call \n raise ");
				     String choice_input = input3.next();
			    	 if (choice_input == "call") {
			    		 System.out.println("Sorry you are wrong");
			    	 }else if (choice_input == "raise") {
			    		 System.out.println("Sorry you are wrong");
			    	 }else {
			    		 System.out.println("Good Choice!");
			    	 }
			     	};
			        };
	        }else if (oponent_decision == "Raise"){
	        	for (int i = 0; i <  early_suited_pair.length; i ++) {
		        	if (early_suited_pair[i] == hand_program3) {
		        		inside3 = True;
		        	}
		        	else {
		        		inside3 = False;
		        	}
			     if (inside3) {
			    	 System.out.println("What do you want to do?: \n fold \n call \n raise ");
				     String choice_input = input3.next();
			    	 if (choice_input == "call") {
			    		 System.out.println("Good Choice!");
			    	 }else if (choice_input == "raise") {
			    		 System.out.println("Good Choice!");
			    	 }else {
			    		 System.out.println("Sorry you are wrong");
			    	 }
			    	 
			     }else {
			    	 System.out.println("What do you want to do?: \n fold \n call \n raise ");
				     String choice_input = input3.next();
			    	 if (choice_input == "call") {
			    		 System.out.println("Sorry you are wrong");
			    	 }else if (choice_input == "raise") {
			    		 System.out.println("Sorry you are wrong");
			    	 }else {
			    		 System.out.println("Good Choice!");
			    	 }
			     	};
			        };
	        }else{
	        	for (int i = 0; i <  early_suited_pair.length; i ++) {
		        	if (early_suited_pair[i] == hand_program3) {
		        		inside3 = True;
		        	}
		        	else {
		        		inside3 = False;
		        	}
			     if (inside3) {
			    	 System.out.println("What do you want to do?: \n fold \n call \n raise ");
				     String choice_input = input3.next();
			    	 if (choice_input == "call") {
			    		 System.out.println("Good Choice!");
			    	 }else if (choice_input == "raise") {
			    		 System.out.println("Good Choice!");
			    	 }else {
			    		 System.out.println("Sorry you are wrong");
			    	 }
			    	 
			     }else {
			    	 System.out.println("What do you want to do?: \n fold \n call \n raise ");
				     String choice_input = input3.next();
			    	 if (choice_input == "call") {
			    		 System.out.println("Sorry you are wrong");
			    	 }else if (choice_input == "raise") {
			    		 System.out.println("Sorry you are wrong");
			    	 }else {
			    		 System.out.println("Good Choice!");
			    	 }
			     	};
			        };
	        }
	 /*Case of sitting in late position*/
	 case "Late":
		 boolean inside4;
		 Scanner input4 = new Scanner(System.in);
		 String hand_program4 = cards[picker1] + "-" + cards[picker2];
	        if (oponent_decision == "Fold"){
		        for (int i = 0; i <  early_suited_pair.length; i ++) {
		        	if (early_suited_pair[i] == hand_program4) {
		        		inside4 = True;
		        	}
		        	else {
		        		inside4 = False;
		        	}
			     if (inside4) {
			    	 System.out.println("What do you want to do?: \n fold \n call \n raise ");
				     String choice_input = input4.next();
			    	 if (choice_input == "call") {
			    		 System.out.println("Good Choice!");
			    	 }else if (choice_input == "raise") {
			    		 System.out.println("Good Choice!");
			    	 }else {
			    		 System.out.println("Sorry you are wrong");
			    	 }
			    	 
			     }else {
			    	 System.out.println("What do you want to do?: \n fold \n call \n raise ");
				     String choice_input = input4.next();
			    	 if (choice_input == "call") {
			    		 System.out.println("Sorry you are wrong");
			    	 }else if (choice_input == "raise") {
			    		 System.out.println("Sorry you are wrong");
			    	 }else {
			    		 System.out.println("Good Choice!");
			    	 }
			     	};
			        };
	        }else if (oponent_decision == "Raise"){
	        	for (int i = 0; i <  early_suited_pair.length; i ++) {
		        	if (early_suited_pair[i] == hand_program4) {
		        		inside4 = True;
		        	}
		        	else {
		        		inside4 = False;
		        	}
			     if (inside4) {
			    	 System.out.println("What do you want to do?: \n fold \n call \n raise ");
				     String choice_input = input4.next();
			    	 if (choice_input == "call") {
			    		 System.out.println("Good Choice!");
			    	 }else if (choice_input == "raise") {
			    		 System.out.println("Good Choice!");
			    	 }else {
			    		 System.out.println("Sorry you are wrong");
			    	 }
			    	 
			     }else {
			    	 System.out.println("What do you want to do?: \n fold \n call \n raise ");
				     String choice_input = input4.next();
			    	 if (choice_input == "call") {
			    		 System.out.println("Sorry you are wrong");
			    	 }else if (choice_input == "raise") {
			    		 System.out.println("Sorry you are wrong");
			    	 }else {
			    		 System.out.println("Good Choice!");
			    	 }
			     	};
			        };
	        }else{
	        	for (int i = 0; i <  early_suited_pair.length; i ++) {
		        	if (early_suited_pair[i] == hand_program4) {
		        		inside4 = True;
		        	}
		        	else {
		        		inside4 = False;
		        	}
			     if (inside4) {
			    	 System.out.println("What do you want to do?: \n fold \n call \n raise ");
				     String choice_input = input4.next();
			    	 if (choice_input == "call") {
			    		 System.out.println("Good Choice!");
			    	 }else if (choice_input == "raise") {
			    		 System.out.println("Good Choice!");
			    	 }else {
			    		 System.out.println("Sorry you are wrong");
			    	 }
			    	 
			     }else {
			    	 System.out.println("What do you want to do?: \n fold \n call \n raise ");
				     String choice_input = input4.next();
			    	 if (choice_input == "call") {
			    		 System.out.println("Sorry you are wrong");
			    	 }else if (choice_input == "raise") {
			    		 System.out.println("Sorry you are wrong");
			    	 }else {
			    		 System.out.println("Good Choice!");
			    	 }
			     };
			     };
	        };
	 
	 
}
}
}
