
num1 = float(input("Enter first number: ")) 
op = (input("Enter operator: "))
num2 = float(input("Enter second number: "))
#float is going to convert the string into a number

if op == "+":
    print(num1 + num2)
elif op == "-":
    print(num1 - num2)
elif op == "/":
    print(num1 / num2)
elif op == "*":
    print(num1 * num2)
else:
    print("Invalid operator")

#if statement is going to check for the operator and prints out 
#different results for each condition