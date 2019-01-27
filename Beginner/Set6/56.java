import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();

    String numRegex   = ".*[0-9].*";
    String alphaRegex = ".*[a-zA-Z].*";

    if(str.matches(numRegex) && str.matches(alphaRegex))
      System.out.println("yes");
    else
      System.out.println("no");
  }
}
