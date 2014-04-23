package com.ecp.worksheet_1;

public class ArrayList {
	private Object elementData[] = new Object[1];
	private int size = 0;

	private void ensureCapacity(int capacity) {
			if(capacity > elementData.length){
				Object arr[] = new Object[elementData.length*2];
				for (int i = 0; i < size; i++) {
					arr[i] = elementData[i];
				}
				elementData = arr;
			}
	}

	public void add(Object e) {
		add(size,e);
	}

	public void add(int i,Object e) {
		ensureCapacity(size+1);
		for (int j = size-1; j >= i; j--) {
				elementData[j+1] = elementData[j];
		}
		elementData[i] = e;
		size++;
	}
	public String toString() { 
		String set = "[";
		for (int i = 0; i < size; i++) {			
			if(i == size-1){
				set = set+elementData[i]+"]";
			}else{
				set = set+elementData[i]+",";
			}
		}
		return set;
		 }

	public int size() {				
		return size;
	}

	public void addFirst(Object e) {
		add(0,e);
	}

	public void addLast(Object e) {
		add(size,e);				
	}

	public Object get(int a) {
		Object get = elementData[a];
		return get;
	}

	public void remove(int i) { 
		 for (int j = i; j < size - 1; j++) { 
		 elementData[j] = elementData[j + 1]; 
		 } 
		 elementData[size-1] = null; 
		 size--; 
		 }
}