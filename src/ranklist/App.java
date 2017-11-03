package ranklist;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {      
        NIOAnswerKeyReader answerKeyReader = new NIOAnswerKeyReader();
        answerKeyReader.setFilePath("answerkey/answerkey.txt");
        Map<String,Answer> answerkey= answerKeyReader.readAnswerKeyMap();
       
        System.out.println(answerkey);
        
        NIOAnswerSheetReader answerSheetReader = new NIOAnswerSheetReader();
        answerSheetReader.setFilePath("answersheet/vijeesh.txt");
        List<AnswerSheet> answerSheetList= answerSheetReader.readAnswerSheet();
        
        System.out.println(answerSheetList);
        
        AnswerSheetProcessorImpl processor= new AnswerSheetProcessorImpl() ;
        processor.setAnswerKeyReader(answerKeyReader);
        processor.setAnswerSheetReader(answerSheetReader);  
        List<EvalutaionInfo> evaluationList= processor.evaluateAnswerSheet();
        
        System.out.println("evaluationList>>"+ evaluationList);
        
    }
}
