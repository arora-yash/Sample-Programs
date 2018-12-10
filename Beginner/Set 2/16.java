import java.util.*;
public class Test {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int first = sc.nextInt();
    int last = sc.nextInt();

    for(int i = first+1;i < last;i++) {
      int count = 0;
      for(int i = 2;i <= Math.sqrt(n);i++)
      	if(n%i==0)
      		count++;

      if(count == 0)
        System.out.println(i+" ");
    }
  }
}
