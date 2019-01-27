import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();

    str = str.toLowerCase();
    char ch;
    int count = 0;
    for(int i = 0;i<str.length();i++) {
      ch = str.charAt(i);
      if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
        count++;
    }
    if(count > 0)
      System.out.println("yes");
    else
      System.out.println("no");
  }
}
