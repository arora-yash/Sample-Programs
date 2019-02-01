import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();

    int r;
    long product = 1;
    while(n!=0) {
      r = n%10;
      product = product * r;
      n = n/10;
    }
    System.out.println(product);
  }
}
