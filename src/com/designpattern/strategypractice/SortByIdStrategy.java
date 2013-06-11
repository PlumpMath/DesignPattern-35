package com.designpattern.strategypractice;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortByIdStrategy implements Strategy {

    @Override
    public void DESSortList(List<Person> list) {

	Collections.sort(list, new IdDESComparator());
    }

    @Override
    public void ASCSortList(List<Person> list) {

	Collections.sort(list, new IdASCComparator());
    }
}

class IdDESComparator implements Comparator<Person> {
    public int compare(Person o1, Person o2) {

	return o2.getId() - o1.getId();
    }

}

class IdASCComparator implements Comparator<Person> {
    public int compare(Person o1, Person o2) {
	
	return o1.getId() - o2.getId();
    }
}
