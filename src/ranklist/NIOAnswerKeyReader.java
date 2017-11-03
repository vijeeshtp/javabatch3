package ranklist;

import java.io.BufferedReader;
import java.nio.charset.Charset;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class NIOAnswerKeyReader implements AnswerKeyReader{

	String filePath;
	
	public NIOAnswerKeyReader() {
		super();
	}
	
	public NIOAnswerKeyReader(String filePath) {
		super();
		this.filePath = filePath;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public Map<String, Answer> readAnswerKeyMap() {
		System.out.println("inside...");
		Map<String,Answer> answerKeyMap= new HashMap<String, Answer>();
		for (String line : readlines()){
			System.out.println("line ->>"+line);
			String [] token =line.split(" ");
			answerKeyMap.put ( token[0] ,  new Answer(token[0], token[1], Integer.parseInt( token[2])));
		}
		return answerKeyMap;
	}
	
	
	
	List <String> readlines() {
		
		List<String> lines = new ArrayList<String>();
		try {
			Charset charset = Charset.forName("US-ASCII");
			//Path path = FileSystems.getDefault().getPath(filePath);
			Path path = Paths.get(filePath);
			BufferedReader bufferedReader = Files.newBufferedReader(path,
					charset);
			String line = null;
			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
				lines.add(line);
			}
			}catch (Exception e){
				e.printStackTrace();
				
		
	}
		return lines;
}

}