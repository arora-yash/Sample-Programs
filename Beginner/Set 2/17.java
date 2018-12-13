import java.util.*;
public class Test {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int temp = n;
		int r,sum=0;
		while(temp!=0) {
			r = temp%10;
			sum = sum + (r*r*r);
			temp = temp/10;
		}
		if(sum == n)
			System.out.println("yes");
		else
			System.out.println("no");
	}
}