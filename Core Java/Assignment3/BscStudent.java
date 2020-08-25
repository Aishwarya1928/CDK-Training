public class BscStudent extends Student{
	private String specialization;
	private String collegeName;
	
	public BscStudent() {
		super();
	}

	public BscStudent(int rollno,String name,String specialization, String collegeName) {
		super();
		this.specialization = specialization;
		this.collegeName = collegeName;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
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
		return super.toString()+specialization+" "+" "+collegeName;
	}
	
	public boolean equals(Object obj) {
		BscStudent student = (BscStudent)obj;
		if(this.getName()==student.getName()&&this.getRollno()==student.getRollno()&&this.getSpecialization()==student.getSpecialization()&&this.collegeName==student.collegeName) {
			return true;
		}
		return false;
		
	}

	
}
