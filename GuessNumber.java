// BEGIN

import java.util.Scanner;

class GuessNumber {
    public static void main(String[] args) {

        //Scanner name here for scanning the user input
        Scanner userInputSlay = new Scanner(System.in);

        int number = 1 + (int)(100* Math.random());

        //Selfff checker for syntax yuhr coding thing ifgnoire this
        //System.out.print(number);
        System.out.println("Guess a magic number between 0 and 100");

        int guess;
        do {
            // Prompt the user to start guessing
            System.out.print("Enter your guess: ");
 
            // Take input for guessing
            guess = userInputSlay.nextInt();
 
            // If the number is guessed
            if (number == guess) {
                System.out.println("Yes, the number is " + number);
                break; //For exit looping breakkkkKKKKKKKKKKKKK
            }
            else if (number > guess) {
                System.out.println("Your guess is too low");  //HINTTT
            }
            else if (number < guess) {
                System.out.println("Your guess is too high"); //AOTEHRrerRE HINTTTT
            }
        }
        while(true);  //sudo code said to do this. I do break i swear it doesnt always run guys
userInputSlay.close();  //CLOSE FOR UHHH MINOR ERROR IN CODE WHERE IT SAYS "scanner never closed" nerd emoji this guy oh my god
    }
}
