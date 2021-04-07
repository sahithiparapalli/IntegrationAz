package Pack1;
import java.util.*;
import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int[][] arr=new int[2][3];
		for (int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.printf("Enter value for [%d%d]",i,j);
				
				arr[i][j]=scan.nextInt();
			}
		}
		// TODO Auto-generated method stub
		for (int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]);
				System.out.print("\t");
				
			}
			System.out.println();
		}
		
	}

}
