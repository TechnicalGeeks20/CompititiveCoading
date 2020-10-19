import java.util.Scanner;

public class Subnegativearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int count=0;
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			for(int j=i;j<n-i;j++) {
				Integer check=0;
				for(int p=j-i;p<=j;p++) {
					check=check+a[p];
				}			
				if(check<0) {
					count++;
				}
			}
		}
		System.out.println(count);

	}

}
