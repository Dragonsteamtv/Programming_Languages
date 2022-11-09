from Question import Question #this imports the Question class from the Question.py file

question_prompts = [
    "What color are apples?\n(a) Red/Green\n(b) Purple\n(c) Orange\n\n",
    "What colo are Bananas?\n(a) Teal\n(b) Magenta\n(c) Yellow\n\n",
    "What color are strawberries?\n(a) Yellow\n(b) Red\n(c) Blue\n\n" #these are all the question that we are going to ask
]

questions = [
    Question(question_prompts[0], "a"),
    Question(question_prompts[1], "c"),
    Question(question_prompts[2], "b")  #this assigns which answer is wright in the question
]

def run_test(questions): #function called run_test which takes the quesions list as parameter
    score = 0 #assigns value 0 to the score because the participant hasent scored jet
    for question in questions: #for every question in the question list it is going to run trough this loop
        answer = input(question.prompt) #asks for an input. the .prompt is the string "a", "b" or "c". the .prompt comes from the class we created
        if answer == question.answer: #checks if the answer coresponds to the answer the participnat gave. question.answer is the inputet variable from thee class in the other python file.
            score += 1 #increases the score if they got the answer right
    print("You got " + str(score) + "/" + str(len(questions)) + " correct")#prints out the Score plus how many questions there are in the questions list. this is achieved with the len() function

run_test(questions)#this calls the run_test function and gives it the questions list as parameter