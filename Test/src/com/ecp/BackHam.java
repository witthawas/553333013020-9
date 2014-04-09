package com.ecp;

public class BackHam {
	private String name;
	private String position;
	private String friend[];
	public BackHam() {
		name = "Back";
		position = "ENG";
		friend = new String[]{"Lunee","Lampat","Oven"};
	}
	public BackHam(int a) {
		System.out.println("overloading 1");
	}
	public String getName(){			
		return name;		
	}
	public String getPosition(){			
		return position;		
	}
	public String[] getFriend(){			
		return friend;		
	}

}
