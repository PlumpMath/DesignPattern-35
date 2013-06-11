package com.designpattern.strategypractice;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortByAgeStrategy implements Strategy {
    @Override
    public void DESSortList(List<Person> list) {

	Collections.sort(list, new AgeDESComparator());
    }

    @Override
    public void ASCSortList(List<Person> list) {

	Collections.sort(list, new AgeASCComparator());
    }
}

class AgeDESComparator implements Comparator<Person> {
    public int compare(Person o1, Person o2) {

	if (o1.getAge() == o2.getAge())
	    return o1.getId() - o2.getId();
	else
	    return o2.getAge() - o1.getAge();
    }
}

class AgeASCComparator implements Comparator<Person> {
    public int compare(Person o1, Person o2) {

	if (o1.getAge() == o2.getAge())
	    return o1.getId() - o2.getId();
	else
	    return o1.getAge() - o2.getAge();
    }
}