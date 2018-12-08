import java.util.*;
public class Test {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    char ch = sc.next();

    if((ch>=97&&ch<=122)||(ch>=65&&ch<=90))
      System.out.println("Alphabet")
    else
      System.out.println("No");
  }
}
