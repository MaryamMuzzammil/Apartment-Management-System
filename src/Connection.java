
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Connection {

	String file="data.txt";
	
	
	void writeToFile(String text) throws IOException
	{
		FileWriter fw=new FileWriter(file,true);
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write(text);
		bw.newLine();
		bw.close();
	
	}
	
	 List<String> readfile() throws FileNotFoundException {
	        List<String> fileContent = new ArrayList<>();
		File f=new File(file);
		Scanner myreader=new Scanner(f);
		 while (myreader.hasNextLine()) {
		        String data = myreader.nextLine();
		        fileContent.add(data);
		        System.out.println(data);
		      }
		 return fileContent;
		
	}

}
