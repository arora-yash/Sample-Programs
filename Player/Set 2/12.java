import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();

    int a[] = new int[n];
    int r = k%n;

    for(int i = 0;i<n;i++) {
      a[r] = sc.nextInt();
      r = (r+1) % n;
    }

    for(int i = 0;i<n;i++)
      System.out.print(a[i]+ " ");
    System.out.println();

  }
}
