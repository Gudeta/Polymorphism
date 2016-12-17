
public class TemporaryEmployee extends Employee {
String passId;
	public TemporaryEmployee(String name, String pId, double salary) {
		super(name, salary);
		this.passId=pId;
	}
	@Override
	public double calculateSalary() {
		return getSalary()*200;
	}
}
