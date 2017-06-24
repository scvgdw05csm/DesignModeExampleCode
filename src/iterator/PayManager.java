package iterator;

import java.util.ArrayList;
import java.util.List;

public class PayManager extends Aggregate {

	private List list = new ArrayList();
	
	public List getPayList() {
		return list;
	}
	
	public void calcPay() {
		PayModel pm1 = new PayModel();
		pm1.setPay(3800);
		pm1.setUserName("zhang3");
		
		PayModel pm2 = new PayModel();
		pm2.setPay(5800);
		pm2.setUserName("li4");
		
		list.add(pm1);
		list.add(pm2);
	}

	@Override
	public Iterator createIterator() {
		return new CollectionIteratorImpl(this);
	}
	
	public Object get(int index) {
		Object retObj = null;
		if (index < list.size()) {
			retObj = list.get(index);
		}
		return retObj;
	}
	
	public int size() {
		return list.size();
	}
}
