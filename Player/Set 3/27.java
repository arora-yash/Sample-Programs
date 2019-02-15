import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();

    char ch;
    for(int i = 0;i<str.length();i++) {
      ch = str.charAt(i);
      if(ch>=65 && ch<=90)
        ch = (char)(ch+32);
      else if(ch>=97 && ch<=122)
        ch = (char)(ch-32);
      System.out.print(ch);
    }
  }
}
