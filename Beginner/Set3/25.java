import java.util.*;
public class Test {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];

		int temp,median;
		for(int i = 0;i<n;i++)
			a[i] = sc.nextInt();

		for(int i = 0;i<n;i++) {
			for(int j = i+1;j<n;j++) {
				if(a[i]>a[j]) {
					temp = a[i];
					a[i]=a[j];
					a[j] = temp;
				}
			}
		}
	
		if(n%2!=0)
			median = a[n/2 + 1];
		else
			median = (a[n/2+1]+a[n/2])/2;

		System.out.println(median);
	}
}
		