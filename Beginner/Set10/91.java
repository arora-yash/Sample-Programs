import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int l = sc.nextInt();
    int b = sc.nextInt();
    int h = sc.nextInt();

    System.out.print((2*(l*b+b*h+h*l))+" "+(l*b*h));
  }
}
