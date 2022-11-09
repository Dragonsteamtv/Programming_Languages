#complete circles
circle_01 = int(input("Value of Circle 1: "))
circle_02 = int(input("Value of Circle 2: "))
circle_03 = int(input("Value of Circle 3: "))

#tru values
circle_real_01 = int(input ("real size of circle 1: "))
circle_real_02 = int(input ("real size of circle 2: "))
circle_real_03 = int(input ("real size of circle 3: "))

#everything 
everything = int(input("write if there are some people who do everything: "))

#none
none = int(input("people who do nothing: "))

#variabels cut
cut_1n2 = int(input("value of cut between 1 and 2: "))
cut_2n3 = int(input("value of cut between 2 and 3: "))
cut_3n1 = int(input("value of cut between 3 and 1: "))

#variabels cut without middle
cut_1n2_minus = int(input("value of cut between 1 and 2 minus middle: "))
cut_2n3_minus = int(input("value of cut between 2 and 3 minus middle: "))
cut_3n1_minus = int(input("value of cut between 3 and 1 minus middle: "))

complete = int(input("value of all the people: "))

list_all = [circle_real_01, circle_real_02, circle_real_03, cut_1n2, cut_2n3,
            cut_3n1, cut_1n2_minus, cut_2n3_minus, cut_3n1_minus]
#math

#==math for real

while int('0') in list_all:
        #circle real 01
        if (circle_real_01>0):
            pass
            if (cut_1n2<=0):
                print("too few infos(cut1n2)")
            if (cut_3n1_minus<=0):
                print("too few infos(cut3n1_minus)")
        else:
            circle_real_01 = (circle_01 - cut_1n2 - cut_3n1_minus)
            print ("true value of circle 1:", circle_real_01)
            if (circle_real_01<=0): 
                print ("failure")
        #circle real 02
        if (circle_real_02>0):
            pass
            if (cut_1n2<=0):
                print("too few infos(cut1n2)")
            if (cut_2n3_minus<=0):
                print("too few infos(cut2n3_minus)")
        else:
            circle_real_02 = (circle_02 - cut_1n2 - cut_2n3_minus)
            print ("true value of circle 2:", circle_real_02)
            if (circle_real_02<=0): 
                print ("failure")
        #circle real 03
        if (circle_real_03>0):
            pass
            if (cut_3n1<=0):
                print("too few infos(cut3n1)")
            if (cut_2n3_minus<=0):
                print("too few infos(cut2n3_minus)")
        else:
            circle_real_03 = (circle_03 - cut_3n1 - cut_2n3_minus) 
            print ("true value of circle 3:", circle_real_03)
            if (circle_real_03<=0): 
                print ("failure")
        #==math for cut
        #cut 1n2
        if (cut_1n2>0):
            pass
            if (circle_real_01<=0):
                print("too few infos(C_real01)")
        else:
            cut_1n2 = (circle_01 - circle_real_01)
            print ("cut between 1 and 2:", cut_1n2)
            if (cut_1n2<=0):
                cut_1n2 = (circle_02 - circle_real_02)
                if (cut_1n2<=0):
                    print ("failure")
        #cut 2n3 
        if (cut_2n3>0):
            pass
            if (circle_real_02<=0):
                print("too few infos(C_real02)")
        else:
            cut_2n3 = (circle_02 - circle_real_02)
            print ("cut between 2 and 3:", cut_2n3)
            if (cut_2n3<=0):
                cut_2n3 = (circle_03 - circle_real_03)
                if (cut_2n3<=0):
                    print ("failure")
        #cut 3n1
        if (cut_3n1>0):
            pass
            if (circle_real_03<=0):
                print("too few infos(C_real03)")
        else:
            cut_3n1 = (circle_03 - circle_real_03)
            print ("cut between 3 and 1:", cut_3n1)
            if (cut_3n1<=0):
                cut_3n1 = (circle_01 - circle_real_01)
                if (cut_3n1<=0):
                    print ("failure")
        #math cut minus
        #cut 1n2 minus
        if (cut_1n2_minus>0):
            pass
            if (cut_3n1<=0):
                print("too few infos(cut3n1)")
            if (circle_real_01<=0):
                print("too few infos(C_real01)")
        else:
            cut_1n2_minus = (circle_01 - cut_3n1 - circle_real_01)
            print ("cut between 1 and 2 minus middle:", cut_1n2_minus)
            if (cut_1n2_minus<=0):
                print ("failure")
        #cut 2n3 minus
        if (cut_2n3_minus>0):
            pass
            if (cut_1n2<=0):
                print("too few infos(cut1n2)")
            if (circle_real_02<=0):
                print("too few infos(C_real02)")
        else:
            cut_2n3_minus = (circle_02 - cut_1n2 - circle_real_02)
            print ("cut between 2 and 3 minus middle:", cut_2n3_minus)
            if (cut_2n3_minus<=0):
                print ("failure")
        #cut 3n1 minus
        if (cut_3n1_minus>0):
            pass
            if (cut_2n3<=0):
                print("too few infos(cut2n3)")
            if (circle_real_03<=0):
                print("too few infos(C_real03)")
        else:
            cut_3n1_minus = (circle_03 - cut_2n3 - circle_real_03)
            print ("cut between 3 and 1 minus middle:", cut_3n1_minus)
            if (cut_3n1_minus<=0):
                print ("failure")
else:
    pass

#==everything
if (complete>0):
    pass
else:
    complete = sum(list_all)
    print ("base value:", complete)
    if (complete<=0):
        print ("failure")

print ("Thanks for using my calculator")