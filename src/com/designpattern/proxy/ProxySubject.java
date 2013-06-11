package com.designpattern.proxy;

public class ProxySubject implements Subject  {
    
    private RealSubject realSubject = new RealSubject();
    
    @Override
    public void dosomething(){
	
	preproxy();
	realSubject.dosomething();
	afterproxy();
	
    }
    
    public void preproxy(){
	
	System.out.println("i will do something before proxy!");
    }
    
    public void afterproxy(){
	
	System.out.println("i can do the clean work!");
    }
}
