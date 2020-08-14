  
import java.util.Scanner;

class Employee {

	private int empNo;
	private String eName;
	private double salary;

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return eName;
	}

	public void setEmpName(String empName) {
		this.eName = empName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Employee(int empNo, String empName, double salary) {
		this.empNo = empNo;
		this.eName = empName;
		this.salary = salary;
	}
	
	
	
	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", empName=" + eName + ", salary=" + salary + "]";
	}

}

public class Lab33 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Employee e[] = new Employee[5];

		for (int i = 0; i < 5; i++) {

			System.out.println("Enter Empno, name and salary of employee " + i);

			e[i] = new Employee(sc.nextInt(), sc.next(), sc.nextDouble());

		}
		
		System.out.println("Details of Employees are:");
		
		for(int i = 0 ; i < 5 ; i++  ) {
			
			System.out.println(e[i]);
			
		}
		
		sc.close();

	}

}
