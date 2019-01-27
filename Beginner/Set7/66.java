import java.util.*;
import java.math.*;

public class Main {

  static String isPrime(int n) {
    if(n > 1) {
      for(int i = 2;i<=Math.sqrt(n);i++)
        if(n%i == 0)
          return "no";
      return "yes";
    }
    else
      return "no";
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    System.out.println(isPrime(n));
  }
}
