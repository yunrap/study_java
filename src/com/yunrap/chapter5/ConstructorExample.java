package com.yunrap.chapter5;

public class ConstructorExample {
	public ConstructorExample()
	{
		System.out.println("첫번째 생성자의호출 ");
	}
	
	public ConstructorExample(String str)
	{
		System.out.println("str이 추가된 매개변수있는 생성자 " + str);
	}
}
