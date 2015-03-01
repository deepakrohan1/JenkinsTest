package org.test.com;

public class Calcu {
	
	public int add (int a, int b){
		return a+b;
	}
	
	public static void main(String[] args) {
		Calcu add = new Calcu();
		add.add(1, 2);
	}

}
