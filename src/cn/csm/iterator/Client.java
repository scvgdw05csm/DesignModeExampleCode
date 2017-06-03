package cn.csm.iterator;

public class Client {

	public static void main(String[] args) {
		PayManager payManager = new PayManager();
		payManager.calcPay();
		System.out.println("group salary list:");
		test(payManager.createIterator());
		
		SalaryManager salaryManager = new SalaryManager();
		salaryManager.calcSalary();
		System.out.println("purchased company salary list:");
		test(salaryManager.createIterator());
	}
	
	private static void test(Iterator it) {
		it.first();
		while (!it.isDone()) {
			Object obj = it.currentItem();
			System.out.println("the obj==" + obj);
			it.next();
		}
	}
}
