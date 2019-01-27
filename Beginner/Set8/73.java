import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int l = sc.nextInt();
    int r = sc.nextInt();

    if(l<n && r>n)
      System.out.println("yes");
    else
      System.out.println("no");
  }
}
