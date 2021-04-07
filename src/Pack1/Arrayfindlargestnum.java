package Pack1;
import java.util.Scanner;

public class Arrayfindlargestnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
int[]number=new int[3];
int grt=0;
System.out.println("size of array is "+number.length);

for(int index=0;index<number.length;index++)
{
System.out.print("Enter number"+"["+index+"]");
number[index]=scan.nextInt();
}
for(int index=0;index<number.length;index++)
{
	if(grt<number[index])
	{
		grt=number[index];
	}	

}
System.out.print(grt);
//if(number[0]>number[1]&&number[0]>number[2])
//{
//System.out.print(+number[0]+" is highest");
//	}
//else if(number[1]>number[0]&&number[1]>number[2])
//{
//	System.out.print(+number[1]+" is highest");
	//}
//else {
	//System.out.print(+number[2]+" is highest");
//}

	}

}
