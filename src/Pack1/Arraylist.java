package Pack1;
import java.util.*;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList<String>();
		al.add("apple");
		al.add("orange");
		al.add("Mango");
		for(String str:al)
		{
			System.out.println(str);
			
		}
		
		System.out.println("New array list");
		al.remove(2);
		al.add(1, "Kiwi");

	for(String str:al)
	{
		System.out.println(str);
	}
	}

}
