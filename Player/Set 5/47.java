import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    float a = sc.nextFloat();
    float b = sc.nextFloat();
    float c = sc.nextFloat();

    if(a!=0 && b!=0 && c!=0) {
      if((a+b+c) == 180)
        System.out.println("yes");
      else
        System.out.println("no");
    }
    else
      System.out.println("no");
  }
}
