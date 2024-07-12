                          //Write a program that prompts the user to input a positive integer. It should then print the multiplication table of that number. 


package fo;
import java.util.Scanner;
public class once {
	public static void main(String[] args) {
	int nu,i,tb=0;
	System.out.println("Enter the no. of table : ");
	Scanner o6=new Scanner(System.in);
	nu=o6.nextInt();
	for(i=1;i<=10;i++) {

		tb=nu*i;
		System.out.print(nu+"*"+i+"=");
		System.out.println(tb);
	}
}
}
