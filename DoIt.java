// BEGIN
import java.util.Scanner;


class DoIt {
    public static void main(String[] args) {
        do {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter a positive number: ");

        int checkInput = userInput.nextInt();

            if (checkInput < 0) {
                System.out.println("Invalid input. Try again.");
                continue;
            }
            if (checkInput > 0); {
                System.out.println("You entered " + checkInput);
                break;
            }
        }
        while (true); //I cant import a scanner as a var int, so while true sorry
    }
}
