import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();

    int i = 0;
    for(char ch : str.toCharArray())
      i++;

    System.out.println(i);
  }
}
