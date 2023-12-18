import random #import package/module random 
#variable x does not necessarily have to be 10 it can be any number
#define function guess
def guess(x):
    #initialize variables of function guess
    random_number = random.randint(1,x) #set variable to package 
    guess = 0 #set guess variable to 0
    #while the guess variable does not equal to random_number variable, repeat input
    while guess != random_number:
        guess = int(input(f'Guess a number between 1 and {x}: '))
        #if the guess input is less than random_number variable, display too low message
        if guess < random_number:
            print('Sorry, guess again. Too low. ')
        #else if the guess input is greater than random_number variable, display too high message
        elif guess > random_number:
            print('Sorry, guess again. Too high.')
#while guess is equal to random_number variable, display correct message
    print(f'Yay, congrats. You have guessed the number {random_number} correctly!')

#Call function guess to play
#guess(10)

#define function computer_guess
def computer_guess(x):
    #initialize variables of function computer_guess
    low = 1 #set low variable to 1
    high = x #set high variable to x/input variable
    feedback = '' #set feedback variable to blank
    #while feedback variable does not equal to 'c', run conditional if statements
    while feedback != 'c':
        #if low variable does not equal to high variable, guess variable is set to package
        if low != high:
            guess = random.randint(low,high)
        #else guess variable is equal to low variable and feedback variable is set to input
        else:
            guess = low
        feedback = input(f'Is {guess} too high (H), too low (L), or correct (C)? ').lower()
        #if ffedback variable is equal to 'h', high variable is set to guess variable minus 1
        if feedback == 'h':
            high = guess -1
        #else if feedback is equal to 'l', low variable is set to guess variable plus 1
        elif feedback == 'l':
            low = guess + 1
    #while feedback variable does equal to 'c', display correct message
    print(f'Yay, the computer has guessed the number {guess} correctly! ')

#Call function computer_guess to play
computer_guess(10)