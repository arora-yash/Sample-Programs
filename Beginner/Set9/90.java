import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();

    char ch;
    for(int i = 0;i<str.length();i++) {
      ch = str.charAt(i);
      if(ch >= 48 && ch <= 57)
        System.out.print(ch);
    }
  }
}
