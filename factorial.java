                      //Write a program to find the factorial value of any number entered through the keyboard. 

package fo;
import java.util.Scanner;

public class factorial {
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
