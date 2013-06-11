package com.designpattern.proxy;

public class RealSubject implements Subject {
    
    @Override
    public void dosomething(){
	
	System.out.println("Hello i am real Subject!");
    }
}
