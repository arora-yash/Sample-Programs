import java.util.*;
public class Test {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextint();

    int max = Math.max(Math.max(a,b),c);
    System.out.println(max);
  }
}
