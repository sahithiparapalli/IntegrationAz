package Pack1;
import java.util.Scanner;

public class GreaterNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		double N1;
		double N2;
		System.out.println("Enter Number1 for comparision: ");
		N1=scan.nextDouble();
		System.out.println("Enter Number2 for comparision: ");
		N2=scan.nextDouble();
		if (N1>N2)
		{
			System.out.println(N1+ "  Number1 is greatest");
		}
		else {
			System.out.println(N2+ "  Number2 is greatest");
		}
		scan.close();
	}

}
