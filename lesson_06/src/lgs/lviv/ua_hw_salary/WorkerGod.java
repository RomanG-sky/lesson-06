package lgs.lviv.ua_hw_salary;

public class WorkerGod implements Salary{

	private double salary;
	
	public WorkerGod(double salary) {
		super();
		this.salary = salary;
	}
	
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public void SalaryCalculate() {
		System.out.println("Зарплата працівника в місяць при погодинній оплаті = " + (salary*8*20));
	}
}