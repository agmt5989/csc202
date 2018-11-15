
class Fibo {

  static int n1 = 0, n2 = 1, n3 = 0;

  public static void main(String args[]) {
    int count = 20;
    System.out.print(0 + ", " + 1);//printing 0 and 1    
    printFibo(count - 2);          //n-2 because 2 numbers are already printed   
  }

  static void printFibo(int count) {
    if (count > 0) {
      n3 = n1 + n2; //Set the next member to the sum of two previous numbers
      n1 = n2;      //move by one
      n2 = n3;      //move by one
      
        System.out.print(", " + n3);
      
      printFibo(count - 1);
    }
  }
}
