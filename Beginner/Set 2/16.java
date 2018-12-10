import java.util.*;
public class Test {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int first = sc.nextInt();
    int last = sc.nextInt();

    for(int i = first+1;i < last;i++) {
      int count = 0;
      for(int j = 2;j <= Math.sqrt(n);j++)
      	if(i%j==0)
      		count++;

      if(count == 0)
        System.out.println(i+" ");
    }
  }
}
