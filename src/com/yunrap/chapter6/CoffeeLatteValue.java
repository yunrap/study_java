package com.yunrap.chapter6;

public class CoffeeLatteValue extends CoffeValue{

	protected int capacityMilk;
	
	public CoffeeLatteValue(String coffeeName, int capacity, int capacityMilk) {
		super(coffeeName, capacity);
		this.capacityMilk = capacityMilk;
	}
	
	public String getInfo() {
		return "milk capacity" + this.capacity;
	}
	
	public String getDescription() {
		String rt = super.getInfo();
		rt += this.getInfo();
		return rt;
	}
	
	public static void main(String[] args) {
		CoffeeLatteValue order1 = new CoffeeLatteValue("caffe late", 500, 100);
		System.out.println(order1.getDescription());
	}
}

//super 키워드와 this키워드를 적절히사용하여 자식클래스에서 메소드를 추가적으로 넣어줄수있고, 부모클래스에서 가져와 사용할수도있다  