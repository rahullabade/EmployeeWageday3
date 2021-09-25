package employeewage;

public class Empwageuc4 {

	public static void main(String[] args) {
		int empRatePerHr = 20;
		int empworkingHr = 0;
		
		double empCheck = Math.floor(Math.random() *10 %3);
		int i = (int)empCheck;
		switch(1) {
		case 1:
			empworkingHr = 8;
			break;
		case 2:
			empworkingHr = 4;
			break;
		case 3:
			empworkingHr = 0;
			}
		
		int salary = empworkingHr + empRatePerHr;
		System.out.println("Salary of the employee is:" + salary);
	}

}
