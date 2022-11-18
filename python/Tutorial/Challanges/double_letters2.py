#Challange:
# The goal of this challenge is to analyze a string to check if it contains two of the same letter in a row. 
# For example, the string "hello" has l twice in a row, while the string "nono" does not have two identical letters in a row.

# Define a function named double_letters that takes a single parameter. The parameter is a string.
# Your function must return True if there are two identical letters in a row in the string, and False otherwise.
def double_letters(i):
    values = []
    count = 0
    while count != len(i):
        for l in i:
            values.append(l)
        count+=1
        print(values)
        print("count to small")
        
    
        
double_letters("hello")