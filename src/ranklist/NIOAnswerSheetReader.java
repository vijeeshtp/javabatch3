package ranklist;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NIOAnswerSheetReader implements AnswerSheetReader{
	String filePath;
	
	public NIOAnswerSheetReader() {
		super();
	}
	
	public NIOAnswerSheetReader(String filePath) {
		super();
		this.filePath = filePath;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	
	List <String> readlines() {
		
		List<String> lines = new ArrayList<String>();
		try {
			Charset charset = Charset.forName("US-ASCII");
			Path path = FileSystems.getDefault().getPath(filePath);
			BufferedReader bufferedReader = Files.newBufferedReader(path,charset);
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

	public List<AnswerSheet> readAnswerSheet() {
		List<AnswerSheet> answerSheetList = new ArrayList<AnswerSheet>();
		AnswerSheet answerSheet = new AnswerSheet();
		System.out.println("inside...");
		Set<Answer> answers= new HashSet<Answer>();
		for (String line : readlines()){
			System.out.println("line ->>"+line);
			String [] token =line.split(" ");
			answers.add(new Answer(token[0], token[1]));
		}
		answerSheet.setName("Vijeesh");
		answerSheet.setRollNo("12345");
		answerSheet.setAnswer(answers);
		answerSheetList.add(answerSheet);		
		return answerSheetList;
	}
	
	/**
	 * 
	 * @param directory
	 * @return
	 */
	 public static List<String> fileList(String directory) {
	        List<String> fileNames = new ArrayList();
	        try (DirectoryStream<Path> directoryStream = Files.newDirectoryStream(Paths.get(directory))) {
	            for (Path path : directoryStream) {
	                fileNames.add(path.toString());
	            }
	        } catch (IOException ex) {
	        	ex.printStackTrace();
	        }
	        return fileNames;
	    }
	
}
