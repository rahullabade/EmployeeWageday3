package employeewage;

public class Empwaguc6 {

	public static void main(String[] args) {
		int totalSalary;
		int empRatePerHr = 20 ;
		int NUM_OF_WORKING_DAYS = 2;
		int totalworkingdays = 0;
		int max_Hr_In_month = 100;
		int empHrs = 0;
		int totalempHrs = 0;
		while(totalempHrs < max_Hr_In_month && totalworkingdays < NUM_OF_WORKING_DAYS)
		{
			totalworkingdays++;
			double empCheck = Math.floor(Math.random() *10)%3;
			int i = (int)empCheck;
			switch(i) {
			case 1:
				empHrs = 8;
				break;
			case 2:
				empHrs = 4;
				break;
			default:
				empHrs = 0;
	}
			totalempHrs = totalempHrs + empHrs ;
		}
		totalSalary = empRatePerHr * totalempHrs;
		System.out.println("tatol salary"+totalSalary);

	}

}
