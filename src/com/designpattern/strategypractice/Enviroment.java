package com.designpattern.strategypractice;

import java.util.List;

public class Enviroment
{
	private Strategy strategy;
	
	public Enviroment() {}
	
	public Enviroment(Strategy strategy){
	    
		this.strategy = strategy;
	}

	public void setStrategy(Strategy strategy){
	    
		this.strategy = strategy;
	}
	
	public void DESSortList(List<Person> list){
	    
		this.strategy.DESSortList(list);
	}
	
	public void ASCSortList(List<Person> list){
	    
	    this.strategy.ASCSortList(list);
	}
}
