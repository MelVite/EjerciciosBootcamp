package com.ejercicios2;

public class numeros {
	
	public void printNum() {
	
		for (int i = 0 ; i <= 100; i++) {
			if (i % 3 == 0) {
				System.out.println("Fizz");
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
			} else if ((i % 3 == 0) && (i % 5 == 0)) {
				System.out.println("FizzBuzz");
			} else {
				System.out.println(i);
			}
		}
	}
}
