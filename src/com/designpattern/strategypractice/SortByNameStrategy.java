package com.designpattern.strategypractice;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortByNameStrategy implements Strategy {
    @Override
    public void DESSortList(List<Person> list) {

	Collections.sort(list, new NameDESComparator());
    }

    @Override
    public void ASCSortList(List<Person> list) {

	Collections.sort(list, new NameASCComparator());
    }
}

class NameDESComparator implements Comparator<Person> {
    public int compare(Person o1, Person o2) {

	if (o1.getName().equals(o2.getName()))
	    return o1.getId() - o2.getId();
	else
	    return o2.getName().compareTo(o1.getName());
    }
}

class NameASCComparator implements Comparator<Person> {
    public int compare(Person o1, Person o2) {

	if (o1.getName().equals(o2.getName()))
	    return o1.getId() - o2.getId();
	else
	    return o1.getName().compareTo(o2.getName());
    }
}