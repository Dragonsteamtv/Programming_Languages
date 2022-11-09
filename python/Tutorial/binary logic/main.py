#BINARY LOGIC

def AND(input1, input2):
    if input1 and input2 == True:
        print(1)
    else:
        print(0)

#AND(True, False)

def NOT(input1):
    if input1 == True:
        output = 0
        print(0)
    else:
        output = 1
        print(1)

NOT(False)

def NAND():
    AND(True, True)
    NOT(AND)