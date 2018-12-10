import java.util.*;
public class Test {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int first = sc.nextInt();
    int last = sc.nextInt();

    for(int i = first+1;i < last;i++)
      if(i%2!=0)
        System.out.println(i+" ");
  }
}
