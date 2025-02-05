// BEGIN

import java.util.Scanner;

class GuessNumber {
    public static void main(String[] args) {

        
        Scanner userInputSlay = new Scanner(System.in);

        int number = 1 + (int)(100* Math.random());


        //Selfff checker for syntax yuhr coding thing ifgnoire this
        //System.out.print(number);


        int guess;
        do {
            // Prompt the user to start guessing
            System.out.println(
                "Guess the number:");
 
            // Take input for guessing
            guess = userInputSlay.nextInt();
 
            // If the number is guessed
            if (number == guess) {
                System.out.println(
                    "Congratulations!"
                    + " You guessed the number.");
                break; //For exit looping breakkkkKKKKKKKKKKKKK
            }
            else if (number > guess) {
                System.out.println(
                    "The number is "
                    + "greater than " + guess);  //HINTTT
            }
            else if (number < guess) {
                System.out.println(
                    "The number is"
                    + " less than " + guess); //AOTEHRrerRE HINTTTT
            }
        }
        while(true);


// WHILE (true) DO
//     Ask for a guess
//     Get user input


//         Exit the loop
//     ELSE IF the guess is too high THEN
//         Give a hint
//     ELSE
//         Give a different hint
//     END IF
// END WHILE

// END
    }
}