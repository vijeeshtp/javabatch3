package ranklist;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class AnswerSheetProcessorImpl implements AnswerSheetProcessor {

	AnswerKeyReader answerKeyReader;
	AnswerSheetReader answerSheetReader;
	
	public List<EvalutaionInfo> evaluateAnswerSheet() {
		List<EvalutaionInfo> evalutaionInfoList = new ArrayList();
		Map<String,Answer> answerKeyMap= answerKeyReader.readAnswerKeyMap();
		List<AnswerSheet> answerSheets= answerSheetReader.readAnswerSheet();
		System.out.println("answerKey>>"+ answerKeyMap);
		System.out.println("answerSheet>>"+ answerSheets);
		
		for ( AnswerSheet answerSheet : answerSheets){
			int totalMark= 0;
			Set<Answer> answers =  answerSheet.getAnswer();	
			for ( Answer ans :answers ){
				Answer correctAnswer= answerKeyMap.get(ans.getQuestionNumber());
				if (correctAnswer != null && correctAnswer.getAnswer().equals(ans.getAnswer())){
					totalMark= totalMark + correctAnswer.getMark();
				}
			}
			EvalutaionInfo evalutaionInfo= new EvalutaionInfo();
			evalutaionInfo.setName(answerSheet.getName());
			evalutaionInfo.setRollNumber(answerSheet.getRollNo());
			evalutaionInfo.setTotalMark(totalMark);
			
			evalutaionInfoList.add(evalutaionInfo);
		}
		
		return evalutaionInfoList;
	}
	
	
	
	
	
	
	public AnswerKeyReader getAnswerKeyReader() {
		return answerKeyReader;
	}

	public void setAnswerKeyReader(AnswerKeyReader answerKeyReader) {
		this.answerKeyReader = answerKeyReader;
	}

	public AnswerSheetReader getAnswerSheetReader() {
		return answerSheetReader;
	}

	public void setAnswerSheetReader(AnswerSheetReader answerSheetReader) {
		this.answerSheetReader = answerSheetReader;
	}

}
