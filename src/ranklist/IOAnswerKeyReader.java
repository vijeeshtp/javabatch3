package ranklist;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class IOAnswerKeyReader implements AnswerKeyReader {

	public Map<String,Answer> readAnswerKeyMap() {
	
		List<String> lines= new ArrayList<>();
		
		try {
			
		//File file= new File("sdhfghs.txt");
		//Reader r = new FileReader(file);
		//int x= r.read();
		
		
		BufferedReader reader = new BufferedReader(new FileReader("abc.txt"));
		String line;
		while ((line =reader.readLine())!=null){
			lines.add(line);
		}
		
		} catch (IOException e){
			
		}
		
		System.out.println(lines);
		
		return null;
	}
	
	public static void main (String a[]){
		
		
		List<String> lines= new ArrayList<>();
		
		try {
			
		
		
			
		BufferedReader reader = new BufferedReader(new FileReader("answerkey/answerkey.txt"));
		String line;
		while ((line =reader.readLine())!=null){
			lines.add(line);
		}
		
		} catch (IOException e){
		 e.printStackTrace();	
		}
		
		System.out.println(lines);
		
		
	}
	
	
}
