#Challange:
# Write a function named mid that takes a string as its parameter. 
# Your function should extract and return the middle letter. 
# If there is no middle letter, your function should return the empty string.

#For example, mid("abc") should return "b" and mid("aaaa") should return "".

def mid(i):
    
    if len(i)%2 == 0:
        print("not possible")
    else:
        return input[len(i)//2]
        
mid("aaa")