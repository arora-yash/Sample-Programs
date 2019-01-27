import java.util.*;

public class Main {

  static boolean isBinary(int number) {
    while(number != 0) {
      if(number % 10 > 1)
        return false;
      number = number / 10;
    }
    return true;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();

    int number = Integer.valueOf(str);
    boolean result = isBinary(number);

    if(result == true)
      System.out.println("yes");
    else
      System.out.println("no");
  }
}
