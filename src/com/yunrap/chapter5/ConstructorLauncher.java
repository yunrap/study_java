package com.yunrap.chapter5;

public class ConstructorLauncher {
	public static void main(String[] args) {
		ConstructorExample example1 = new ConstructorExample();
		ConstructorExample example2 = new ConstructorExample("니하");
		
		System.out.println(System.identityHashCode(example1));
		System.out.println(System.identityHashCode(example2));
		
	}
}

//JVM 이 new키워드를 사용해서객체를 만들때마다 개별적으로 힙영영에 자리를 만들어놓는다. 즉 서로다른객체이다 
//즉생성자는 new 키워드를사용하여 하나의 클래스에 여러개의 객체를 만들수있다. 
