#Challange:
# The goal of this challenge is to analyze a string to check if it contains two of the same letter in a row. 
# For example, the string "hello" has l twice in a row, while the string "nono" does not have two identical letters in a row.

# Define a function named double_letters that takes a single parameter. The parameter is a string.
# Your function must return True if there are two identical letters in a row in the string, and False otherwise.

# ----- couldnt figure it out after 3 Hours of trying with minimal research and multiple tries
def double_letters(i):
    val = []
    count = -1
    for l in i:
        val.append(l)
        count += 1
        if val[count-1] == val[count]:
            return True                    
        else:
            return False  
double_letters("hello")

# Solution:
# naive solution
def double_letters(string):
    for i in range(len(string) - 1):
        letter1 = string[i]
        letter2 = string[i+1]
        if letter1 == letter2:
            return True
    return False

# shorter solution
# using a list comprehension, zip, and any
def double_letters(string):
    return any([a == b for a, b in zip(string, string[1:])])
