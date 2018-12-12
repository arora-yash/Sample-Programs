import java.util.*;
public class Test {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		System.out.println(str);
	}
}
