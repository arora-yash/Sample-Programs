import java.util.*;
public class Test {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int temp=n,reverse=0,r;

    while(temp!=0) {
      r = temp%10;
      reverse = reverse*10 + r;
      temp = temp/10;
    }

    if(reverse == n)
      System.out.println("yes");
    else
      System.out.println("no");
  }
}
