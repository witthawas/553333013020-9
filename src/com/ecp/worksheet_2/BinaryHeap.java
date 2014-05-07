package com.ecp.worksheet_2;

import java.util.Arrays;

public class BinaryHeap {
	private Object elementData[] = new Object[1];
	private int size = 0;

	public void enQueue(Object e) {
		ensureCapasity(size + 1);
		elementData[size] = e;
		fixUp(size);
		size++;
	}

	public Object deQueue() {

		return 0;
	}

	@Override
	public String toString() {
		Object arr[] = new Object[size];
		for (int i = 0; i < size; i++) {
			arr[i] = elementData[i]; 
		}
		return Arrays.toString(arr);
	}

	private void ensureCapasity(int capasity) {
		if (capasity > elementData.length) {
			Object extenElementData[] = new Object[elementData.length * 2];
			for (int i = 0; i < size; i++) {
				extenElementData[i] = elementData[i];
			}
			elementData = extenElementData;
		}
	}

	private void fixUp(int k) {
		while (k > 0) {
			int p = (k - 1) / 2;
			if(!greatherThan(k, p)){
				break;
			}
			swap(k, p);
			k = p;
		}

	}

	private void swap(int k, int p) {
			Object arr[] = new Object[elementData.length];
			for (int i = 0; i < size; i++) {
				arr[i] = elementData[i];
			}

			arr[p] = elementData[k];
			arr[k] = elementData[p];

			elementData = arr;
	}
	private boolean greatherThan(int k, int p) {
		Comparable<Object> d = (Comparable)elementData[k];
		if (d.compareTo(elementData[p]) > 0) {
			return true;
		} else {
			return false;
		}
	}

}