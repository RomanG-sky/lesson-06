package lgs.lviv.ua_hw_salary;

public class WorkerSlave implements Salary{	
	private double salary;

	public WorkerSlave(double salary) {
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
		System.out.println("Зарплата працівника в місяць  при денній оплаті = " + (salary*20));
		
	}
	

}
