package ranklist;

public class EvalutaionInfo {
	
	String rollNumber;
	String name;
	int totalMark;
	
	public String getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(String rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTotalMark() {
		return totalMark;
	}
	public void setTotalMark(int totalMark) {
		this.totalMark = totalMark;
	}
	@Override
	public String toString() {
		return "EvalutaionInfo [rollNumber=" + rollNumber + ", name=" + name + ", totalMark=" + totalMark + "]";
	}
	
	
	
	
}
