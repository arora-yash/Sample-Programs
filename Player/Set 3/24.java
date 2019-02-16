import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();

    char ch;
    int flag = 0;
    for(int i = 0;i<str.length();i++) {
      ch = str.charAt(i);
      if(ch>=48 && ch<=57)
        continue;
      else {
        flag=1;
        break;
      }
    }
    if(flag==1)
      System.out.println("no");
    else
      System.out.println("yes");
  }
}
