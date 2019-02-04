import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();

    int a[] = new int[n];
    for(int i = 0;i<n;i++)
      a[i] = sc.nextInt();

    int odd = 0;
    for(int i = 0;i<n;i++) {
      if(a[i]%2!=0) {
        odd = a[i];
        k--;
      }
      if(k == 0)
        break;
    }
    System.out.println(odd);
  }
}
