package com;

public class Threaddriver {

	public static void main(String args[]){
		PrimeThread pt =new PrimeThread(5);
		pt.start();
		PrimeThread pt1 =new PrimeThread(2);
		pt1.start();
	}
}
