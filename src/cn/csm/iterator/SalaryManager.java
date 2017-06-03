package cn.csm.iterator;

public class SalaryManager extends Aggregate {

	private PayModel[] pms = null;
	
	public PayModel[] getPays() {
		return pms;
	}
	
	public void calcSalary() {
		PayModel pm1 = new PayModel();
		pm1.setPay(2200);
		pm1.setUserName("wang5");
		
		PayModel pm2 = new PayModel();
		pm2.setPay(3600);
		pm2.setUserName("zhao6");
		
		pms = new PayModel[2];
		pms[0] = pm1;
		pms[1] = pm2;
	}

	@Override
	public Iterator createIterator() {
		return new ArrayIteratorImpl(this);
	}
	
	public Object get(int index) {
		Object retObj = null;
		if (index < pms.length) {
			retObj = pms[index];
		}
		return retObj;
	}
	
	public int size() {
		return pms.length;
	}
}
