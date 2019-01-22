import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();

    int count = 0;
    Pattern p = Pattern.compile("[^a-z0-9]",Pattern.CASE_INSENSITIVE);
    Matcher m = p.matcher(str);

    while(m.find()) {
      count++;
    }

    System.out.println(count);
  }
}
