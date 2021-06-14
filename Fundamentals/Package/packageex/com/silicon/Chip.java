package com.silicon;
import com.software.Soft;
class Chip extends Soft
{
	int k = 44;
	void m2()
	{
		System.out.println("Silicon package");
	}
	public static void main(String [] args)
	{
		Chip c = new Chip();
		System.out.println(c.k);
		c.m2();
		//Soft s = new Soft();
		System.out.println(c.a);
		c.m1();
	}
}