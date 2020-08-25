
public class studentManipulation {
	public Student[] createStudents() {
		Student student[]= new Student[4];
		student[0]=new Student("Aishwarya","12th",99,99,67,98,69);
		student[1]=new Student("Aditi","12th",70,87,67,98,69);
		student[2]=new Student("Komal","12th",90,87,67,98,69);
		student[3]=new Student("Sayali","12th",90,87,67,98,69);
		return student;
	
	}
	
	public int total(Student s) {
		return(s.getSub1()+s.getSub2()+s.getSub3());
	}
	
	public Student findMax(Student student[]) {
		int max=0;
		Student maxStudent = null;
		for(Student s:student) {
			int t = total(s);
			if(t>max) {
				max=t;
				maxStudent=s;
			}
		}
		return maxStudent;
	}
	
	
}
