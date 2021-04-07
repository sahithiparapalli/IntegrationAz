package Pack1;
import java.io.*;

public class fileio {

	public static void main(String[] args) throws IOException
	{
		FileOutputStream fos=new FileOutputStream("/Users/sonyparepally/newfile.exe");
		PrintWriter pw=new PrintWriter(fos);
		pw.println("hi ram");
		pw.close();
		fos.close();
		// TODO Auto-generated method stub

	}

}
