package com.ecp.worksheet_2;

import com.ecp.worksheet_1.ArrayList;

public class ArrayListPQ {
		ArrayList lst = new ArrayList();
		public void enQueue(Object e) {
			lst.add(e);
		}
		public Object deQueue() {	
			Object a = lst.set(maxIndex());
			lst.remove(maxIndex());
			return a;
		}
		private int maxIndex() {
		       int max = 0;
		       for (int i = 0; i < lst.getSize(); i++) {
		                 Comparable d = (Comparable) lst.set(i);
		                 Object maxObj = lst.set(max);
		                 if (d.compareTo(maxObj) > 0) {
		                            max = i;
		                 }
		       }
		       return max;
		}


}