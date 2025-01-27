//NAME: MARC
//DATE: 1/24/2025
//Whats messed up: WRITTEN WITH **

import java.util.Scanner;  // Import the Scanner class

public class Stairs {
  public static void main(String[] args) {
        
        // Create a Scanner 
  	    Scanner nameOfInput = new Scanner(System.in); 
        
        //Prompt user to enter something numbero
        System.out.println("Enter number");
        
      
        //Puts input to STRING
        Integer numberToLoop = nameOfInput.nextInt();
        
        // Read user input, output as int
        //int numberToLoop = nameOfInput.nextInt();
        //double function = nameOfInput.nextDouble();
        

        //Counters:
      int numberToLoop1 = numberToLoop;
      int numberToLoop2 = 1;

        //For loop for the numbers
    for (int i = 0; i < numberToLoop; i++) {
      	System.out.println(" ".repeat(numberToLoop1) + "#".repeat(numberToLoop2)); //**This had + and - at the end, not as a counter
        //System.out.println("String :"+string.repeat(count)); 
        //**These help iterate through the counter, which helps the total numbers go up and down
        //**Does totalNumberofInput - spaces = characters
        numberToLoop1 -= 1; 
        numberToLoop2 += 1;



    

    }  
  }
}
//IDEA: Convert python code to java
//See what they did here and try and replicate it
// def staircase(n):
        //for i in range(n):
            //for j in range (n):
                //if i+j == n-1:
                    //print(" "*j+"#"*(n-j))



