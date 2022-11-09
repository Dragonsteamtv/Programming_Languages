// Comments 
/* There are these two types of comments
the top on ist single line and this is multi line */

//VARIABLES =====================

/* In computer science, data is anything that is meaningful to the computer.
JavaScript provides eight different data types which are undefined, null, boolean, string, symbol, bigint, number, and object.

For example, computers distinguish between numbers, such as the number 12, and strings, such as "12", "dog", or "123 cats", which are collections of characters.
Computers can perform mathematical operations on a number, but not on a string.

Variables allow computers to store and manipulate data in a dynamic fashion. 
They do this by using a "label" to point to the data rather than using the data itself. 
Any of the eight data types may be stored in a variable.

Variables are similar to the x and y variables you use in mathematics, which means they're a simple name to represent the data we want to refer to.
Computer variables differ from mathematical variables in that they can store different values at different times.

We tell JavaScript to create or declare a variable by putting the keyword var in front of it, like so:
var ourName;
creates a variable called ourName. In JavaScript we end statements with semicolons.
Variable names can be made up of numbers, letters, and $ or _, but may not contain spaces or start with a number. */

var myName;

var a;

a = 7 // declares the variable a to 7

//After a value is assigned to a variable using the assignment operator, 
//you can assign the value of that variable to another variable using the assignment operator.

var myVar;
myVar = 5;
var myNum;
myNum = myVar;

// above declares a variable with no value. after, we assign the number 5, create a second variable and assign it to the value of the first var

// declares and assignes the var at the same time
var a = 9

/* When JavaScript variables are declared, they have an initial value of undefined. 
If you do a mathematical operation on an undefined variable your result will be NaN which means "Not a Number". 
If you concatenate a string with an undefined variable, you will get a literal string of undefined. */

// Only change code below this line
var a = 5;
var b = 10;
var c = "I am a";
// Only change code above this line

a = a + 1;
b = b + 5;
c = c + " String!";

