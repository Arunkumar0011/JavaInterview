package collection;

import java.util.ArrayList;

public class CustomeArrayNotAllowDuplicate extends ArrayList {
	
	
		
	@Override
	public boolean add(Object e) {
		if(this.contains(e)) {
			return true;
		} else {
		return super.add(e);
		}
	}
	
	public static void main(String[] args) {

		CustomeArrayNotAllowDuplicate list = new CustomeArrayNotAllowDuplicate();
		list.add(1);
		list.add(1);
		list.add(2);
		list.add(2);
		list.add(3);
		
		System.out.println(list);

	}
}
