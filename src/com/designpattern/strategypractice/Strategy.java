package com.designpattern.strategypractice;

import java.util.List;

public interface Strategy
{
	public void DESSortList(List<Person> list);
	
	public void ASCSortList(List<Person> list);
}
