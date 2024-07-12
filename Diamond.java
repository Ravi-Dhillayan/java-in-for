package fo;

import java.util.Scanner;

class full{
	int i,n,j;
	public
	void fun() {
		int t=1;
		System.out.println("Enter the n number : ");
		Scanner o=new Scanner(System.in);
		n=o.nextInt();
		System.out.println("Printed your Diamond");
		for(i=1;i<=n*2;i++) {
			
			if(i<=n) {
				for(int k=n;k>=i;k--) {
					System.out.print(" ");
				}
				for(j=1;j<=i*2-1;j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			else {
				
				for(int k=0;k<t;k++) {
					System.out.print(" ");
				}
				for(int m=n*2;m>i;m--) {
					System.out.print("*");
				}
				System.out.println();
				t++;
			}
		}
		
	}
}

public class Diamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   full o=new full();
   o.fun();
	}

}
