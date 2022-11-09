#variables 
circle_01 = int(input("value of circle 1: "))
circle_02 = int(input("value of circle 2: "))

#true values
circle_real_01 = int(input("real size of circle 1: "))
circle_real_02 = int(input("real size of circle 2: "))

#cut
cut_01n02 = int(input("cut value between C1 and C2: "))

#complete
complete = int(input("complete people: "))


#MATH

#calculating first an second real circle
if (circle_real_01>0):
    pass
else:
    circle_real_01 = (circle_01 - cut_01n02)
    print ("true value of circle 1:", circle_real_01)
    if (circle_real_01<0): 
        print ("failure")

if (circle_real_02>0):
    pass
else:
    circle_real_02 = (circle_02 - cut_01n02)
    print ("true value of circle 1:", circle_real_02)
    if (circle_real_02<0): 
        print ("failure")

#calculating cut of the circles
if (cut_01n02>0):
    pass
else:
    cut_01n02 = (circle_01 - circle_real_01)
    print ("cut between 1 and 2", cut_01n02)
    if (cut_01n02<0):
        cut_01n02 = (circle_02 - circle_real_02)
        if (cut_01n02<=0):
            print ("failure")

#calculating complete
if (complete>0):
    pass
else:
    complete = (circle_real_01 + circle_real_02 + cut_01n02)
    print ("complete people:", complete)
    if (complete<0):
        print ("failure")
        
        
#version 2
input = print("insert what you know:")

#variables 
circle_01 = int(input("circle 1: "))
circle_02 = int(input("circle 2: "))

#true values
circle_real_01 = int(input("real size of circle 1: "))
circle_real_02 = int(input("real size of circle 2: "))

#cut
cut_01n02 = int(input("cut value between C1 and C2: "))

#complete
complete = int(input("complete people: "))

