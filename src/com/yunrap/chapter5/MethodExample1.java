package com.yunrap.chapter5;

public class MethodExample1 {

	public MethodExample1() {
		
		
	}
	
	
	public static void main(String[] args) {
		String firstName = "yunrap";
		String lastName = "yun";
		
		MethodExample1 example1 = new MethodExample1();
		String fullName = example1.merge(firstName, lastName);
		int numlength = example1.getLength(fullName);

		
		System.out.println(fullName);
		System.out.println(numlength);
	}
	
	public String merge(String str1, String str2) {
		
		String str = str1 + str2;
		return str;
		
	}

	public int getLength(String str) {
		int num = str.length();
		return num;
	}
	
}

//처음에 객체와 변수를헷갈려서 example1.메소드가아닌 변수에 fullName.getLength를 해주었었다.
// 객체와 변수는 의미상은같지만 엄연히다르다. 객체는메모리를 할당후에 사용할수있다. 