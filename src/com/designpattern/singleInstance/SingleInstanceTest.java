package com.designpattern.singleInstance;

public class SingleInstanceTest 
{
	public static void main(String[] args)
	{
		SingleInstance instance1 = SingleInstance.getInstance();
		SingleInstance instance2 = SingleInstance.getInstance();
		
		System.out.println(instance1 == instance2);
		
	}
}
