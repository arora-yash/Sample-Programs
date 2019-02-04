import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();

    char a[] = str.toCharArray();
    if(a[0]>=97 && a[0]<=122)
      a[0] = (char)(a[0] - 32);
    for(int i = 1;i<a.length;i++) {
      if(a[i] == ' ')
        if(a[i+1]>=97 && a[i+1]<=122)
          a[i+1] = (char)(a[i+1] - 32);
    }
    System.out.println(a);
  }
}
