import java.util.Scanner; // import the Scanner class 

class countdown {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    Boolean flag=true;


    int numberGiven;
    // Enter username and press Enter
    System.out.print("Enter number: "); 
    numberGiven = myObj.nextInt();

    //counters
    int totalNumber = numberGiven;
    int countingDown = totalNumber;
    if (flag) {
    for (int i = 0; i < numberGiven; i++) {
        countingDown -=1;
        totalNumber += 1;
        System.out.println(countingDown);
      }  

    
  }
}
}
