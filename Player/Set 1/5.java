import java.util.*;

public class Main {

  static int value(char a) {
    if(a == 'I')
      return 1;
    if(a == 'V')
      return 5;
    if(a == 'X')
      return 10;
    return 0;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();

    int res = 0,s1 = 0;
    for(int i = 0;i<str.length();i++) {
      s1 = value(str.charAt(i));
      if((i+1)<str.length()) {
        int s2 = value(str.charAt(i+1));
        if(s1>=s2)
          res = res + s1;
        else {
          res = res + s2 - s1;
          i++;
        }
      }
      else {
        res = res + s1;
        i++;
      }
    }
    System.out.print(res);
  }
}
