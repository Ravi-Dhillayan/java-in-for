             //Write a program to print out all Armstrong numbers between 1 and 500. If sum of cubes of each digit of the number is equal to the number itself, then the number is called an Armstrong number.
                //For example, 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 )
package fo;
import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
	      // FIBONACCI
			int i,num,term1=0 ,term2=1,nt;
			System.out.println("Enter the  N no. of Fibonacci : ");
			Scanner o8=new Scanner(System.in);
			num=o8.nextInt();
			System.out.println("Value of the Fibonacci Series : ");
			for(i=1;i<=num;++i) {
				System.out.println(term1);
				nt=term1+term2;
				term1=term2;
				term2=nt;
			}
	}
}
