package fo;
import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
//		Write a program that prompts the user to input a positive integer. It should then output a message indicating whether the number is a prime number. 

		// TODO Auto-generated method stub
		int n,pr=1;
		System.out.println("Enter the three No. ");
		Scanner o=new Scanner(System.in);
		n = o.nextInt();
		if(n<=1) {
			pr=0;
		}
		else{
		for(int i=2;i*i<=n;i++) {
			if(n%i==0) {
				pr=0;
				break;
			}
		}
		}
		if(pr==1) {
			System.out.println("This is prime Number : "+n);
		}
		else {
			System.out.println("This is not prime Number : "+n);
		}
	}

}
