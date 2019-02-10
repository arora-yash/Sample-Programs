import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();

    char ch;
    for(int i = 0;i<str.length();i++) {
      ch = str.charAt(i);
      ch = (int)ch + 3;
      if(ch>=122 || ch>=90)
        ch -= 26;
      System.out.print(ch);
    }
  }
}
