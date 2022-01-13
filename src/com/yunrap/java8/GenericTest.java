package com.yunrap.java8;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import java.util.*;
import org.junit.jupiter.api.Test;

class GenericTest<T> {


	static class Hello<T> {	//T -> type parameter
		
	}
	
	void print(T t) {
		System.out.println(t.toString());
	}
	
	static <T> void print2(T t) {
		System.out.println(t.toString());
	}
	
	@DisplayName("제네릭을 쓰는이유, 컴파일 시점에서 타입체크를 할수있다")
	@Test
	void generic_Test_1() {
		//new Hello<String>();	//type argument
		
		List list = new ArrayList();
		list.add("str"); //만일 이 list에 Integer만 넣으려고 만든 list라도 컴파일러는 알수없다. 
	}
	
	@DisplayName("비제네릭 코드는 불필효한 타입변환, 성능악영향 ")
	@Test
	void generic_test2() {
		List list = new ArrayList();
		list.add("hello");
		String str = (String)list.get(0);
	}
	
	@DisplayName("제네릭변환시 String타입으로 국한, 타입변활할필요 없어진다. ")
	@Test
	void generic_test3() {
		List<String> list = new ArrayList<String>();
		list.add("hello");
		String str = list.get(0);
	}
	
	@DisplayName("제네릭, 로 타입 문제 ")
	@Test
	void generic_rowType() {
		List<Integer> ints = Arrays.asList(1,2,3);
		List rawInts = ints; //일반 제네릭을 로타입에 대입
		List<Integer> ints2 = rawInts;	//로타입을 일반 제네릭에 대입 
		List<String> strs = rawInts;
		String str = strs.get(0);	//Integer 컬랙션을 String 컬렉션에 초기화하는데 빨간줄이 생기지않는다.
	}
	
	/*
	static 에서도 쓸수있으나 static 메서드의경우 클래스에 적은 제네릭타입이 적용되지않음
	(static 메서드란게 오브젝트를 인스턴스화 시킨후 사용하는게 아니니)
	
	따라서 static 메서드의 경우 메서드에 <T> 명시를 해줘야한다.
	또한 생성자에도 쓸 수 있다.
	*/
	
	@DisplayName("제네릭 메서드 ")
	@Test
	void generic_method_1() {
		new GenericTest().print("hello");
		new GenericTest().print(1);
		print2(2);
	}

}
