package study_java.src.com.yunrap.java100class;


//문제 : 제네릭의 필요성
// 제네릭(Generic)의 개념과 필요성에 대해서 예제 코드로 설명해보시오.
// 이 문제는 자바 문법중 제네릭에 대한 개념과 필요성에 대해서 알고 있는지를 묻는 문제이다.
// 모든 타입을 다 받는 클래스를 만들어보시오.


//해설

/*
import java.sql.SQLOutput;

class Sample{
    //Field
    private Object obj;

    //Constructor
    Sample(Object x) {
        this.obj = x;
    }

    //Method
    public Object getObj(){
        return obj;
    }

    void printInfo(){
        System.out.println(obj.getClass().getName());   //객체가 속하는 클래스의 정보를 출력하는 메서드
    }

}

public class Java100ClassFive {

    public static void main(String[] args){

        // [1] : 객체생성 --> 문자열
        Sample s1 = new Sample("안녕하세요~");
        System.out.println(s1.getObj());
        s1.printInfo();
        System.out.println("-------------------------------");

        //[2]: 객체생성 --> 숫자
        Sample s2 = new Sample(100);    //Err (Sample클래스가 받는 생성자가 String이므로 정수를 받을수없다.)
        System.out.println(s2.getObj());    //100
        s2.printInfo();
        System.out.println("-------------------------------");

        //[3]: 객체생성 --> Object
        Sample s3 = new Sample(new Object());
        System.out.println(s3.getObj());    //100
        s3.printInfo();
        System.out.println("-------------------------------");

        //[4]: 위와같이 사용시 --> 단점
        //s1 -->  문자열
        //String str = (String)s1.getObj();     //리턴시 반환타입이 Object 이다., 직접 형변환을해줘야함
        //int num = (int)s2.getObj();           //동일하게안됨.

        //Object stre = s1.getObj();
        //System.out.println(stre.length());    //Err length는 string에서사용
        String stre = (String)s1.getObj();
        System.out.println(stre.length());      //6

        //s2 --> 숫자
        Object num = s2.getObj();
        System.out.println((int)num + 100);

    }

}
*/

//문제 : 제네릭의 필요성 2
// 컴파일 단계에서는 에러가 안나고, 실행 단계에서 ClassCast 오류가 발생하는 상황을 만들어보시오.
// 이 문제는 제네릭의 필요성을 보여주는 예를 코드로 설명할 수 있는지를 묻는 문제이다.


//해설

/*
class Person{
    //Field
    public Object obj;

    //Constructor
    Person(Object obj){ this.obj = obj; }
}

class Student{
    //Field
    public int grade;

    //Constructor
    Student(int grade){ this.grade = grade; }
}

class Teacher{ }


public class Java100ClassFive {
    public static void main(String[] args) {
        //[1]: 객체 생성
        Person p1 = new Person(new Student(3));
        //System.out.println(p1.obj);

        //[2]: 형변환 --> Cast
        Student str = (Student)p1.obj;      //그전에 넣어준 형에맞는 타입으로 형변환해줘야한다.
        System.out.println(str);   //6
    }
}*/


//문제 : 제네릭 구현방법
// 제네릭(Generic) 개념과 사용법을 예제 코드로 구현해보시오.
// 이 문제는 자바 문법중 제네릭에 대한 개념과 사용법에 대해서 알고 있는지를 묻는 문제이다.

/*class Sample<T>{
    private T obj;
    Sample(T x){ this.obj = x; }
    T getObj(){ return obj; }
    void printInfo(){ System.out.println(obj.getClass().getName()); }
}

public class Java100ClassFive {
    public static void main(String[] args) {
        //[1]: 객체생성 --> String
        Sample<String> s1 = new Sample<String>("안녕하세요!");
        System.out.println(s1.getObj());
        s1.printInfo();
        System.out.println("---------------------------------");

        //[2]: 객체생성 --> Integer
        Sample<Integer> s2 = new Sample<Integer>(2);
        System.out.println(s2.getObj());
        s2.printInfo();

        //[3]: 형변환 없이 사용하기
        String str = s1.getObj();
        System.out.println(str.length());   //6
    }*/

// 컬렉션(Collection) 프레임워크란 무엇인지 개념을 설명해보시오.
// 이 문제는 자바의 컬렉션에 대한 이해와 개념에 대해서 설명할 수 있는지를 묻는 문제이다.

//[0] : 컬렉션 사전학습
// 처음 자바 책 사서 컬렉션 파트 훑어 봤을 꽤 어렵네... 라고 느꼈다면? -->  선수학습이 안되어서 그렇다.
// 선수학습 --> OOP, 추상클래스, 상속, 인터페이스, 제네릭
// 공부할 양이 제법 많다. 그래서 어지간한 기본서에서는 아예 컬렉션 파트를 다루지 않고, 두꺼운 기본서 정도 되어야 개념과 여러 클래스를 다룬다.
// 본과정에서도 컬렉션에 대한 개념과 ArrayList 클래스 위주로 진행.
//
//[1] : Collection Framework 란?
//수집품이라는 사전적의미에서 유추할 수 있듯이 "데이터 값들을 담는 여러 그릇"정도로 이해하면 된다.
//집 부엌 천장을 열어보면 종류별로 용도별로 많이 있듯이 어떤 자료구조 데이터를 저장하고 관리할 것인지에 따라서 맞는 그릇을 써야한다.
//내가 만들 프로그램의 데이터 처리를 어떻게 할지 그 특징을 잘 파악하여 컬렉션내 맞는 그릇(클래스)를 잘 골라써야한다.
//컬렉션 프레임워크는 크게 봤을 때 --> Collection과 Map으로 나뉘고 --> 이 둘은 모두 인터페이스(Interface)로 되어있다.
//Collection은 또 List와 Set으로 나뉘고 --> 이들도 인터페이스 --> 이들을 상속받아 다양한 형태의 배열(그릇, 클래스)로 사용된다.
//
//
//[2]: Collection
//Collection(인터페이스) --> 상속 --> List와 Set으로 구분(인터페이스) --> 상속 --> List계열 구현클래스 vs Set계열 구현클래스
//List 계열 구현 클래스 --> ArrayList , LinkecList, Vector, Stack
//Set 계열 구현 클래스 --> HashSet, SortedSet, TreeSet
//
//[3] List vs Set
//컬렉션 프레임워크의 핵심 인터페이스들.
//List 인터페이스를 상속하는 클래스들 특징 --> (1)인덱스가 있고, (2)그래스 저장 순서가 유지되고, (3) 데이터 중복이 허용.
//Set 인터페이스를 상속하는 클래스들 특징 --> (1)데이터 중복이 허용 안됨.








