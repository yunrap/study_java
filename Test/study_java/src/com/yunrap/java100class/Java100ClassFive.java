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
    }
}*/

// 컬렉션(Collection) 프레임워크란 무엇인지 개념을 설명해보시오.
// 이 문제는 자바의 컬렉션에 대한 이해와 개념에 대해서 설명할 수 있는지를 묻는 문제이다.

//[0] : 컬렉션 사전학습
// 처음 자바 책 사서 컬렉션 파트 훑어 봤을 꽤 어렵네... 라고 느꼈다면? -->  선수학습이 안되어서 그렇다.
// 선수학습 --> OOP, 추상클래스, 상속, 인터페이스, 제네릭

//다시복습하기











