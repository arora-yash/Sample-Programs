import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    Long n = sc.nextLong();

    int r = 0;
    long sum = 0;
    while(n!=0) {
      r = n%10;
      sum = sum + (r*r);
      n = n/10;
    }
    System.out.println(sum);
  }
}
