package Pack1;
import java.util.Scanner;

public class Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double N;
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the number: ");
		N=scan.nextDouble();
		if (N%2==0 && N%3==0)
			
		{
			System.out.println("Number is divisable by 2 and 3");
		}
		
		else
		{
		System.out.println("Number is not divisable by 2 and 3");
			}

	}

}
