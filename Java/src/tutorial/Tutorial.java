package tutorial;

import java.util.Scanner; // imports Scanner packet 
import java.math.BigDecimal;

public class Tutorial{

	public static final double PI = 3.14159;

	public static void main(String[] args) { // method
		
		//System.out.println("Hello " + args[0]); // says hello + input out of args
		// The top is a not so good way to take user input, bc if there is none --> ERROR
		
		// asking for name
		System.out.println("What is your name? ");
		
		// type identifier = new type(); - this is an object
		Scanner scanner /* variable scanner */ = new Scanner(System.in);
		// using Scanner object to get a new line
		// not static - for the nextLine there has to be a object created for it
		String name = scanner.nextLine();
		
		// printing out the nextLine from scanner
		System.out.println("Hello " + name);
		// String with a string assigned to a variable
		String string = new String("This is a string");
		// easier way to assign a string value
		String easier = "easier String" /*literal*/ + " :) " + string ; 
		System.out.println(string + " :) ");
		System.out.println(easier);
		static String hello = "Hello"
		
		
		
		
		/////////////////////	 BASICS 	/////////////////////////////
		
		
		
		//
		//*** DATA 
		//
		
		// In Java you have to tell what the data type should be = statically typed language
		
		// primitive 
		// boolean, byte, char, short, int, long, float, double
		
		// variables can be declared first and then given a value
		int numpre;
		numpre = 5;
			
		// constant 
		final int Y /* Capital used for transparency */ = 5;
		// constants can't be reassigned 
		// variables can also be assigned outside of this method (Line 5)
		
		// for usage in the same class it can be called normal
		// in another class - use the name of the class its in and .variable
		// exp. Tutorial.PI
		
		
		// data type examples
		int myNum = 5;               // Integer (whole number)
		float myFloatNum = 5.99f;    // Floating point number
		char myLetter = 'D';         // Character
		boolean myBool = true;       // Boolean
		String myText = "Hello";     // String (but an object!!)
		double myDouble = 20.5;		 // Double
		short myShort = -12;		 // Short
		long myLong = 3527285;		 // Long
		byte myByte = 127;			 // Byte (10110110)
		
		/* Data information
		Data Type	Size		Description
		byte		1 byte		Stores whole numbers from -128 to 127
		short		2 bytes		Stores whole numbers from -32,768 to 32,767
		int			4 bytes		Stores whole numbers from -2,147,483,648 to 2,147,483,647
		long		8 bytes		Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
		float		4 bytes		Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
		double		8 bytes		Stores fractional numbers. Sufficient for storing 15 decimal digits
		boolean		1 bit		Stores true or false values
		char		2 bytes		Stores a single character/letter or ASCII values
		*/

		
		// objects - instance of a class (class is the data type)
		String stringdata = "String data";
		System.out.println(stringdata);
		// --> These classes can be created and objects types are theoretically infinite
		
		// Type Casting
		/*
		Widening Casting (automatically) - converting a smaller type to a larger type size
		byte -> short -> char -> int -> long -> float -> double

		Narrowing Casting (manually) - converting a larger type to a smaller size type
		double -> float -> long -> int -> char -> short -> byte
		*/
		
		// example
		int myInt = 9;
	    double myDouble1 = myInt; // Automatic casting: int to double

	    System.out.println(myInt);      // Outputs 9
	    System.out.println(myDouble1);   // Outputs 9.0
	    
	    // Operators
	    /*
	     
	    Operator	Name	    	Description								Example	
		+			Addition		Adds together two values				x + y	
		-			Subtraction		Subtracts one value from another		x - y	
		*			Multiplication	Multiplies two values					x * y	
		/			Division		Divides one value by another			x / y	
		%			Modulus			Returns the division remainder			x % y	
		++			Increment		Increases the value of a variable by 1	++x	
		--			Decrement		Decreases the value of a variable by 1	--x
	    
	    */
		
	    //** String Methods
	    String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	    System.out.println("The length of the txt string is: " + txt.length());
	    
	    String txt2 = "Hello World";
	    System.out.println(txt.toUpperCase());   // Outputs "HELLO WORLD"
	    System.out.println(txt.toLowerCase());   // Outputs "hello world"
	    
	    String txt3 = "Please locate where 'locate' occurs!";
	    System.out.println(txt.indexOf("locate")); // Outputs index of the parsed input: 7
	    // indexes: 0 1 2 3 ...
	    
	    // Concatenating Strings
	    String firstName = "John ";
	    String lastName = "Doe";
	    System.out.println(firstName.concat(lastName));
	    
	    // Special characters
	    
	    /*
	    
	    Escape character	Result	
		\'					'	
		\"					"	
		\\					\
		Code				Result	
		\n					New Line	
		\r					Carriage Return	
		\t					Tab	
		\b					Backspace	
		\f					Form Feed
		
	     */
	    
	    //
	    //*** JAVA MATH
	    //
	    
	    Math.max(5, 10); // check which is the maximum number
	    /*--> Print*/ System.out.println(Math.max(5, 10));
	    
	    // can also be use with variables
	    int numberhigh = 10;
	    int numberlow = 5;
	    System.out.println(Math.max(numberhigh, numberlow));
	    
	    Math.min(5, 10); // Checks minimum number
	    /*--> Print*/ System.out.println(Math.min(5, 10));
	    
	    // can also be use with variables
	    int numberhigh1 = 10;
	    int numberlow1 = 5;
	    System.out.println(Math.min(numberhigh1, numberlow1));
	    
	    // Squareroot
	    Math.sqrt(64);
	    
	    // returns absolute positive value of number/variable in ()
	    Math.abs(-4.7);
	    
	    // random number
	    Math.random();
	    
	    // random number controlled in a specific range
	    int randomNum = (int)(Math.random() * 101);  // 0 to 100
	    
	    // ^ all these can be used in variables, objects and System.out
	    
	    // comparisons
	    // Just like any other languages:
	    // < > == =! <= >=
	    
	    //
	    //*** IF AND ELSE + Switch
	    //
	    
	    /*
	     * 
	    Use if to specify a block of code to be executed, if a specified condition is true
		Use else to specify a block of code to be executed, if the same condition is false
		Use else if to specify a new condition to test, if the first condition is false
		Use switch to specify many alternative blocks of code to be executed
		
	     */
	    
	    // Syntax
	    /* 
	    
	   if (condition) {
	   	  // block of code to be executed if the condition is true
	   }
	   
	   if (condition) {
		  // block of code to be executed if the condition is true
		} else {
		  // block of code to be executed if the condition is false
		}
	    
	    
	    if (condition1) {
		  // block of code to be executed if condition1 is true
		} else if (condition2) {
		  // block of code to be executed if the condition1 is false and condition2 is true
		} else {
		  // block of code to be executed if the condition1 is false and condition2 is false
		}
		
		Short hand expression
		
		variable = (condition) ? expressionTrue :  expressionFalse;
		
	   */
	    
	   // Switch
	    
	   // Use the switch statement to select one of many code blocks to be executed.
	    
	   /*
	    
	   switch(expression) {
		  case x:
		    // code block
		    break;
		  case y:
		    // code block
		    break;
		  default:
		    // code block
		}
		
		This is how it works:

		The switch expression is evaluated once.
		The value of the expression is compared with the values of each case.
		If there is a match, the associated block of code is executed.
		The break and default keywords are optional, and will be described later in this chapter
	    */
	    
	    int day = 4;
		switch (day) {
		  case 1:
		    System.out.println("Monday");
		    break;
		  case 2:
		    System.out.println("Tuesday");
		    break;
		  case 3:
		    System.out.println("Wednesday");
		    break;
		  case 4:
		    System.out.println("Thursday");
		    break;
		  case 5:
		    System.out.println("Friday");
		    break;
		  case 6:
		    System.out.println("Saturday");
		    break;
		  case 7:
		    System.out.println("Sunday");
		    break;
		}
		
		// Outputs "Thursday" (day 4)
		 /*
		 * The default keyword specifies some code to run if there is no case match:
		  */
	    
		 int day2 = 4;
		 switch (day) {
		   case 6:
		     System.out.println("Today is Saturday");
		     break;
		   case 7:
		     System.out.println("Today is Sunday");
		     break;
		   default:
		     System.out.println("Looking forward to the Weekend");
		 }
		 // Outputs "Looking forward to the Weekend"
	    
	    
	    
	    //
	    // ** WHILE
	    //
	    
		 /* Syntax
		
	    while (condition) {
	    	  // code block to be executed
	    }
	    
	    */
		// Example
		int i = 0;
		while (i < 5) {
			System.out.println(i);
			i++;
		}
		
		// ** Do While
		
		/*
		
		The do/while loop is a variant of the while loop. 
		This loop will execute the code block once, before checking if the condition is true,
		then it will repeat the loop as long as the condition is true.
		
		*/
		
		/* Syntax 
		
		do {
		  // code block to be executed
		}
		while (condition);
		
		*/
		
		// Example
		int i2 = 0;
		do {
		  System.out.println(i);
		  i2++;
		}
		while (i2 < 5);
		
		
		//
		// ** FOR LOOP	
		//
		
		
		/* Syntax
	
		for (statement 1; statement 2; statement 3) {
		  // code block to be executed
		}
		
		Statement 1 is executed (one time) before the execution of the code block.

		Statement 2 defines the condition for executing the code block.
		
		Statement 3 is executed (every time) after the code block has been executed.
				 
		*/
		
		// Example
		for (int i3 = 0; i3 < 5; i3++) {
			  System.out.println(i3);
		}
	    // prints numbers 0 to 4
		
		// FOR EACH
		// There is also a "for-each" loop, 
		// which is used exclusively to loop through elements in an array:
		
		/* 	Syntax
		 
		for (type variableName : arrayName) {
  		// code block to be executed
		}
		
		*/
		
		// Example
		// The following example outputs all elements in the cars array, using a "for-each" loop
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		for (String i4 : cars) {
		  System.out.println(i4);
		}
		
		// Break / Continue
		
		// BREAK
	    // You have already seen the break statement used in an earlier chapter of this tutorial. 
		// It was used to "jump out" of a switch statement.
		// The break statement can also be used to jump out of a loop.		
		// This example stops the loop when i is equal to 4:
		
		for (int i5 = 0; i5 < 10; i5++) {
			  if (i5 == 4) {
			    break; // stops loop is i5 == 4
			  }
			  System.out.println(i5);
			}
		
		// CONTINUE
	    // The continue statement breaks one iteration (in the loop), 
		// if a specified condition occurs, and continues with the next iteration in the loop.
		// This example skips the value of 4:
		for (int i6 = 0; i6 < 10; i++) {
			if (i6 == 4) {
				continue;
			}
			System.out.println(i6);
		}
		
		//
		//*** ARRAYS
		//
		
		// Arrays are used to store multiple values in a single variable, 
		// instead of declaring separate variables for each value.
		
		// defining
		
		String[] cars1;
		
		// inserting Values
		
		String[] cars2 = {"Volvo", "BMW", "Ford", "Mazda"};
		
		// can also be used with other data types
		
		int[] arrayNum = {10, 15, 20, 25};
		
		// Accessing elements in Array
		String[] carsindex = {"Volvo", "BMW", "Ford", "Mazda"};
		System.out.println(carsindex[0]);
		// Outputs Volvo
		// index counting: 0 1 2 3 4 ...
		
		// Change specific element
		carsindex[0] = "Opel";
		
		// Array length
		System.out.println(cars.length);
		// Outputs 4
		
		// looping through Array
		for (int ic = 0; ic < cars.length; ic++) {
			  System.out.println(cars[ic]);
		}
		
		// looping through with for each
		for (String ic1 : cars) {
			  System.out.println(ic1);
		}
		
		// Multidimensional Array
		int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
		// Choosing multidimensional index
		int x = myNumbers[1][2];
		System.out.println(x); // Outputs 7
		
		// looping through
		for (int il = 0; il < myNumbers.length; ++il) { // loops through elements in array
		      for(int jl = 0; jl < myNumbers[il].length; ++jl) { // loops through literals in elements
		        System.out.println(myNumbers[il][jl]);
		      }
		}
		
		
		
		/////////////////////	 METHODS 	/////////////////////////////
		
		// A method must be declared within a class. It is defined with the name of the method, 
		// followed by parentheses (). Java provides some pre-defined methods, such as System.out.println(), 
		// but you can also create your own methods to perform certain actions:
		
		// EXAMPLE
		/*
		
		public class Main {
			 static void myMethod() {
				 // code to be executed
			 }
		}
		
		*/
		
		// Calling a method
		
		// Example
		/*
		
		public class Main {
			 static void myMethod() {
			   System.out.println("I just got executed!");
			 }

			 public static void main(String[] args) {
			   myMethod();
			 }
		}

		// Outputs "I just got executed!"
		 * Method can also be called multiple times:
		public class Main {
		  static void myMethod() {
		    System.out.println("I just got executed!");
		  }
		
		  public static void main(String[] args) {
		    myMethod();
		    myMethod();
		    myMethod();
		  }
		}
		// Prints:
		// I just got executed!
		// I just got executed!
		// I just got executed!

		
		*/
		// SNEAKY TRICK: METHODS INSIDE METHODS:
		class GFG {
			  
		    // create a local interface with one abstract
		    // method run()
		    interface myInterface {
		        void run();
		    }
		  
		    // function have implements another function run()
		    static void Foo()
		    {
		        // implement run method inside Foo() function
		        myInterface r = new myInterface() {
		            public void run()
		            {
		                System.out.println("geeksforgeeks");
		            };
		        };
		        r.run();
		    }
		    public static void main(String[] args)
		    {
		        Foo();
		    }
		}
		
		//** Parameters
		/*
		
		Information can be passed to methods as parameter. Parameters act as variables inside the method.
		Parameters are specified after the method name, inside the parentheses. 
		You can add as many parameters as you want, just separate them with a comma.
		
		*/
		
		class Main1 {
		  static void myMethod(String fname) {
		    System.out.println(fname + " Refsnes");
		  }
		
		  public static void main(String[] args) {
		    myMethod("Liam");
		    myMethod("Jenny");
		    myMethod("Anja");
		  }
		}
		// Liam Refsnes
		// Jenny Refsnes
		// Anja Refsnes
		
		// You can have as many parameters as you like:
		
		 class Main2 {
			static void myMethod(String fname, int age) {
				System.out.println(fname + "is" + age);
			}
			
			public static void main(String[] args) {
				myMethod("Liam", 5);
				myMethod("Jenny", 25);
				myMethod("Anja", 31);
			}
		}
		
		// Liam is 5
		// Jenny is 25
		// Anja is 35
		
		// Return Values
		// The void keyword, used in the examples above, indicates that the method should not return a value.
		// If you want the method to return a value, you can use a primitive data type (such as int, char, etc.)
		// instead of void, and use the return keyword inside the method:
		class Maine {
			static int myMethod(int x) {
				return 5 + x;
			}
			
			public static void main(String[] args) {
				System.out.println(myMethod(3));
			}
			
		}
		
		// Outputs 8 (5 + 3)
		// also here can multiple parameters be used
		
		// storing method return in variable
		
		class Main3 {
			 static int myMethod(int x, int y) {
			   return x + y;
			 }

			 public static void main(String[] args) {
			   int z = myMethod(5, 3);
			   System.out.println(z);
			 }
		}	 
		}
	private Scanner scanner;
		// Outputs 8 (5 + 3) 
		// The variables from the methods can be use in if els and all types of loops. its just data in a variable
		
		//** METHOD OVERLOADING
		// With method overloading, multiple methods can have the same name with different parameters:
		
		int myMethod(int x) {
		}
		float myMethod(float x) {
			if ()
		}
		
		
		double myMethod(double x, double y) {
		}
		
		//** SCOPES
		// In Java, variables are only accessible inside the region they are created. This is called scope.
		
		// Variables declared directly inside a method are available anywhere 
		// in the method following the line of code in which they were declared:
		public class Main {
			  public static void main(String[] args) {

			    // Code here CANNOT use x

			    int x = 100;

			    // Code here can use x
			    System.out.println(x);
			  }
			}
		
		//** BLOCK SCOPE
		//A block of code refers to all of the code between curly braces {}. 
		//Variables declared inside blocks of code are only accessible by the code between the curly braces, 
		// which follows the line in which the variable was declared:
		
		public class Main4 {
			  public static void main(String[] args) {

			    // Code here CANNOT use x

			    { // This is a block

			      // Code here CANNOT use x

			      int x = 100;

			      // Code here CAN use x
			      System.out.println(x);

			   } // The block ends here

			  // Code here CANNOT use x

			  }
			}
		
		//** RECURSION
		// Recursion enables you to make a function call itself. This technique is way to 
		// make complicated problems way easier. 
		// Recursion is a little bit hard to grasp but best practice is to experiment.
		
		// Example
		// Adding two numbers together is easy to do, but adding a range of numbers is more complicated. 
		//In the following example, recursion is used to add a range of numbers together 
		// by breaking it down into the simple task of adding two numbers:
		
		public class Main5 {
			  public static void main(String[] args) {
			    int result = sum(10);
			    System.out.println(result);
			  }
			  public static int sum(int k) {
			    if (k > 0) {
			      return k + sum(k - 1);
			    } else {
			      return 0;
			    }
			  }
			}
		/*
		Example Explained
		When the sum() function is called, it adds parameter k to the sum of all numbers smaller than k and returns the result. 
		When k becomes 0, the function just returns 0. When running, the program follows these steps:

		10 + sum(9)
		10 + ( 9 + sum(8) )
		10 + ( 9 + ( 8 + sum(7) ) )
		...
		10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + sum(0)
		10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + 0
		Since the function does not call itself when k is 0, the program stops there and returns the result.
		*/
		
		// Halting condition
		/*Just as loops can run into the problem of infinite looping, recursive functions can run 
		 * into the problem of infinite recursion. 
		 * Infinite recursion is when the function never stops calling itself. 
		 * Every recursive function should have a halting condition, which is the condition where the function stops calling itself.
		 *  In the previous example, the halting condition is when the parameter k becomes 0.

		It is helpful to see a variety of different examples to better understand the concept. 
		In this example, the function adds a range of numbers between a start and an end. 
		The halting condition for this recursive function is when end is not greater than start:
		
		*/
		
		public class Main6 {
			  public static void main(String[] args) {
			    int result = sum(5, 10);
			    System.out.println(result);
			  }
			  public static int sum(int start, int end) {
			    if (end > start) {
			      return end + sum(start, end - 1);
			    } else {
			      return end;
			    }
			  }
			}
		// for more clarity:
		// in the if statement the return put its values back into the function on top
		// so that a new value of end is now getting checked.
		// Heres is a version where you can see how many iteration the program is going through
		// (can be run in the testing.java file)

		public class testing {
			public static int c = 1;
			
			public static void main(String[] args) {
				int result = sum(5, 10);
				System.out.println(result);
			}
			public static int sum(int start, int end) {
				if (end > start) {
					System.out.println("iteration " + c);
					c++;
					return end + sum(start, end - 1);		
				}else {
					System.out.println("return result");
					return end;
				}
			}
		}
		
		
		
		/////////////////////	 CLASSES 	/////////////////////////////	

		//** OOP
		// OOP stands for Object-Oriented Programming.
		//Procedural programming is about writing procedures or methods that perform operations on the data,
		//while object-oriented programming is about creating objects that contain both data and methods.

		//Object-oriented programming has several advantages over procedural programming:

		//OOP is faster and easier to execute
		//OOP provides a clear structure for the programs
		//OOP helps to keep the Java code DRY "Don't Repeat Yourself", and makes the code easier to maintain, modify and debug
		//OOP makes it possible to create full reusable applications with less code and shorter development time
		//Tip: The "Don't Repeat Yourself" (DRY) principle is about reducing the repetition of code.
		//You should extract out the codes that are common for the application, and place them at a single place and reuse them instead of repeating it.
		
		/* Java - What are Classes and Objects?
				Classes and objects are the two main aspects of object-oriented programming.

				Look at the following illustration to see the difference between class and objects:

				class
				Fruit

				objects
				Apple

				Banana

				Mango

				Another example:

				class
				Car

				objects
				Volvo

				Audi

				Toyota

				So, a class is a template for objects, and an object is an instance of a class.

				When the individual objects are created, they inherit all the variables and methods from the class.

				You will learn much more about classes and objects in the next chapter.
		
		*/
		
		//** Classes and Objects
		
		// Class:
		class Main0{
			int x = 5;
			
			public static void main(String[] args) {
				// Objects :
				Main0 myObj = new Main0(); // object
				System.out.println(myObj.x); 
		
		// You can also make multiple objects of the same class
				Main0 myObj1 = new Main0(); // object
				Main0 myObj2 = new Main0(); // object
				System.out.println(myObj.x); 
			}
		}
		
		// ** Multiple Classes
		// You can also create an object of a class and access it in another class. 
		// This is often used for better organization of classes (one class has all the attributes and methods,
		// while the other class holds the main() method (code to be executed)).

		// Remember that the name of the java file should match the class name. 
		// In this example, we have created two files in the same directory/folder:
		
		// File 1
		class First {
			int x = 5;
		}
		// File 2
		class Second {
			
			public static void main(String[] args) {
				First myObj = new First();
				System.out.println(myObj.x);
			}
		}
		// When both files are compiled and the second is run,
		// the class in the second file accesses the class in the second file.
		// This is mostly used to access the Main class from another file.
		
		// There is also a possibility to access a Method from another Class
		// File 1
		class Main_ {
			public void myMethod() {
				int x = 5;
				System.out.println(x);
			}
					
		}
		// File 2
		class Second_ {
					
			public static void main(String[] args) {
				Main_ myObj = new Main_();
				// calling of the Method
				myObj.myMethod();
			}
		};
		
		
		
		//** Java Class Attributes
		
		
		
		
		
		
		
		
		//
		//*** INPUT DATA FROM USER
		//
		
		// uses an integer as the input Value
		int intinput = scanner.nextInt();
		System.out.println(intinput);
		
		// float input value
		float floatinput = scanner.nextFloat();
		System.out.println(floatinput);
		
		// boolean input value
		boolean boolinput = scanner.nextBoolean();
		System.out.println(boolinput);
		
		// with the .next can be chosen what data type to take
		// important is that the variable has to be defined with the same data type
		
		// Other User Input etc.
		// BigDecimal has to be imported to work (Line 2)
		
		BigDecimal money = scanner.nextBigDecimal();
		Byte objbyte = scanner.nextByte();
		
		// ... and so much more
		
		//
		// *** NUMERIC DATA TYPES
		//
	
		// Examples for some property representation of the integer variable
		System.out.println(Integer.MAX_VALUE); // shows max value of an integer
		System.out.println(Integer.SIZE); // shows size of integer
		
		// there are also many methods attached:
		Integer.compare(intinput, myByte); // etc.
		// experimenting is a possible here
		
		// some same properties can also be use with other data types
		System.out.println(Double.MAX_VALUE);
		System.out.println(Float.MAX_VALUE);
		System.out.println(Byte.MAX_VALUE);
		
		// ... etc.
		
		// Something about doubles: // (WORKS IN ALL LANGUAGES)
		System.out.println(Double.POSITIVE_INFINITY);
		System.out.println(Double.NEGATIVE_INFINITY);
		
		// also:
		System.out.println(Double.NaN);
		System.out.println(Math.sqrt(-1));
		// both print NaN -> Not a Number
		System.out.println(Double.isNaN(Math.sqrt(-1))); // prints true bc it is NaN
		
		//// The datatype.method option is a powerful way to get new possibilities to work with data. So testing out is good.
		
		//
		// Other Features ////////////////////////////////
		//
		
		
		
	  }
	}
}


//Java vocabulary: 

// literals - value of a variable
// variable - stores some value
// expression - evaluates to a value
// operator - work on operands to produce a value
// operand - thing(s) the operator works on


// class - class contains everything and has members
// main - let the system know where it should start
// methods - Do Something
// arguments - what you pass into a method (part of calling)
// parameter - variables to store arguments (part of definition)
// statements - Telling the computer to do something
// properties - store something

// access modifier (public) - Who can use? 
// static - no instance of class is needed 
// object - instance of a class

// String[] args - takes args as input that are the type String in an array
