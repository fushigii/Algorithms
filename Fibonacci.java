public class Fibonacci {

  public static void main (String... args){

    Fibonacci fibonacci = new Fibonacci();

    for(int i=0; i<10;i++) {
    int value = fibonacci.fib(i);
    System.out.println("Fibonacci of " +i + " is " + value);
     }
  }

  int fib(int n){
    if(n <= 1)
      return 1;
   return fib(n-1) + fib(n-2);
  }

}
