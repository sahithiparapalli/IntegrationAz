package Pack1;
import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		
		// TODO Auto-generated method stub
//System.out.println("Hello World");
		double r=0.0;
		double pi=3.141;
		System.out.println("Enter Radius of circle : ");
		r=scan.nextDouble();
		double a=pi*r*r;
		
		System.out.println("area of the circle"+" "+ a);
		scan.close();
		
	}

}
