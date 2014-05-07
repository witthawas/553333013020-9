package com.ecp.worksheet_1;

public class TestCall {

	public static void main(String[] args) {
		ArrayList lst = new ArrayList();
		lst.add("test1");
		lst.add("test2");
		lst.add("test3");
		lst.add("test4");
		lst.add("test5");
		System.out.println(lst);
		System.out.println("\n");

		ArrayListStack stk = new ArrayListStack();
		stk.push("test1");
		stk.push("test2");
		stk.push("test3");
		stk.push("test4");
		stk.push("test5");
		stk.Show_Stack();
		System.out.println("pop = " + stk.pop());
		stk.Show_Stack();
        System.out.println("");
        
		ArrayListQueue q = new ArrayListQueue();
		q.enQueue("test1");
		q.enQueue("test2");
		q.enQueue("test3");
		q.enQueue("test4");
		q.enQueue("test5");
		q.enQueue("test6");
		q.Show_Queue();
		System.out.println("De Queue = " + q.deQueue());
		q.Show_Queue();
		System.out.println("De Queue = " + q.deQueue());
		q.Show_Queue();
		System.out.println("De Queue = " + q.deQueue());
		q.Show_Queue();
		System.out.println("First Data = " + q.peek());
		System.out.println("Data in Queue = " + q.getSize());
	}
}