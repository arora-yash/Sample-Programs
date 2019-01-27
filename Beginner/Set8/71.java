import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();

    StringBuilder sb = new StringBuilder(str);
    String temp = sb.reverse().toString();

    if(temp.equals(str))
      System.out.println("yes");
    else
      System.out.println("no");
  }
}
