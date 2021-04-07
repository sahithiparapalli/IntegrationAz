package Pack1;
import java.util.Scanner;

public class Tax {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Double salary;
		String gender;
		double tax;
		System.out.println("Enter the gender");
		gender=scan.toString();
		System.out.println("Enter the amount of salary");
		salary=scan.nextDouble();
	
		if(gender=="male") {
			if (salary<=100000)
			{
				tax=0;
				System.out.println("tax payable: "+tax);
			}
			if (salary>100000&& salary<=500000)
			{
				tax=salary*0.1;
				System.out.println("tax payable: "+tax);
			}
			else
			{
				tax=salary*0.2;
				System.out.println("tax payable: "+tax);
			}
		}
		// TODO Auto-generated method stub

	}

}
