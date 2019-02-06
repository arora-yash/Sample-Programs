import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();

    char a[] = str.toCharArray();
    char ch;
    for(int i = 0;i<a.length;i+=2) {
      ch = a[i];
      a[i] = a[i+1];
      a[i+1] = ch;
    }
    System.out.println(a);
  }
}
