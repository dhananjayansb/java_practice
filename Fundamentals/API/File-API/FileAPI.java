import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.BufferedReader;
class FileAPI
{
	static void writing() throws IOException
	{
		File f = new File("File.txt");
		boolean b = false;
		FileWriter fw = null;
		b = f.createNewFile();
		System.out.println(b);
		fw = new FileWriter(f);//passing object here bcz using file class in args
		fw.write("Checking FileWriter in this code after using throws exception and created method for writing alone. and reader also created and tested");
		fw.close();
		System.out.println("Passed FileWriter");
	}
	static void reading() throws IOException
	{
		File f = new File("File.txt");
		FileReader fr = new FileReader(f);
		char arr[] = new char[100];
		fr.read(arr);
		System.out.println(arr);
		
	}
	static void bufferedwriting() throws IOException
	{
		FileWriter fw = new FileWriter("File.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("Over writing using Buffered Writter");
		bw.close();
	}
	static void bufferedreading() throws IOException
	{
		FileReader fr = new FileReader("File.txt");
		BufferedReader br = new BufferedReader(fr);
		int i=0;
		while((i=br.read())!= -1)
		{
			System.out.print((char)i);
		}
		br.close();
	}
	public static void main(String [] args) throws IOException
	{
		writing();
		reading();
		bufferedwriting();
		bufferedreading();
	}
}