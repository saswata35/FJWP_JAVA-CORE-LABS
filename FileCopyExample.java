package InputOutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
class FileCopyExample
{
	public static void main(String[] args) throws IOException {

		FileInputStream r=new FileInputStream("C:\\Users\\USER\\OneDrive\\Desktop\\sas1.txt.txt");
		FileOutputStream w=new FileOutputStream("C:\\Users\\USER\\OneDrive\\Desktop\\sas1-copy.txt.txt");

		int i;
		while((i=r.read())!=-1)
		{
           w.write((char)i);
		}
		System.out.println("Data copied succesfully...");

	}
}