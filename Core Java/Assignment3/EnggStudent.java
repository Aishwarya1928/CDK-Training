
public class EnggStudent extends Student{
	private String collegeName;
	private String stream;
	
	
	public EnggStudent() {
		super();
	}
	
	public EnggStudent(int rollno, String name, String stream, String collegeName) {
		super();
		this.collegeName = collegeName;
		this.stream = stream;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+stream+" "+collegeName+" ";
	}
	
	public boolean equals(Object obj) {
		EnggStudent student = (EnggStudent)obj;
		if(this.getName()==student.getName()&&this.getRollno()==student.getRollno()&&this.getStream()==student.getStream()&&this.collegeName==student.collegeName) {
			return true;
		}
		return false;
		
	}
}
