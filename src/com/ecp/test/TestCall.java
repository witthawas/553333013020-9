package com.ecp.test;

import java.util.Arrays;

public class TestCall {
	public static void main(String[] args) {
		BackHam Back = new BackHam();
		System.out.println("name : "+Back.getName());
		System.out.println("position : "+Back.getPosition());
		System.out.println("friend : "+Arrays.toString(Back.getFriend()));
		Back= new BackHam(1);
	}


}
