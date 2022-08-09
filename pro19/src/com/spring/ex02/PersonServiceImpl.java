package com.spring.ex02;

public class PersonServiceImpl implements PersonService{
	private String name;
	private int age;
	public PersonServiceImpl(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public PersonServiceImpl(String name) {
		super();
		this.name = name;
	}
	@Override
	public void sayHello() {
		System.out.println("이름: "+name);
		System.out.println("나이: "+age+"살");
	}
	
	
}
