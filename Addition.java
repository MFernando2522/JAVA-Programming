// BEGIN
import java.util.Scanner;  // Import the Scanner class


// Generate two random numbers between 0 and 9
// SET number1 = RANDOM(0-9)
// SET number2 = RANDOM(0-9)
class Addition {
    public static void main(String[] args) {
    int min = 1; //Set minyuhhhh
    int max = 10; //Set maximuhm
    int number1 = min + (int)(Math.random() * ((max - min) + 1));
    int number2 = min + (int)(Math.random() * ((max - min) + 1));
    System.out.println("Random Integer from 1 to 10: " + number1 + " and " + number2);

    // Prompt user for input
    // PRINT "What is " + number1 + " + " + number2 + "? "
    Scanner userAnswer = new Scanner(System.in);
    System.out.println("What is " + number1 + " + " + number2 + "? ");
    // READ answer
    int passItToTheLoop = userAnswer.nextInt();


    // Keep asking until the user gets it right

    while (passItToTheLoop != (number1 + number2));
    // WHILE (answer ≠ number1 + number2) DO
        System.out.println("\"Wrong answer. Try again. What is \" + number1 + \" + \" + number2 + \"? \"");
        continue;
    //     PRINT "Wrong answer. Try again. What is " + number1 + " + " + number2 + "? "
    //     READ answer
    // END WHILE
    

    // Correct answer message
    // PRINT "You got it!"
    System.out.println("You got it!");

    // END
    }
}
