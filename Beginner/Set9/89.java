import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();

    char ch;
    for(char i = 'a';i<='z';i++)
      for(int j = 0;j<str.length();j++) {
        ch = str.charAt(j);
        if(ch == i)
          System.out.print(ch);
      }
  }
}
