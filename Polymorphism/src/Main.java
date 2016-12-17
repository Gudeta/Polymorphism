

public class Main {

	public static void main(String[] args) {

		Payable[] pay = new Payable[3];
		pay[0] = new Employee("Segni", 1000);
		pay[1] = new Employee("Abebe", 3500);
		pay[2] = new Employee("Siifan", 2000);
		pay[2] = new TemporaryEmployee("Siifan","Pass123", 2000);

		// Display Employee name with their Salary
		for (Payable e : pay)
			System.out.println(e.toString());

		// Calculate Total salary The company pay for the Employee
		double totalsalary = 0;
		for (Payable p : pay)
			totalsalary = totalsalary + p.calculateSalary();
		System.out.println("Total salary is :" + totalsalary);

		// get maximum paid Employee
		double maximum = -1;
		String name = "";
		for (Payable p : pay) {
			if (p.calculateSalary() > maximum)
				maximum = p.calculateSalary();

		}
		System.out.println("Maximum Salary is paid for :" + name + " He Earn :" + maximum);

	}

}