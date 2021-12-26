package com.yunrap.chapter6;

public class DoctorValue extends PersonValue {
	public DoctorValue() {
		age = 30;
		name = "yunrap doctor";
	}
	{
		age = 40;
		name = "gitrap doctor";
	}
}

//PersonValue 를 상속받고있어서 getInfo 메소드와 변수를선언없이 사용이 가능하다 