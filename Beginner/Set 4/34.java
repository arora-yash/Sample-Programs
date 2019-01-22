import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();

    char ch;
    int count = 0;
    for(int i = 0;i<str.length();i++) {
      ch = str.charAt(i);
      if(ch == '.')
        count++;
    }
    char last = str.charAt(str.length()-1);
    if(last == '.' || last == '?' || last == '!')
      System.out.println(count);
    else
      System.out.println(count++);
  }
}
