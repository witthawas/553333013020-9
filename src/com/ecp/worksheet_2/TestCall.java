package com.ecp.worksheet_2;

import java.util.Arrays;


public class TestCall {

	public static void main(String[] args) {
		Car[] CarArrays = new Car[] {
				new Car("Mazda","Mazda2",480000),
				new Car("Toyota","Vios",540000)};
				Arrays.sort(CarArrays);
				System.out.println(Arrays.toString(CarArrays));

	}
}



