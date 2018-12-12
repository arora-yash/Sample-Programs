import java.util.*;
public class Test {
	public static void main(STring args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int reverse = 0,r = 0;

		while(n!=0) {
			r = n%10;
			reverse = reverse*10 + r;
			n = n/10;
		}
		
		System.out.println(reverse);
	}
}