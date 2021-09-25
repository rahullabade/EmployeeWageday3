package employeewage;

public class Empwageuc5 {

	public static void main(String[] args) {
		int empRatePerHr = 20;
		int empworkingHr = 0;
		int empHrs = 0;
		int empwage = 0;
		int totalEmpwage = 0;
		
		double empCheck = Math.floor(Math.random() *10 %3);
		int i = (int)empCheck;
		switch(1) {
		case 1:
			empHrs = 8;
			break;
		case 2:
			empHrs = 4;
			break;
		case 3:
			empHrs = 0;
			}
		empwage = empHrs * empRatePerHr;
		totalEmpwage += empwage;
		System.out.println("Empwage:" + empwage);
		System.out.println("Total Empwage:" + totalEmpwage);
		
	}
	
}
