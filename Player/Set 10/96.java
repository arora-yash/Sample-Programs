import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    String str = Long.toString(n);
    System.out.println(Integer.parseInt(str.substring(0,1))+Integer.parseInt(str.substring(str.length()-1)));
  }
}
