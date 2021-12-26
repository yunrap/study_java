package com.yunrap.chapter6;

import java.util.Date;

public class OverridingChild extends OverridingParent{
	public static void main(String[] args) {
		OverridingParent parent = new OverridingParent();
		OverridingChild child = new OverridingChild();
			
		System.out.println("Now date : " + parent.getDate());
		System.out.println("Now date : " + child.getDate());

	}
	
	public String getDate() {
		Date date = new Date();
		String[] items = date.toString().split(" ");
		
		System.out.println(items[2]);
		String str = items[2];
		return str;

	}
}

// 오버라이딩 : 자식클래스에 상속받은 자원을 재정의하는것이다   즉 부모의것을 덮어쓰는것이다.(주로수정해야할때 사용한다)
// 사용하는이유는 상속받은 메소드들중 수정해야할내용이 있을때 사용하는 기법이다. 
