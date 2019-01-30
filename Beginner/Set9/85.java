import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();

    String strEven = "", strOdd = "";
    char ch;
    for(int i = 0;i<str.length();i++) {
      ch = str.charAt(i);
      if((i+1)%2!=0)
        strOdd = strOdd + ch;
      else
        strEven = strEven + ch;
    }
    System.out.println(strOdd+" "+strEven);
  }
}
