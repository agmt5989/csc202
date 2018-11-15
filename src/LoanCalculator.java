  /*
   Introduction to OOP with Java (5th Ed), McGraw-Hill
  
   Wu/Otani
  
   Chapter 4 Sample Development: Loan Calculation (Step 5)
  
   File: Step5/LoanCalculator.java
  
   This class controls the input, computation, and output of loan
 */

 import java.text.DecimalFormat;
import java.util.*;

 class LoanCalculator {

// ----------------------------------
//     Data Members
// ----------------------------------
   // This property specifically deals with the Step3 method parameters. Don't overload!
   private double[][] testArray = {{2000, 12.25, 4}, {/*for optional values*/}}; 
     
   // Declarstion of step4 variables using values provided in slide 49
   double[][] testValue = {{1000, 10, 10}, {15000, 7, 15}, {10000, 12, 10}, {0, 10, 5}, {30, 8.5, 50}};

   // This object does the actual loan computation
     private Loan loan;
     
     private Scanner scanner;

// ----------------------------------
 //
//   Main Method
 //
// ----------------------------------

     public static void main(String[] arg) {
         
         LoanCalculator calculator = new LoanCalculator();
         calculator.start();
     }

// ----------------------------------
//     Constructors
// ----------------------------------

     public LoanCalculator() {
         
         scanner = new Scanner(System.in);
         
     }

// -------------------------------------------------
//       Public Methods:
 //
//           void start (        )
 //
// ------------------------------------------------

     //Top-level method that calls other private methods
     public void start() {

         describeProgram();   //tell what the program does         
         displayOutput(step3()); // Call my custom testing method and display the corresponding output using the class's method
         step4();             // Display outputs from custom test values
         
      System.out.println("\r\nStep5******************\r\n"
              + "This final method accepts user input to compute real-world solutions");
         getInput();          //get three input values
         displayOutput(loan);     //display the results
         
     }


// -------------------------------------------------
//       Private Methods:
 //
//       void    describeProgram   (        )
//       void    displayOutput     (        )
//       void    getInputs         (        )
 //
// ------------------------------------------------


     // Provides a brief explanation of the program to the user.
     private void describeProgram() {
         System.out.println("This program computes the monthly and total");
         System.out.println("payments for a given loan amount, annual ");
         System.out.println("interest rate, and loan period (# of years).");
         System.out.println("\n");
     }


     //Displays the input values and monthly and total payments.
     private void displayOutput(Loan loan) { // Change method to accept an object as a parameter
         
         DecimalFormat df = new DecimalFormat("0.00");
         
         System.out.println("Loan Amount: $" + loan.getAmount());
         System.out.println("Annual Interest Rate:"
                             + loan.getRate() + "%");
         System.out.println("Loan Period (years): " + loan.getPeriod());

         System.out.println("Monthly payment is $ " + 
                                        df.format(loan.getMonthlyPayment()));
         System.out.println("  TOTAL payment is $ " + 
                                        df.format(loan.getTotalPayment()));
     }


     // Gets three input values--loan amount, interest rate, and
     // loan period
     private void getInput() {
         double  loanAmount, annualInterestRate;

         int     loanPeriod;

         System.out.print("Loan Amount (Dollars+Cents):");
         loanAmount  = scanner.nextDouble();

         System.out.print("Annual Interest Rate (e.g., 9.5):");
         annualInterestRate = scanner.nextDouble();

         System.out.print("Loan Period - # of years:");
         loanPeriod  = scanner.nextInt();

         //create a new loan with the input values
         loan = new Loan(loanAmount, annualInterestRate,loanPeriod);

     }
     public Loan step3 () {
       // Display messages to the end user
         System.out.println("Step3************************\r\n" /* Print a visible demacation on the screen */
               + "At this step of the program run, our goal is to generally\r\n"
               + "examine program run, without emphasis on user input"
                 + "i.e. Hardcoding");

       
        Loan testLoan1 = new Loan(testArray[0][0], testArray[0][1], (int) testArray[0][2]);
        return testLoan1;
     }
     
     public void step4() {
       // Print visible demacation on the screen
       System.out.println("\r\nStep4************************\r\n" /* Print a visible demacation on the screen */
               + "At this step of the program run, our goal is to stress-test with\r\n"
               + "various flavours of expected user input\r\n"
               + "Amount\t\tRate\t\tPeriod(Years)\tMonthly\t\tTotal");
       
       // Instantiate a new decimal format
       DecimalFormat df = new DecimalFormat("0.000");
      for (double[] values : testValue) {
        Loan test = new Loan (values[0], values[1], (int) values[2]); // Start an object
        System.out.println(values[0] + "\t\t" + values[1] + "\t\t" + values[2] + "\t\t" + df.format(test.getMonthlyPayment()) + "\t\t" + df.format(test.getTotalPayment()));
        test = null; // Destroy the test object
      }
     }

 }