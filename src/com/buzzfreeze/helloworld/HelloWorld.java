package com.buzzfreeze.helloworld;

public class HelloWorld {
	public static void main(String [] args) {
		int i = 20;
		i++;
		i++;
		i++;
		i++;
		i++;
		System.out.println(i);
		i--;
		i--;
		i--;
		i--;
		i--;
		System.out.println(i);

		float p1 = 3.14f;
		float p2 = 3.12f;
		if((p1 == 3.14) && (p2 == 3.14)) {
			System.out.println("p1 == p2");			
		}
		
		char c1 = 'f';
		char c2 = 'f';
		if((c1 == 'f') || (c2 == 'f')) {
			System.out.println("ok");			
		}
		
	}
	
}
