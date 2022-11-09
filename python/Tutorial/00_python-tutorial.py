#importing math functions
import math as m #m is used then to acces the functions [see math functions in line 86]

# task variabels ///////////

character_name = "John"
character_age = "50"
is_male = True

print ("there once was a man named "+ character_name +", ")
print ("he was "+ character_age +" years old. ")

character_name = "Mike"
print ("He really liked the name "+ character_name +",")
print ("but didn't like being "+ character_age +".")

#task String

print ("Giraffe\nAcademy") #prints Giraffe and Academy on different lines
print ("Giraffe\"Academy") #prints out a " between the two strings
print ("Giraffe\Academy") #prints a \ between the variables

#==string functions

phrase = "Giraffe Academy"
print (phrase + " is cool")
print (phrase.lower()) #transforms var to lowercase
print (phrase.upper()) #transforms var to uppercase
print (phrase.isupper()) #asks if the variable is uppercase
print (phrase.upper().isupper()) #first transform var to uppercase than asks if that is the case
print (len(phrase)) #asks how many items are in a var
print (phrase[0]) #selects the item of the var: nummbered like this; 0,1,2,3,4
print (phrase.index("G")) #searches for the first item with that identity
print (phrase.index("a")) #searches for the first item with that identity
print (phrase.index("Acad")) #searches for the first item with that identity; accept this time for a word
print (phrase.replace("Giraffe", "Elephant")) #replaces Giraffe with elephant

#working with numbers task ///////////


#==printing a number#
print (2)
print (2.0987) 
print (-2.845)

#==MATH ///////////

#==math (plus, minus etc.)#
print (3+4.5)
print (3 -4.5)
print (3 *4.5)
print (3 /4.5)

#==perenethasies work the same as in normal math 
print (3 * 4 + 5)
print (3 * (4 + 5))

#==divison with outcome of rest#
print (10 % 3) 

#==math with variables#

my_num = 5
print (my_num)
#as string ->
my_num = 5
print (str(my_num)) #--> prints out number but is a string now (str) is used to acchieve this 

my_num = 5
print (str(my_num) + " my favourite number" ) #--my_num as string + "my favourite number"

my_num = 5
#print (my_num + " my favourite number" ) #--my_num without string = Problem -- because it cant print numbers with strings

#advanced commmon math functions
my_num = -5
print (abs(my_num)) #absolute value

print (pow(3, 2)) #= 3 to the power of 2

print (max(3, 2)) #returns larger number   -->
print (min(3, 2)) #opposite of max

#math functions ///////////

print (m.sqrt(3)) #squareroot of the number in brackets
print (m.floor(3.7)) #choppes off decimal point
print (m.ceil(3.7)) #rounds up number no matter what
#-- m. --> get autocompletes for functions (if math is importat + importet as m)

#input from user task

#name = input ("Enter your name: ") #input from a user = "says on the field"
#age = input ("Enter your age: ") #input from a user = "says on the field"
#print ("Hello " + name + "! You are " + age) #prints input plus the text

#lists in python ///////////

friends = ["Kewin", "Karen", "Jim", "Oscar", "Toby"] #can also put different types of data in one list

print (friends) #--> prints out the list of friends

#==using index for a particular type of data

print (friends[0]) #number acceses index in the list -> Index Numbers start from 0
print(friends[-1])#accesses Jim from back of the list
print(friends[1:])#acesses index position 1 and every index bhind it
print(friends[1:3])#grabs index from one up to, but not including 3

#==modyfing items inside a list
friends[1] = "Mike"

#list functions
lucky_numbers = [4, 8, 15, 16, 23, 42]
friends_02 = ["Kewin", "Karen", "Jim", "Oscar", "Toby"]
friends_03 = ["Kewin", "Karen", "Jim", "Jim", "Oscar", "Toby"]

friends_02.extend(lucky_numbers)#combines the two lists together
friends_02.append("Creed")#adds another Friend two the end of the list
friends_02.insert(1, "Kelly")#adds in Kelly at index position 1
friends_02.remove("Jim")#removes Jim from the list
friends_02.clear()#gets rid of every elemnt from the list
friends_02.pop()#pops of an element from the end of the list

#==search for elements in the lists
friends_02.index("Kevin")#tells the index of Kevin -> if the item is not in the list = returns an error
friends_03.count("Jim")#tells how many times the  value is in the list
friends_03.sort()#orders list in alphabetical order
lucky_numbers.sort()#orders numbers in ascending order
lucky_numbers.reverse()#revreses the order of the list

friends_03_copy = friends_03.copy()#coppies thee list -> same elements

#tupples /////////// 
#tuples are a type of datastructure -> its a container where we can store different values. Has some key differnces to lists. most common used for coordanates
coordinates = (4, 5) #tupple with coordanates.
#differnece: tupples cant be changed or modified
print(coordinates[0]) #same index type as lists
coordinates[1] = 10 #gonna give back an error

#data in tupples is going be used for data that is never gonna change

#tuples in lists
coordinates_02 = [(4, 5), (6, 7), (80, 34)]#the list can be modified but not the tuples.

#functions ///////////
#collection of code wich performs a specific task

def sayhi (): #def = keyword, sayhi = name of the function
    print("Hello user") #code has to be indentet to be in the function

sayhi() #calls the function and executes it ->functions should be written und lowercase, long names with underscore

def sayhi(name):
    print("Hello " + name)

sayhi("Mike")
#this function is going to include the variable that has benn added to the calling -> gonna print: Hello Mike
#can add in as many parameters as you want: (also every type)
def sayhi(name, age):
    print("Hello " + name + ", you are " + age)

sayhi("Mike", "63")
s
#return statements ///////////
#used to get information back from a function

def cube(num):
    num*num*num

cube(3)#puts in the number 3 and cubes it (doesnt print it, even with print statement)
def cube(num):
    return num*num*num

print(cube(3)) #the retunrn statement is gonna give back the value of the function

result = cube(4)#saves the return value from the function

#important: code after the return statement is not going to be executed!
#this is because the return keyword is gonna break out of the function and lines later on will never get read
#the return function can return anything: string, bulion etc.

#if statements ///////////

#if statemnts are made so the programm can make decision upon sertain conditions

is_male = True
is_tall = True

if is_male:
    print("you are a male")
else:   
    print("you are not a male")

#checks if the information is true or false. In both cases different things are going to be executed.

if is_male or is_tall:
    print("you are a male or tall ot both")
else:
    print("you are neither male nor tall")
#executes first if statement if one of the variables are true

if is_male and is_tall:
    print("You are a tall male")
else:
    print("You are either not male or nor tall or both")

#executes first line when both variables are true

if is_male and is_tall:
    print("You are a tall male")
elif is_male and not(is_tall):
    print("Your are a short male")
else:
    print("You are either not male or nor tall or both")

#elif is getting used for multiple conditions. 
#the not is going to negate the variable.

if is_male and is_tall:
    print("You are a tall male")
elif is_male and not(is_tall):
    print("Your are a short male")
elif not(is_male) and is_tall:
    print("you are not a male but are tall")
else:
    print("You are not a male and not tall")

#in any condition of the boolion variables the statement is going to print something

#==comparisons
def max_num(num1, num2, num3):
    if num1 >= num2 and num1 >= num3:
        return num1
    elif num2 >= num1 and num2 >= num3:
        return num2
    else:
        return num3
#>= : comparison operator. defines how we want to compare the variables.#the statement is going to be either true or false

print(max_num(3, 4, 5)) #going to print out the largest number
#(max_num is the function we created)

def var(var1, var2, var3):
    if "dog" == "dog":
        return "dog"
#this function is comparing strings which also works. == stand for equal
#other comparisons: != <-not equal to... < <-smaller    > <-grader

#dictionaries ///////////
#doctionairies can be use for replacements
#it works like a normal dictionary where you have a word and its definition
monthConversions = {
    "jan": "January",
    "Feb": "February",
    "Mar": "March",
    "Apr": "April",
    "May": "May",
    "Jun": "June",
    "Jul": "July",
    "Aug": "August",
    "Sep": "September",
    "Oct": "October",
    "Nov": "November",
    "Dec": "December" 
}
#left is the "word" or rather the key and right the definition
#important is that after every definition there must be a comma
#there cant be the same keys in one dictionary!

print(monthConversions["Nov"])#reffers to the dictionary and prints out the full defintion of the key
print(monthConversions.get("Dec"))#same thing but can define a default output if the key is not inside the list:
print(monthConversions.get("Luv", "Not a valid key"))

#The key dont have to be strings; they can also be numbers

#While Loop ///////////
#while loops trough the code until a specific condition is false

i = 1

while i <= 10:
    print(i)
    i += 1

print("Done with loop")
#thhis loop is going to keep looping until the condition is false: i <= 10

#for loops ///////////

for letter in "Giraffe Academy": #For each Letter in "Giraffe Academy" print each Letter
    print(letter)

friends_for = ["Jim", "Karen", "Kevin"]

for friend in friends_for:
    print(friend)   
    #prints out every friend in the List

for index in range(10):
    print(index)
    #prints out every number in range 10 without 10

for index in range(3, 10):
    print(index)
    #prints out every number in range 3 to 10 without 10

for index in range(len(friends_for)):
    print(friends_for[index])
    #prints out every friend in the list with range(len(...))

for index in range(5):
    if index == 0:
        print("first Iteration")
    else:
        print("Not First")

#this creates logic in the loop. in the first iteration its going to do something else than in the other iterartions

#exponent function ///////////

print(2**3)#this is the simple version of exponent functions
#but we are gonna use a for loop

def raise_to_power(base_num, pow_num): #uses two inputs: the base number and to wich power it is going to be raised
    result = 1  #defines result so it can store the result of the math below
    for index in range(pow_num):#for every index (1, 2 etc.) in the range of the power, it is going to loop trough the loop
        result = result * base_num  #multyplies result by the base number
    return result   #returns the result so it can be accesed

print(raise_to_power(3, 2))
#prints out the result of the function and gives it the informations that it needs: raise_to_power(3, 2)

#2D Lists and Nested Loops ///////////

number_grid = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9],
    [0]
] #this creates a list with lists inside of it

print(number_grid[0][0]) #prints out the first item; [1, 2, 3] ;and the first index of that item

for row in number_grid:
    for col in row:
        print(col) #this prints out each item in the list seperately

#try except ///////////
#is used for handeling errors

try:
    number = int(input("Enter a number: "))
    print(number)
except:
    print("Invalid Input") #catches the invalid input if the users input the wrong input: for example text

try:
    value = 10 / 0
    number = int(input("Enter a number: "))
    print(number)
except ZeroDivisionError:
    print("Divided by Zero")
except ValueError:
    print("invalid input")
#exepts specific errors

#reading from external files ///////////

open("employes.txt", "r")#opens the file in read mode: just reads whats in the file
open("employes.txt", "w")#opens the file in write mode: option change the file
open("employes.txt", "a")#cant change the information but can append something
open("employes.txt", "r+")#opens file in read and write mode at the same time

employee_file = "" #saves the file inside a variable

print(employee_file.readable())#.redable returns a boolion value, do it checks if the contents are redable
print(employee_file.read())#reads the entire document
print(employee_file.readline())#reads an individual line
print(employee_file.readlines()[2])#puts each lin into an array and can acceses it in an index position

for employe in employee_file.readlines:
    print(employe) #prints out every line of the document
employee_file.close#closes the file again

#writing to files 
employee_file = open("employes.txt", "a")

employee_file.write("Toby - Human Resources")

employee_file.close()

#modules and Pip ///////////
#modules are python files which can be imported in the current python file

import useful_tools #imports the file useful_tools.py

print(useful_tools.roll_dice(10))
#this prints out the functionality and the . gives acces to all of the functions
#there are python module list on the internet that you can just acces
#here is a list for the newest modules for the newest version of python: https://docs.python.org/3/py-modindex.html

#the pip installer is used to install these importible functionalities
#go to the module you want to install, in the documentation if is written what you need to write in your CMD
#(if the module is a standard module it is already installed and you dont have to worry about installing)
#for the instellation go into your CMD and first check if pip is installed: pip --version
#if pip isnt installed loook up how to install it
#after you checked if pip is installed, just type in what the module documentation says and it will install the module

#classes and objectives ///////////
#the problem of some datatypes than we can not represent stuff in the real wolrd with just strings or numbers
#with classes and object we can create our own datatype. for example i can ca store all of the information i want
#about my phone i can save in that datatype
#class is for defining your own datatype

class Student:
    #in the __init__ function i am defining what a student is.the student now is going to have all these atrubutes that i defined:
    def __init__(self, name, major, gpa, is_on_probation):
        self.name = name
        self.major = major
        self.gpa = gpa
        self.is_on_probation = is_on_probation
    #for the further workflow look in the stundent.py and app.py file in the class directory

#Multiple Joice Quiz ///////////
#take a look at the file app2.py for this

#class functions ///////////
Student1 = Student("Jim", "Buisness", 3.1, False)
class Student:
    def __init__(self, name, major, gpa, is_on_probation):
        self.name = name
        self.major = major
        self.gpa = gpa
        self.is_on_probation = is_on_probation

    def in_honor_roll(self):#this function checks if the student is on the honor roll it takes the parameter of self from the class Student above ^
        if self.gpa >= 3.5: #checks if the self.gpa is grader or equal to 3.5
            return True #if the condition is true it returns true
        else: #else the function is going to return false
            return False

print(Student1.on_honor_roll())#this uses the the varible Sudent1 and goespo trough the function of the class and checks if the students gpa is above or equal to 3.1s

#Inheritance ///////////
#this is used like this: you can programm functions and other things in a variable,
#then you can make a different variable but it has the exact same attributes as the first one.
#inheriting basicely copies the function withour having to write all the code again

class Chef: #this class would be in a different document [check the inherit folder for the right setup]

    def make_chicken(self):
        print("The chef makes a chicken")

    def make_salad(self):
        print("The chef makes a salad")

    def make_special_dish(self):
        print("The chef makes a bbq ribs")

class ChineseChef(Chef): #the chef in the prentesies inherits everything the normal chef can

    def make_special_dish(self): #this overrites the standart inherited special dish from the normal Chef
        print("The chef makes orange chicken")

    def make_fried_rice(self):
        print("The chef makes fried rice")

myChef = Chef() #assign the Chef class to the variable my chef
myChef.make_chicken() #uses the variable to print a specicific used function in the class .make_chicken for example

myChineseChef = ChineseChef() #same thing as above but this time just with another class
myChineseChef.make_special_dish() #same thing as above

#important is for the printing are the perenthasies so it recognises it as a function
