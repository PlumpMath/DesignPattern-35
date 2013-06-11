package com.designpattern.strategy;

public class Enviroment
{
	private Strategy strategy;
	
	public Enviroment(Strategy strategy)
	{
		this.strategy = strategy;
	}
	
	public void setStrategy(Strategy strategy)
	{
		this.strategy = strategy;
	}
	
	public Strategy getStrategy()
	{
		return this.strategy;
	}
	
	public int calculate(int a,int b)
	{
		return this.strategy.calculate(a, b);
	}
}
