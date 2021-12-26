package com.yunrap.chapter5;

public class ConstructorExample {
	public ConstructorExample()
	{
		System.out.println("생성자는 클래스이름이랑 같게한다");
	}
	
	public ConstructorExample(String str)
	{
		System.out.println("두번째 생성자는 파라미터를더해주었다 " +str);
	}
}
