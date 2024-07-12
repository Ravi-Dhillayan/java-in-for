package fo;
import java.util.Scanner;

public class star {
	public static void main(String[] args) {
	int no5, i,j;
	System.out.println("Enter the  N no.: ");
	//Scanner o9=new Scanner(System.in);
	Scanner o0=new Scanner(System.in);
	no5=o0.nextInt();
	for(i=1;i<=5;i++)
	{
		for(j=1;j<=i;j++)
		{
			System.out.print("* ");
			
			//break;
			
		}
		System.out.println(" ");
	}
}
}
