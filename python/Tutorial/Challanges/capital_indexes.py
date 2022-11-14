#Challange:
#Write a function named capital_indexes. The function takes a single parameter, 
# which is a string. Your function should return a list of all the indexes in the string that have capital letters.

#For example, calling capital_indexes("HeLlO") should return the list [0, 2, 4].

def capital_indexes(input):
    o = []
    for count, value in enumerate(input):
        if value.isupper():
            o.append(count)
    print(o)
    return o

capital_indexes(str(input("but some cap or non cap words: ")))

#shorter Version 
from string import uppercase
def capital_indexes(s):
    return [i for i in range(len(s)) if s[i] in uppercase]
    