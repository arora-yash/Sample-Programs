import java.util.*;
public class Test {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int first = sc.nextInt();
		int last = sc.nextInt();

		for(int i = first+1;i<last;i++) {
			int r,sum=0;
			
			int temp = i;
			while(temp!=0) {
				r = temp%10;
				sum = sum + r;
				temp=temp/10;
			}
			
			if(i == sum)
				System.out.print(i+" ");
		}
	}
}