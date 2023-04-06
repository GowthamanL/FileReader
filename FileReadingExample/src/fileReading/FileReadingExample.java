package fileReading;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReadingExample {

	public static void main(String[] args) throws IOException {

		String location="File.txt";

		FileReader fileReader=new FileReader(location);

		BufferedReader reader=new BufferedReader(fileReader);

		/*if we want to read firstline

		String line=reader.readLine();
		System.out.println(line);*/

		//		if we want to read entire file

		String line;

		while(( line=reader.readLine())!=null) {

			System.out.println(line);
		}
		reader.close();
	}
}
