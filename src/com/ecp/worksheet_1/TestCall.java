package com.ecp.worksheet_1;

public class TestCall {
	public static void main(String[] args) {
		ArrayListQueue aq = new ArrayListQueue();
		aq.enQueue("test1");
		aq.enQueue("test2");
		aq.enQueue("test3");
		aq.enQueue("test4");
		aq.enQueue("test5");

		System.out.println(aq);
		aq.deQueue();
		System.out.println(aq);
		System.out.println(aq.peek());
		System.out.println("***************************************");
		
		ArrayList arr = new ArrayList();
		arr.add("1");
		System.out.println(arr);
		arr.add("2");
		System.out.println(arr);
		arr.add("3");
		System.out.println(arr);
		arr.add("4");
		System.out.println(arr);
	}

}



