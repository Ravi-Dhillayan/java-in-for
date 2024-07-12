package fo;

import java.util.Scanner;

public class Fo2 {
	public static void main(String agr[]) {
		int i,num;
		float fs=0;
			System.out.println("Enter the  N no. of Fibonacci : ");
			Scanner o8=new Scanner(System.in);
			num=o8.nextInt();
			System.out.println("Value of the Fibonacci Series : ");
			for(i=1;i<=num;++i) {
				
				fs+=1/i;
			}
			System.out.println(fs);
	}
	 // PROGRAM FOR LOOP
		/*int i;
		for(i=1;i<=10;i++)
		{
			System.out.println(i);
		}*/
		/*int i1,sum=0;
		for(i1=1;i1<=10;i1++)
		{
			
			sum=sum+i1;
		}
		System.out.println(sum);
			}*/
		/*int nu,i,tb=0;
		System.out.println("Enter the no. of table : ");
		Scanner o6=new Scanner(System.in);
		nu=o6.nextInt();
		for(i=1;i<=10;i++) {

			tb=nu*i;
			System.out.print(nu+"*"+i+"=");
			System.out.println(tb);
		}*/
		/*int no,f=1,i,j=1;
		System.out.println("Enter the  N no. of Factorial : ");
		Scanner o7=new Scanner(System.in);
		no=o7.nextInt();
		for(i=no;i>=1;--i) {
		f=f*i;
		//j=J++;
		System.out.println(f+"*"+i+"="+f);
		//System.out.println(f);

			
		}
		System.out.println("Factorial N No.."+f);
		
	}*/
	
		
	/*	int n4;
	System.out.println("Enter the  N no.: ");
	//Scanner o9=new Scanner(System.in);
	Scanner o9=new Scanner(System.in);
	n4=o9.nextInt();
	for(int i=0;i<2;i++) {
		n4=n4%10;
		System.out.print("(");
		System.out.print(n4+"*"+n4+"*"+n4);
		System.out.print(")+");
	}*/
}
