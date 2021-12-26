package com.yunrap.chapter6;

public class HospitalExample {
	public static void main(String[] args) {
		PersonValue personVo = new PersonValue();
		DoctorValue doctorVo = new DoctorValue();
		
		System.out.println(personVo.getInfo());
		System.out.println(doctorVo.getInfo());

	}
}

//상속 기법을 사용할때의규칙
//자식 클래스는 단하나의 부모클래스로부터 상속받을 수 있다
//상속 받은 자식클래스는 다른 클래스의 부모클래스가 될수있다
