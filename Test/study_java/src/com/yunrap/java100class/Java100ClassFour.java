package study_java.src.com.yunrap.java100class;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import javax.xml.catalog.Catalog;


//### ch4 : 추상클래스 개념과 사용법
// 추상 클래스와 추상 메서드란 무엇인지 설명하고 관련된 예제 코드를 구현해보시오.
// 이 문제는 자바의 추상 클래스, 추상 메서드의 개념과 역할에 대해서 알고 있는지를 묻는 문제이다.

/*아래의 질문에 답해보시오? ---------------------------------------------------------
        1) 추상 클래스란 무엇인가?
        2) 추상 클래스와 일반 클래스의 차이점은 무엇인가?
        3) 추상 클래스는 객체 생성이 가능한가?
        4) 추상 클래스는 어떻게 사용하는가?
        5) 추상 클래스의 역할은 무엇이고 왜 필요한 것인가?
        6) 추상 클래스는 상속이 가능한가?
        7) 추상 클래스의 추상 메서드는 꼭 오버라이딩하여 사용해야만 하는가?
        8) 추상 메서드를 포함하고 있다면 추상 클래스여야 하는가?
        9) 추상 클래스를 만들려면 abstract를 꼭 써야 하는가?*/


/*public class Java100ClassFour {
    @DisplayName("추상클래스")
    @Test
    void abstractClass() {

        abstract class Animal {
            //구체적인 내용은 작성하지않고 공통적인 특징을 추상적으로 선언--> 리턴값 조차도 없이 메서드만 선언.
            abstract void cry();

            void eat() {
                System.out.println("먹다.");
            }
        }

        class Dog extends Animal {
            void cry() {
                System.out.println("멍멍~");
            }
        }
        abstract class Cat extends Animal {
            //void cry(){System.out.println("야옹야옹");}
        }

        class Animal2 {
            void fly() {
                System.out.println("날다");
            }
        }

        //[1]: 추상클래스는 구체적인 내용이 없기때문에 객체를 생성할 수 없다.
        //Animal dob = new Animal();        //err
        Animal2 dragonfly = new Animal2();
        dragonfly.fly();

        //[2] : 추상클래스의 사용은? --> 상속을 받아서 사용.
        //즉 추상클래스를 상속받은 자식 클래스에서 해당 메서드를 오버라이딩하여 재정의한후 사용한다.
        Dog dog = new Dog();
        dog.cry();  //멍멍

        //Cat cat = new Cat();
        //cat.cry();  //야옹야옹

        //[3]: Summary
        //추상(부모)클래스는 다른 클래스들의 공통적인 특징을 변수나 메서드로 정의만 해놓은 것을 말한다. --> 추상메서드
        //abstract를 앞에 붙이고 클래스안에 추상메서드를 포함하고있다는 것을 제외하면 일반클래스와 별반차이가없다.
        //Field, Constructor, Method(추상메서드말고 일반 메서드)도 포함할 수 있다.
        //메서드 선언만 있고 구체적인 내용은 없으므로 객체를 생성할 수 없다.
        //따라서 부모클래스로서의 역활은 하지만, 구체적인 사용은 상속받은 자식클래스에서 재정의(오버라이딩)하여 사용해야 한다. -->강제

        //왜쓰지?
        //우선 강제하기 위함이다.
        //부모(추상)클래스가 선언해놓은 메서드를 상속받은 자식 클래스들이 이름 그대로 재정의해서 구현하라고 강제하는 것이다
        //즉, 일반메서드로 구현하면 누군가는 해당 메서드를 구현안 할 수도있다.
        //무조건 상속받은 자식클래스입장에서는 추상 메서드를 재정의해서 구현하도록 강제하기 위함이다.

        //꼭 재정의(override)해야만 하는가?
        //일단 그렇다
        //자식 클래스는 일단은 무조건 부모(추상)클래스로부터 상속받은 추상 메서드는 오버라이딩 해서 재정의해야한다.
        //추상 메서드를 포함하고 있다면 곧 추상 클래스여야 한다.

        //만약 재정의하고싶지 않다면?
        //자식 클래스에서 상속받은 추상 메서드를 구현하지 않는다면 자식 클래스도 abstract를 붙여서 추상으로 만들어준다.
        //class 앞에다가 abstract를 붙인다

        //결론
        //부모클래스에서 구현하지않는이유는 해당 메서드의 구현이 상속받는 클래스에따라서 달라질수있기 때문에 선언만 해둔것이다.
        //분업화된 시스템에서 공통의 프로젝트를 진행할때 많이 사용되어지는 중요한 문법이다.

    }
}*/


//### ch4 : 인터페이스개념
// 자바의 인터페이스 문법을 예제 코드로 구현해보시오.
// 이 문제는 자바 문법중 인터페이스에 대한 개념과 어떻게 사용하는지에 대해서 아는지를 묻는 문제이다.
// 코드를 작성하기 전에 아래 4개의 관련 질문에 답해보시오
// [1] 인터페이스
// [2] 상속
// [3] 장점
// [4] 우선순위


    //[i]: 인터페이스란 무엇인가?
    //상호간 통신을 위해서는 규격이중요하다 --> 일본이 110v 가전제품을 한국으로 가지고와도 규격이 맞지 않으므로 사용할 수 없다.
    //즉 인터페이스는 하나의 표준화를 제공하는 것이라 할수있다.

    //추상클래스 vs 인터페이스?
    //추상클래스와 거의 비슷하다 --> 그러나 그 추상화정도가 더 좊다. --> 따라서 일반메서드 멤버필드(변수)를 가질수 없다.
    //이러한점들이 추상클래스와 인터페이스간 가장 큰 차이점중 하나이다. --

    //자바에서의 인터페이스 문법?
    //표준화 및 규격을 인터페이스로 제공.
    //따라서 어떤 클래스가 해당 인터페이스를 사용(상속)한다면 인터페이스에 선언되어져 있는 메서드를 구현해야한다.
    //인터페이스는 class키워드를 사용하지 않고 --> 별도의 interface 키워드를 사용한다
    //class --> extends     interface-->extends(x) , implements(o)
    //추상 클래스와 같이 메서드의 구체적인 내용은 기술되어져있지 않으므로 인터페이스를 상속받은 클래스에서 재정의(오버라이딩)하여 사용해야 한다.

    //상속 vs 구현
    //클래스와 인터페이스 이 둘의 가장 큰 차이점중 하나는 "상속"이다. --> a,b
    //자바에서 클래스는 "단일 상속"만 가능하지만, 인터페이스는 "다중 상속"이 가능하다.
    //그러나 인터페이스에서는 extends 표현을 쓰지않고 "구현"의 의미를 강조하는 implements 키워드를 사용하여 다중 상속을 구현한다.

    //[1] : 인터페이스
    //인터페이스는 interface키워드를 사용.

    //[2]: 상속
    //클래스는 "단일상속"만 가능, 인터페이스는 "다중상속"이 가능 --> 가장 큰 차이점.
    //class --> extends,    interface-->implements-->다중상속을 구현-->A,B-->콤마(,)로 분리
    //즉 이를 이용하면 여러개의 인터페이스로부터 메서드를 받아올 수 있게된다. --> 다중상속 구현

    //[3]: 장점
    //인터페이스를 이용하면 메서드의 추상적인 "선언"과 그 메서드들을 구체적인 "구현"부분을 분리시킬 수 있다. --> 매우큰 장점
    //하청을 주는 대기업(갑)은 하청업체(을)에 인터페이스만 제공 --> 각 하청업체(을)들이 이를 준수하여(=상속 받아) 개발
    //분업화된 시스템을 구축하여 "갑"과 "을"이 독립적으로 프로젝트 개발을 해나갈 수 있다. -->매우 큰 장점.

    //[4]: 우선순위(extends vs implements)
    //상속을 받는 extends키워드와 구현을 하는 implements 키워드가 동시에 쓰일때 --> extends키워드가 항상 먼저 쓰인다.
    //예시) class Student extends Person implementes A,B

/*class Person{
    //Field
    String name;
    int age;
    int weight;

    //Constructor
    Person(){}
    Person(String name, int age, int weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    //Method
    void wash() {System.out.println("씻다");}
    void study() {System.out.println("놀다");}
}

interface  Allowance {
    //Field
    //변수는 안되나 상수는 되므로 상수로 지정해주면 됨 --> public static final을 붙여주면됨
    //인터페이스내 모든 멤버 필드(변수)는 public static final 이여야한다. --> 생략이가능. -> 그냥 "타입상수면" 지정해서 쓰면됨
    public static final String aaa = "코리아";
    public static final int bbb = 100;
    //Abstract Method
    //인터페이스내 모든 메서드는 public abstract 이어야함 -->  생략이가능.
    public abstract void in(int price, String name);
    void out(int price, String name);
    //void wash() {System.out.println("씻다");} 선언된메소드만사용가능하므로 일반메소드는 x
}

interface Train {
    abstract  void train(int training_pay, String name);
}

class Students extends Person implements Allowance, Train{  //상속을 받으면 반드시 재정의
    //Contructor
    Students(){}
    Students(String name, int age, int weight){
        super(name, age, weight);
    }

    //Method
    @Override
    public void in(int price, String name) {
        System.out.printf("%s에게 %d원 용돈을 받았습니다.%n", name, price);
    }

    @Override
    public void out(int price, String name) {
        System.out.printf("%d원 금액을 지출했습니다. 지출용도 --> %s %n", price, name);
    }

    @Override
    public void train(int training_pay, String name) {
        System.out.printf("[%s --> %d원 입금완료]", name, training_pay);
    }

}

public class Java100ClassFour {
    public static void main(String[] args){
        // [1]: 객체생성
        Students s1 = new Students("홍길동", 20, 85);

        //[2]: 클래스와 인터페이스로부터 상속(Person)과 구현(Allowance, Train)을 한 메서드들 호출하기
        s1.wash();
        s1.study();
        s1.in(10000, "엄마");
        s1.out(40000, "편의점");
        s1.train(50000,"아빠");

        //[3]: 상수 필드 사용하기
        System.out.println(s1.aaa);    //코리아
        System.out.println(Allowance.aaa);
        System.out.println(Allowance.bbb);
    }
}*/

//Person클래스(부모)

//A 인터페이스(부모)
//B 인터페이스(부모)
//Student 클래스(자식)
//메인 클래스(메인 메서드가 포함)


//### ch4 : 다형성 개념
//다형성(polymorphism)에 대해서 개념 설명을 해보시오.
//이 문제는 자바의 다형성에 대한 개념을 알고 있고 그것을 쉽게 설명할 수 있는지를 묻는 문제이다.

//[1]: 다형성이란?
//다형성이란 다양한 형태 또는 특성
//자바와 같은 객체 지향 언어에서의 의미는 부모 클래스를 상속받은 자식클래스의 인스턴스가 부모의 객체로도 사용되고,
//뿐만아니라, 자식클래스의 객체로도 사용될 수 있는 다양한 상황을 의미한다.
//
//[2]: 예시
//부모클래스 People 이있고, 이를 상속받은 자식 클래스 yeji 있다고 가정하자.
//이때 "예지가 말을 하네" 사람들이 이렇게 말할 수 있다
//그런데 예지는 사람이기때문에 사람이 말을하네 라고 할수도있다.
//
//[3]: 결론
//정리하면, 하위클래스의 인스턴스(객체)는 보다 위인 상위클래스의 인스턴스(객체)로도 사용될 수 있다.
//그런데, 그 반대는 안된다.
//왜냐하면, "앵무새"는 분명 그 상위인 "새"라고 말할 수 있지만, 새는 종류가 많기때문에 모든 새가 앵무새는 아니기때문이다.
//따라서, 상위(부모)클래스의 인스턴스(객체)는 하위(자식) 클래스의 인스턴스(객체)로 사용될수없다.