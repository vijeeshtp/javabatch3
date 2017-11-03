package ranklist;

class Answer {
	String questionNumber;
	String answer;
	Integer mark;
	
	public Answer(String questionNumber, String answer) {
		super();
		this.questionNumber = questionNumber;
		this.answer = answer;
	}

	public Answer(String questionNumber, String answer, Integer mark) {
		super();
		this.questionNumber = questionNumber;
		this.answer = answer;
		this.mark = mark;
	}

	public String getQuestionNumber() {
		return questionNumber;
	}
	
	public void setQuestionNumber(String questionNumber) {
		this.questionNumber = questionNumber;
	}
	
	public String getAnswer() {
		return answer;
	}
	
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	public Integer getMark() {
		return mark;
	}
	
	public void setMark(Integer mark) {
		this.mark = mark;
	}

	@Override
	public String toString() {
		return "Answer [questionNumber=" + questionNumber + ", answer=" + answer + ", mark=" + mark + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((questionNumber == null) ? 0 : questionNumber.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Answer other = (Answer) obj;
		if (questionNumber == null) {
			if (other.questionNumber != null)
				return false;
		} else if (!questionNumber.equals(other.questionNumber))
			return false;
		return true;
	}
	
	
	
	
	
}