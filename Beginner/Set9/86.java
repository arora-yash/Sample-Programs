import java.util.*;

public class Main {

  static String isIsogram(String str) {
    char arr[] = str.toCharArray();
    Arrays.sort(arr);
    for(int i = 0;i<arr.length-1;i++)
      if(arr[i] == arr[i+1])
        return "no";
    return "yes";
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    str = str.toLowerCase();
    System.out.println(isIsogram(str));
  }
}
