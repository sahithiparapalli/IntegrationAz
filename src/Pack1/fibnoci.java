package Pack1;

public class fibnoci {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int a=0;
		int b=1;
		int n=100;
		int sum;
		System.out.println(a+""+b);
		for(int i=2;i<n;i++)
		{
			sum=a+b;
			System.out.println(""+sum);
			a=b;
			b=sum;
			
		}

	}

}
