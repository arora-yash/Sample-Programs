import java.util.*;
public class Test {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		int temp;
		
		for(int i = 0;i<n;i++)
			a[i] = sc.nextInt();

		
		for(int i = 0;i<n;i++)
			System.out.println(a[i]+" "+i);

	}
}