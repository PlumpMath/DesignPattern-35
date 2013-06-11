package com.designpattern.singleInstance;

public class SingleInstance 
{
	private static SingleInstance singleinstance = new SingleInstance();
	
	private SingleInstance()
	{
		
	}
	
	/**
	 * 这里使用static修饰符的原因是�?�以直接被外部调用；
	 * 首先先判断�?�例是�?�存在，如果�?存在的�?就生�?一个
	 * 新的实例，�?�则就返回原先就有的实例；
	 * */
	public static SingleInstance getInstance()
	{
		if(null == singleinstance)
		{
			singleinstance = new SingleInstance();
		}
		
		return singleinstance;
	}
}
