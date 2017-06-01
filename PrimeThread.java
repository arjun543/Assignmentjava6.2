package com;

public class PrimeThread extends Thread implements Runnable{
public int num;
public PrimeThread(int number)
{
	this.num=number;
}
	public void run()
	{ System.out.println("thread"+num);
		int i;
		for(i=2;i<num;i++)
		{
			if(num%i==0)
			{
				break;
			}
			
		}
		
		//System.out.println(count);
		if(i==num)
		{
			System.out.println(num+"is prime");
		}
		else
		{
			System.out.println(num+"is not  prime");
		}
	}
}
