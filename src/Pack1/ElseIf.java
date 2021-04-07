package Pack1;
import java.util.Scanner;
public class ElseIf {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		double marks;
		System.out.println("Enter marks: ");
		marks=scan.nextDouble();
		
		if (marks>80&&marks<=100)
		{
			System.out.println("Grade A");
		}
		else if(marks>60&&marks<=80)
		{
			System.out.println("Grade B");
		}
		else if(marks>40&&marks<=60) {
		
		System.out.println("Grade C");
		}
		else if(marks>0&&marks<=40)
		{
			System.out.println("Fail");
		}
		else {
			System.out.println("Invalid entry");
		}
		scan.close();

	}

}
