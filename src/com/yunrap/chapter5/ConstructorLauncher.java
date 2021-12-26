package com.yunrap.chapter5;

public class ConstructorLauncher {
	public static void main(String[] args) {
		
		ConstructorExample example1 = new ConstructorExample();
		ConstructorExample example2 = new ConstructorExample("++ 두번째 생성자에 텍스트추가 ");
		
		System.out.println(System.identityHashCode(example1));
		System.out.println(System.identityHashCode(example2));

	}
	
}

//new 키워드를 사용해서 객체를 생성시 JVM은 그때마다 힙영역에 객체를 위한 자리를 할당 
//생성자는 메소드의 한 종류이지만 객체를 생성하는데 사용된다  
