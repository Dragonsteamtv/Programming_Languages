class Student:
    #in the __init__ function i am defining what a student is.the student now is going to have all these atrubutes that i defined:
    def __init__(self, name, major, gpa, is_on_probation):
        self.name = name
        self.major = major
        self.gpa = gpa
        self.is_on_probation = is_on_probation

#when we are giving this __init__ function data it stores it inside of this function
#the self.name = name just defines that the self name is equal to the data we are ginign it