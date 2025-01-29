
import java.util.Scanner; // import the Scanner class 

public class Main {
   static void myMethod() {
       
    Scanner myObj = new Scanner(System.in);
    Boolean flag=true;
    
    int numberGiven;
    // Enter username and press Enter
    System.out.print("Enter number: If Not A Number, It Will Fail. "); 
    numberGiven = myObj.nextInt();

    while (myObj.hasNext()) {
      if (myObj.hasNextInt()) {
        System.out.println(myObj.nextInt());
      } else {
        myObj.next();
      }
    //counters
    int totalNumber = numberGiven;
    int countingDown = totalNumber;
    if (flag) {
    for (int i = 0; i < numberGiven; i++) {
        countingDown -=1;
        totalNumber += 1;
        System.out.println(countingDown);
    }}
    
    }
    }
    public static void main(String[] args) {
    myMethod();
    }
}




