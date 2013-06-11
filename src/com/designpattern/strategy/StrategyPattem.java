package com.designpattern.strategy;

/*
 * 策略模式
 * 1.
 */
public class StrategyPattem
{
	public static void main(String[] args)
	{
		AddStrategy addStrategy = new AddStrategy();
		Enviroment enviroment = new Enviroment(addStrategy);
		System.out.println(enviroment.calculate(3, 4));
		
		SubtractStrategy subtractStrategy = new SubtractStrategy();
		enviroment.setStrategy(subtractStrategy);
		System.out.println(enviroment.calculate(3, 4));
		
		MultiplyStrategy multiplyStrategy = new MultiplyStrategy();
		enviroment.setStrategy(multiplyStrategy);
		System.out.println(enviroment.calculate(3, 4));
		
		DivideStrategy divideStrategy = new DivideStrategy();
		enviroment.setStrategy(divideStrategy);
		System.out.println(enviroment.calculate(3, 4));
	}
}
