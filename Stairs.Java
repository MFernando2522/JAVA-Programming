//NAME: MARC
//DATE: 1/24/2025
//UNFINISHED, PRINTS STAIRS BUT MESSED UP, LOGIC ERROR

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
        
        //For loop for the numbers
    for (int i = 0; i < numberToLoop; i++) {
      	System.out.println(" ".repeat(numberToLoop-i) + "#".repeat(numberToLoop+i));
        //System.out.println("String :"+string.repeat(count)); 

    

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

