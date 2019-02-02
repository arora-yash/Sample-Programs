import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    int n = sc.nextInt();

    char ch;
    int l = str.length();
    for(int i = l-n;i<l;i++) {
      ch = str.charAt(i);
      System.out.print(ch);
    }
  }
}
