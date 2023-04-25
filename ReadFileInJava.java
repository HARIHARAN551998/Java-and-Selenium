package javaTask;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadFileInJava {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String location="./files/fileread.txt";

		FileReader fileReader= new FileReader(location);

		BufferedReader reader= new BufferedReader(fileReader);

		String currentLine;

		while((currentLine=reader.readLine())!=null){
			System.out.println(currentLine);
		}

	

	//file write
	String location1="./files/filewrite.txt";
	String content="I am get ready to work for your company!!!";

	FileWriter fileWriter = new FileWriter(location1);	 
	BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
	bufferedWriter.write(content);
	bufferedWriter.close();
	
	}

}
