package com.designpattern.strategypractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StrategyTest
{
	public static void main(String[] args)
	{
		List<Person> list = new ArrayList<Person>();
		
		Person p1 = new Person(1,"ki",20);
		Person p2 = new Person(2,"vi",30);
		Person p3 = new Person(5,"si",10);
		Person p4 = new Person(4,"bi",15);
		Person p5 = new Person(3,"di",25);
		Person p6 = new Person(2,"di",35);
		Person p7 = new Person(8,"xi",10);

		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(p5);
		list.add(p6);
		list.add(p7);
		
		SortByIdStrategy sortbyid = new SortByIdStrategy();
		Strategy sortbyage = new SortByAgeStrategy();
		Strategy sortbyname = new SortByNameStrategy();
		
		//按照id升序排列；
		Enviroment enviroment = new Enviroment(sortbyid);
		
		System.out.println("--------------------------------------------");
		System.out.println("Sorted by id:");
		enviroment.DESSortList(list);
		for(Iterator<Person> item = list.iterator();item.hasNext();)
		{
			Person p = (Person)item.next();
			System.out.println(p.toString());
		}
		
		System.out.println("--------------------------------------------");
		
		//按照id降序排列；
		enviroment.ASCSortList(list);
		for(Iterator<Person> item = list.iterator();item.hasNext();)
		{
			Person p = (Person)item.next();
			System.out.println(p.toString());
		}
		
		System.out.println("--------------------------------------------");
		System.out.println("Sorted by age");
		enviroment.setStrategy(sortbyage);
		enviroment.DESSortList(list);
		for(Iterator<Person> item = list.iterator();item.hasNext();)
		{
			Person p = (Person)item.next();
			System.out.println(p.toString());
		}
		
		System.out.println("--------------------------------------------");
		
		//按照id降序排列；
		enviroment.ASCSortList(list);
		for(Iterator<Person> item = list.iterator();item.hasNext();)
		{
			Person p = (Person)item.next();
			System.out.println(p.toString());
		}
		
		
		System.out.println("--------------------------------------------");
		System.out.println("Sorted by name:");
		enviroment.setStrategy(sortbyname);
		enviroment.DESSortList(list);
		for(Iterator<Person> item = list.iterator();item.hasNext();)
		{
			Person p = (Person)item.next();
			System.out.println(p.toString());
		}
		
		System.out.println("--------------------------------------------");
		
		//按照id降序排列；
		enviroment.ASCSortList(list);
		for(Iterator<Person> item = list.iterator();item.hasNext();)
		{
			Person p = (Person)item.next();
			System.out.println(p.toString());
		}
	}
}
