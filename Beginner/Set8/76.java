import java.util.*;

public class Main {

  static String isComposite(int n) {
    if(n<=3)
      return "no";
    else {
      if(n%2==0 || n%3==0)
        return "yes";
      for(int i = 5;i*i<=n;i+=6)
        if(n%i == 0 || n%(i+2)==0)
          return "yes";
      return "no";
    }
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println(isComposite(n));
  }
}
