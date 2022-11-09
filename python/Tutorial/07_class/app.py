from student import Student #this imports the student file and grabs the student class from it

Student1 = Student("Jim", "Buisness", 3.1, False)#this creates a student with the parameter we defined in the class ind the student.px file

print(Student1.name)#prints out the name we gave the student
print(Student1.major)#prints out the major we gave to the student
print(Student1.gpa)#prints out the gpa we gave the student
print(Student1.is_on_probation)#prints out if he is in probation or not (in this case false)
#now that we have our own datatype we can give it different information

Student2 = Student("Mark", "Art", 4.2, True) #another student with differnt values given
print(Student2.name)
print(Student2.major)
print(Student2.gpa)
print(Student2.is_on_probation)
#again prints out the information we gave it

#what we have done now: 
#in the student.py file we created our own datatype and in this file we are creating variables
#which represent the Student datatype and we are giving it information that we can access


