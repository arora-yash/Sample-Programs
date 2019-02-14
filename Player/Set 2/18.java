import java.util.*;

public class Main {

  static boolean isAnagram(char[] str, char[] st) {
    int n1 = str.length;
    int n2 = st.length;

    if(n1 != n2)
      return false;

    Arrays.sort(str);
    Arrays.sort(st);

    for(int i = 0;i<n1;i++)
      if(str[i] != st[i])
        return false;

    return true;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String str = "kabali";
    int count = 0;

    for(int i = 0;i<n;i++) {
      String st = sc.nextLine();
      char strArray[] = str.toCharArray();
      char stArray[] = st.toCharArray();

      if(isAnagram(strArray,stArray))
        count++;
    }
    System.out.println(count);
  }
}
