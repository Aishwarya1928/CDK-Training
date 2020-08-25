
public class testStudent {
  public static void main(String[] args) {
	studentManipulation sm = new studentManipulation();
	Student students[] = sm.createStudents();
	for(Student s:students) {
		s.display();
	}
	System.out.println("Student with highest marks:");
	sm.findMax(students).display();
}
}
