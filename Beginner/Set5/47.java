import java.util.*;
import static java.util.stream.Collectors.toList;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    Integer a[] = new Integer[n];

    for(int i = 0;i<n;i++)
      a[i] = sc.nextInt();

    int min = Collections.min(Arrays.asList(a));
    int max = Collections.max(Arrays.asList(a));

    System.out.println(min + " "+max);
  }
}
