import java.util.*;

public class Main {

  static int fact(int n) {
    if(n == 1)
      return 1;
    return n*fact(n-1);
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();

    System.out.println(fact(n)/(fact(r)*fact(n-r)));
  }
}
