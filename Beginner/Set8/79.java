import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();

    double sr = Math.sqrt(n*m);
    if((sr - Math.floor(sr)) == 0)
      System.out.println("yes");
    else
      System.out.println("no");
  }
}
