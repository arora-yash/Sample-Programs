import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();

    char a[] = str.toCharArray();
    if(a[0]>=98 && a[0]<=122)
      a[0] = a[0]-32;
    for(int i = 0;i<a.length;i++) {
      if(a[i]>=98 && a[i]<=122)
        a[i] = a[i]-32;
    }
    System.out.println(a);
  }
}
