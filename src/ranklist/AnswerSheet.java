package ranklist;

import java.util.Set;

public class AnswerSheet {
	
	String rollNo;
	String name;
	Set<Answer> answer;
	
	public String getRollNo() {
		return rollNo;
	}
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<Answer> getAnswer() {
		return answer;
	}
	public void setAnswer(Set<Answer> answer) {
		this.answer = answer;
	}
	@Override
	public String toString() {
		return "AnswerSheet [rollNo=" + rollNo + ", name=" + name + ", answer=" + answer + "]";
	}
	
	
}


