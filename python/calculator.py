num1 = input ("enter a number: ")
num2 = input ("enter another number: ")

# 1: result = (num1) + (num2)
# 2: result = int(num1) + int(num2)
result = float(num1) + float(num2)

print (result)

# how this works:
# the first variable  will require an input from the user. in the "" is written what it will
# ask the user for. The same is the case for the second variable.
# the print function will print out the result variable. 

# the problem with the first method is that it will give a false result. Why?
# well, it causes a problem because the two inputs are used as strings.
# these strings cant be used in a math ecuasion. So it happens that python just
# puts these variables behind each other.

# the problem with the second version: it works but only with whole numbers because
# the int function only can use whole numbers and f*cks up by numbers with decimal places.

# solution: use a float function which can use decimal numbers as input. 
