package com.yunrap.chapter6;

public class CoffeValue {
	protected int capacity;
	protected String coffeeName;
	
	
	public CoffeValue(String coffeeName, int capacity) {
		this.capacity = capacity;
		this.coffeeName = coffeeName;
	}
	
	public String getInfo() {
		return "capacity: " + capacity + ", coffeeName: " +coffeeName;
	}
	
	public static void main(String[] args) {
		CoffeValue order1 = new CoffeValue("Americano", 360);
		CoffeValue order2 = new CoffeValue("cafe latte", 700);
		CoffeValue order3 = new CoffeValue("cafe moca", 300);
		
		System.out.println(System.identityHashCode(order1) + "  " + order1.getInfo());
		System.out.println(System.identityHashCode(order2) + "  " + order2.getInfo());
		System.out.println(System.identityHashCode(order3) + "  " + order3.getInfo());

	}
}

//this 키워드는 인스턴스화된 자기자신의 객체를지칭한다 
// jvm에 메모리된 생성자 3개들의 같은 객체의이름을구별해줄수있는것이 this키워드라고 보면된다.
