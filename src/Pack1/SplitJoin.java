package Pack1;
import java.util.*;
public class SplitJoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String main="hello;how;are;you";
String[]arr=main.split("\\;");
for(int i=0;i<arr.length;i++)
{
	System.out.println(arr[i]);
	}
String newstr=String.join("!",arr[0],arr[1]);
String newstr1=String.join(" ",arr[2],arr[3]);
System.out.print(newstr);
System.out.print(newstr1);

	}

}
