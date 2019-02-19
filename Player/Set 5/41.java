import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();

    while(n%k == 0)
      n = n/k;

    if(n == 0)
      System.out.println("yes");
    else
      System.out.println("no");
  }
}
