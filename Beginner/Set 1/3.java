import java.util.*;
public class Test {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    char ch = sc.next();

    if((ch>=97&&ch<=122)||(ch>=65&&ch<=90)){
      if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
        System.out.println("Vowel");
      else
        System.out.println("Consonant");
    }
    else
      System.out.println("invalid");
  }
}
