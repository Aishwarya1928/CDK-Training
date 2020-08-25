
public class TestStudent {
	public static boolean search(Student[] students,Student student) {
		for(Student stu:students) {
			if(stu.getClass()==student.getClass()) {
				if(stu.equals(student)) {
					return true;
				}
			}
		}
		
	return false;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student students[] = new Student[7];
		 students[0] = new EnggStudent(11,"Aishwarya","CSE","MIT");
		 students[1] = new EnggStudent(12,"Komal","IT","VIT");
		 students[2] = new EnggStudent(13,"Sahil","CSE","MIT");
		 students[3] = new BscStudent(21,"Pooja","Science","MIT");
		 students[4] = new BscStudent(22,"Aditya","Arts","KRT");		 
		 students[5]= new CommereceStudent(34,"Sayali","finance","MIT");
		 students[6]= new CommereceStudent(35,"Vandana","Accounts","MIT");
		 
		 CommereceStudent c = new CommereceStudent(35,"Vandana","Accounts","MIT");
		 if(search(students,c)) {
			 System.out.println("student record found");
		 }
		 
		 EnggStudent e = new EnggStudent(12,"Aishwarya","CSE","MIT");
		 if(search(students,e)) {
			 System.out.println("student record not found");
		 }
	}
	
	
}
