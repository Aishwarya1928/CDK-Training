
public class CommereceStudent extends Student{
 private String major_subject;
 private String collegeName;
  
public CommereceStudent() {
	super();
}

public CommereceStudent(int rollno,String name,String major_subject, String collegeName) {
	super();
	this.major_subject = major_subject;
	this.collegeName = collegeName;
}

public String getMajor_subject() {
	return major_subject;
}

public void setMajor_subject(String major_subject) {
	this.major_subject = major_subject;
}

public String getCollegeName() {
	return collegeName;
}

public void setCollegeName(String collegeName) {
	this.collegeName = collegeName;
}
 @Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+major_subject+" "+collegeName;
	}
 public boolean equals(Object obj) {
		CommereceStudent student = (CommereceStudent)obj;
		if(this.getName()==student.getName()&&this.getRollno()==student.getRollno()&&this.getMajor_subject()==student.getMajor_subject()&&this.collegeName==student.collegeName) {
			return true;
		}
		return false;
		
	}

}
