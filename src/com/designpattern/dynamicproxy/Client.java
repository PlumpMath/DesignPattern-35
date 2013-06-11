package com.designpattern.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import com.designpattern.proxy.RealSubject2;
import com.designpattern.proxy.Subject2;

public class Client {

    public static void main(String[] args) {
	
	RealSubject realSubject = new RealSubject();
	
	InvocationHandler handler = new DynamicSubject(realSubject);
	
	Class<?> classType = handler.getClass();
	
	Subject subject = (Subject) Proxy.newProxyInstance(classType
		.getClassLoader(), realSubject.getClass().getInterfaces(),
		handler);
	
	subject.request();
	
	System.out.println("----------------------------------------------------");
	
	Subject2 realSubject2 = new RealSubject2();
	
	InvocationHandler handler2 = new DynamicSubject(realSubject2);
	
	Class<?> classType2 = handler2.getClass();
	
	Subject2 subject2 = (Subject2) Proxy.newProxyInstance(classType2
		.getClassLoader(), realSubject2.getClass().getInterfaces(),
		handler2);
	subject2.dosomthing();
	subject2.dosomething2();
    }
}
