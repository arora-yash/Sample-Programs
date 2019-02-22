import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    char ch = sc.nextLine().charAt(0);

    int count = 0;
    for(int i = 0;i<str.length();i++) {
      Character c = new Character(str.charAt(i));
      if(c.compareTo(ch) == 0)
        count++;
    }
    System.out.println(count);
  }
}
