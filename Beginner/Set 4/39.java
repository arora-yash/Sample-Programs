import java.util.*;
public class Test {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[10];

		for(int i = 0;i<=9;i++)
			a[i] = sc.nextInt();

		int max = a[0];
		for(int i = 0;i<=9;i++)
			if(max < a[i])
				max = a[i];

		System.out.println(max);
	}
}
