import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    str = str.toLowerCase();
    if(str.equals("saturday") || str.equals("sunday"))
      System.out.println("yes");
    else
      System.out.println("no");
  }
}
