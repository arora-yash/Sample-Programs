import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc  = new Scanner(System.in);
    int n = sc.nextInt();
    int a = sc.nextInt();
    int d = sc.nextInt();

    int sum = 0;
    for(int i = 0;i<n;i++)
      sum = ((n/2)*(2*a+(n-1)*d));

    System.out.println(sum);
  }
}
