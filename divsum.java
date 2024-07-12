package fo;
import java.util.Scanner;
public class divsum {

	public static void main(String[] args) {
		
		float sum=0, i,n;
		System.out.println("Enter the X no.");
		Scanner o0=new Scanner(System.in);
		n=o0.nextFloat();
		for(i=1;i<=n;i++) {
			sum=sum+(1/i);
		}
		System.out.println(sum);

	}

}
