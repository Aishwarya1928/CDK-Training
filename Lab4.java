import java.util.Scanner;

class EmpManager {
	int currentIndex = 0;
	private Employee emp[] = new Employee[10];

	void createEmp(Employee e) {

		emp[currentIndex] = e;
		currentIndex++;
	}

	void updateEmp(int eno, Employee e) {

		
		for (int i = 0; i < currentIndex; i++) {

			if (emp[i].getEmpNo() == eno) {
				emp[i] = e;				
			}
		}		
		System.out.println("Record Updated for Employee No. " + eno);		 
	}

	void deleteEmp(int eno) {

		int index = -1;
		for (int i = 0; i < currentIndex; i++) {

			if (emp[i].getEmpNo() == eno) {

				index = i;
			}

		}
		for (int j = index; j < currentIndex - 1; j++) {

			emp[j] = emp[j + 1];
		}

		emp[currentIndex - 1] = null;
		currentIndex--;

	}

	void display() {

		for (int i = 0; i < currentIndex; i++) {
			System.out.println(emp[i]);
		}

	}
}

public class Lab4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		EmpManager empManager = new EmpManager();
		char choice;

		do {

			System.out
					.println("1.Create Employee Record \n2.Update Employee Details \n3.Delete Employee Record  \n4.Display All Employees");
			System.out.println("Enter your choice");
			int a = sc.nextInt();

			switch (a) {

			case 1:
				System.out.println("Enter Number, Name and Salary of the employee");
				Employee e = new Employee(sc.nextInt(), sc.next(), sc.nextDouble());
				empManager.createEmp(e);
				break;

			case 2:
				System.out.println("Enter Employee No.");
				int eno = sc.nextInt();

				System.out.println("Enter name and salary of the employee");
				Employee e1 = new Employee(eno, sc.next(), sc.nextDouble());
				empManager.updateEmp(eno, e1);
				break;

			case 3:
				System.out.println("Enter Employee Number");
				int enu = sc.nextInt();

				empManager.deleteEmp(enu);
				break;

			case 4:
				empManager.display();
				break;

			}

			System.out.println("Do you want to Continue?");
			choice = sc.next().charAt(0);

		} while (choice == 'y');

	}

}
