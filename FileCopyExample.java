//Question:-
//Write a program to copy the data from one file to another file using FileInputStream and FileOutputStream.
//Input:-
//Package Name:-
package InputOutput;
//Importing Input File
import java.io.FileInputStream;
//Importing Output File
import java.io.FileOutputStream;
//Importing Exception File(IOException)
import java.io.IOException;
//File Name
class FileCopyExample
{
	public static void main(String[] args) throws IOException {// Class throws a exception which is IOException

		FileInputStream r=new FileInputStream("C:\\Users\\USER\\OneDrive\\Desktop\\sas1.txt.txt");//Input File
		FileOutputStream w=new FileOutputStream("C:\\Users\\USER\\OneDrive\\Desktop\\sas1-copy.txt.txt");//Output File

		int i;
		while((i=r.read())!=-1)//condition checking the file are reading file or not
		{
           w.write((char)i);//write process
		}
		System.out.println("Data copied succesfully...");//After Copy it will show here successfully

	}
}
//Output:-
//Data copied succesfully...