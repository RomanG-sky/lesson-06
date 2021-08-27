package lgs.lviv.ua_hw_salary;

public class Application {

	public static void main(String[] args) {
		WorkerGod RichSlawe = new WorkerGod(12);
		WorkerSlave PoorSlawe = new WorkerSlave(90);
		RichSlawe.SalaryCalculate();
		PoorSlawe.SalaryCalculate();
	}

}
