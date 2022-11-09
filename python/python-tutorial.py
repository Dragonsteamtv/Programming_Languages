#importing math functions
import math as m #m is used then to acces the functions [see math functions in line 86]

# task variabels

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
print (phrase.upper().isupper()) #first transform var to uppercase than asks if that is th case
print (len(phrase)) #asks how many items are in a var
print (phrase[0]) #selects the item of the var: nummbered like this; 0,1,2,3,4
print (phrase.index("G")) #searches for the first item with that identity
print (phrase.index("a")) #searches for the first item with that identity
print (phrase.index("Acad")) #searches for the first item with that identity; accept this time for a word
print (phrase.replace("Giraffe", "Elephant")) #replaces Giraffe with elephant

#working with numbers task


#==printing a number#
print (2)
print (2.0987) 
print (-2.845)

#==MATH

#==math (plus, minus etc.)#
print (3+4.5)
print (3 -4.5)
print (3 *4.5)
print (3 /4.5)

#== perenethasies work the same as in normal math 
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

#math functions

print (m.sqrt(3)) #squareroot of the number in brackets
print (m.floor(3.7)) #choppes off decimal point
print (m.ceil(3.7)) #rounds up number no matter what
#-- m. --> get autocompletes for functions (if math is importat + importet as m)

#input from user task

name = input ("Enter your name: ") #input from a user = "says on the field"
age = input ("Enter your age: ") #input from a user = "says on the field"
print ("Hello " + name + "! You are " + age) #prints input plus the text
