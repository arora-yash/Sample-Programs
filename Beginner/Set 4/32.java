import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();

    char ch;
    int count = 0;
    for(int i = 0;i<str.length();i++) {
      ch = str.charAt(i);
      if(ch == ' ')
        count++;
    }

    System.out.println(count+1);
  }
}
