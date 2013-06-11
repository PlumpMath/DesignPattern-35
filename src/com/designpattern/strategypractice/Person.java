package com.designpattern.strategypractice;

/**
 * 要求：假如有若干个类 Person 对象存在一个 List 当中， 对他们进行排序，分别按照名字、年龄、id 进行排序（要有正序与倒序两种排序方式） 。
 * 假如年龄或者姓名重复，按照 id的正序进行排序。要求使用策略模式进行。
 * 
 * @author Kivision
 * 
 */

public class Person {
    private int id;
    private String name;
    private int age;

    public int getId() {

	return id;
    }

    public void setId(int id) {

	this.id = id;
    }

    public String getName() {

	return name;
    }

    public void setName(String name) {

	this.name = name;
    }

    public int getAge() {

	return age;
    }

    public void setAge(int age) {

	this.age = age;
    }

    public Person() {}

    public Person(int id, String name, int age) {

	this.id = id;
	this.name = name;
	this.age = age;
    }

    public String toString() {

	return (this.name + "     " + this.age + "     " + this.id);
    }
}
