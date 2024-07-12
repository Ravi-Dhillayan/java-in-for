package fo;

//import java.util.Scanner;

public class Armsttrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                     //Write a program to print out all Armstrong numbers between 1 and 500. If sum of cubes of each digit of the number is equal to the number itself, then the number is called an Armstrong number.
	//	For example, 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 )
	
		int n,t, d1,d2,d3;
		System.out.println("Enter the three No. ");
		//Scanner o=new Scanner(System.in);
		//n= o.nextInt();
		for(n=1;n<=500;n++) {
			t=n;
			d1=t%10;
			t=t/10;
			d2=t%10;
			t=t/10;
			d3=t%10;
			if(d1*d1*d1+d2*d2*d2+d3*d3*d3==n) {
				System.out.println(n);
				
			}
		}
	}

}
