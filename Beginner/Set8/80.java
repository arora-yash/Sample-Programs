import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int r,rev=0;
    while(n!=0) {
      r = n%10;
      rev = rev*10 + r;
      n = n/10;
    }
    while(rev!=0) {
      r = rev%10;
      if(r%2!=0)
        System.out.print(r+" ");
      rev = rev/10;
    }
  }
}
