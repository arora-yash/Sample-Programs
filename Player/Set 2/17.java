import java.util.*;

public class Main {

  static int gcd(int a, int b) {
    if(a==0)
      return b;
    return gcd(b%a,a);
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int l = sc.nextInt();
    int r = sc.nextInt();

    int hcf = gcd(l,r);

    System.out.println((int)((l*r)/hcf));
  }
}
