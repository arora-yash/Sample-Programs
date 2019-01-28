import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();

    int l = str.length();
    for(int i = 0;i<l;i++) {
      if(l%2==0)
        str = str.substring(0,(l/2)-1) + "**" + str.substring((l/2)+1,l);
      else
        str = str.substring(0,(int)l/2) + "*" + str.substring((int)(l/2)+1,l);
    }

    System.out.println(str);
  }
}
