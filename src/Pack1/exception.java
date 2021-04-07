package Pack1;

public class exception {

	public static void main(String[] args) {
		int i=0;
		int j=10;
		try {
			int k=j/i;
			
			System.out.println(k);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.printf("Arthematic Exception %s",e.toString());
			System.out.println("/n");
		}
		finally
		{
			System.out.println("Im in final block");
		}
		// TODO Auto-generated method stub
		System.out.println("Im outside try catch");
	}

}
