package com.java8features;

import java.util.function.Predicate;

public class TestA {
	
	public static void main(String[] args) {
		
		Predicate<Integer> p = i -> {
			if(i%2 == 0) {
				return true;
			}else {
				return false;
			}
			
		};
		
		boolean b = p.test(15);
		System.out.println(b);
	}

}
