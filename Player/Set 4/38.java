import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for(int i = 2;i<=n;i++)
      if(i%2==0)
        if(n%i==0)
          System.out.print(i+" ");
  }
}
