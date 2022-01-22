package study_java.src.com.yunrap.Java100Class;

// 문제 30

// 클래스 상속에서 메서드 오버라이딩에 대해서 설명하고 구현해보시오.
// 이 문제는 상속에서 부모 클래스의 메서드를 자식이 오버라이딩해서 구현할 수 있는지를 묻는 문제이다.

/*[ 결과 출력 ] ------------------------------------------------------------------------------------------------------------------------------------------- 부모 클래스→걸어가고 있어요~
        이름 : 슈퍼맨, 나이 : 20, 성별 : 1, 파워 : 100
        이름 : 원더우먼, 나이 : 30, 성별 : 1, 파워 : 100
        이름 : 원더우먼, 나이 : 30, 성별 : 2, 파워 : 300
        자식 클래스→2배로 빨리 걸어가고 있어요~*/

/*class Person{
    //Field
    int gender;
    int power;

    //constuctor
    Person(){
        this.gender = 1;
        this.power = 100;
    }

    //Method
    void walk() {
        System.out.println("걸어가고 있어요");
    }
}

class Hero extends Person{
    String name;
    int age;

    //constructor
    Hero(){}
    Hero(String name, int age)
    {
        super();
        this.name = name;
        this.age = age;
    }

    //method 오버라이딩
    void walk(){
        System.out.println("2배로 빨리 걸어가고있어요");
    }

    void eat(){
        System.out.println("밥먹고 있어요");
    }

    void displayPerson(){
        System.out.println("이름 :" +name+ ",나이" +age+ ",성멸:" +gender+ ",파워" +power);
    }
}

public class Java100ClassThree {
    public static void main(String[] args) {
        Person p1= new Person();
        p1.walk();
        //p1.eat(); //err

        //[2] 상속을 통한 슈퍼맨 객체생성
        Hero h1 = new Hero("슈퍼맨", 20);  //먼저 부모 필드부분이 초기화가되고 -> 자식에서 초기화된다.
        System.out.println(h1.name);
        System.out.println(h1.age);
        System.out.println(h1.gender);  //부모클래스 필드(변수)
        System.out.println(h1.power); // 부모클래스 필드(변수)
        h1.walk();
        h1.displayPerson();

        //[2] 원더우먼 객체 생성
        Hero h2 = new Hero("원더우먼", 30);
        h2.displayPerson();
        h2.gender = 2;
        h2.power = 300;
        h2.displayPerson();
        h2.walk();
    }
}*/


//문제 31

// getter, setter가 포함된 클래스의 상속을 코드로 구현해보시오.
// 이 문제는 클래스의 상속을 구현시 getter, setter의 개념과 용도를 알고 있는지를 묻는 문제이다.
// 부모 클래스 --> Person, 자식 클래스 --> Villain, Hero

/*
class Person{
    //Field
    int gender;
    private String name;
    private int age;
    private int height;
    private int weight;

    //Constructor
    Person(){}
    Person(String name, int age, int height, int weight){
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }


    //Method
    public String getName()
    {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getAge(){return age;}
    public void setAge(int age){this.age = age;}

    public void setHeight(int height){this.height = height;}
    public int getHeight(){return height;}

    public void setWeight(int weight){this.weight = weight;}
    public int getWeight(){return weight;}

    public void move(){
        System.out.println("이동중...");
    }
}

class Villain extends Person{
    //Field
    private String unique_key;
    private int weapon; //1~9 숫자로 무기 분류 -> 1.창 2.방패 3.총
    private double power;

    //Constructor
    Villain(){}
    Villain(String name, int age, int height, int weight, String unique_key, int weapon, double power){
        super(name, age, height, weight);
        this.unique_key = unique_key;
        this.weapon = weapon;
        this.power = power;
    }

    //Method
    public void setUnique_key(String unique_key) {this.unique_key = unique_key;}
    public String getUnique_key(){return unique_key;}

    public void setWeapon(int weapon){this.weapon = weapon;}
    public int getWeapon(){return weapon;}

    public  void setPower(double power){this.power = power;}
    public double getPower(){return power;}

    //pringPerson()
    public void printPerson(){
        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
        System.out.println("악당 이름: " + getName());
        System.out.println("악당 나이: " + getAge());
        System.out.println("악당 키: " + getHeight());
        System.out.println("악당 체중: " + getWeight());
        System.out.println("악당 넘버: " + getUnique_key());
        System.out.println("악당 무기: " + getWeaponName(getWeapon()));    //숫자(1~9) --->1:창 2:방패 3:총
        System.out.println("악당 파워: " + getPower());
    }

    //getWeaponName()
    public String getWeaponName(int a){
        String weapon;
        switch (a){
            case 1:
                weapon = "창";
                break;
            case 2:
                weapon = "방패";
                break;
            case 3:
                weapon = "총";
                break;
            default:
                weapon = "----";
                break;
        }
        return weapon;
    }
}

class Hero extends Person{}

public class Java100ClassThree {
    public static void main(String[] args) {

        //[1] 객체생성
        Villain v1 = new Villain("좀비", 20, 180, 60, "15001231", 2, 99.5);
        v1.printPerson();
        System.out.print(v1.getName() + "");
        v1.move();

        //[2] 객체생성
        Villain v2 = new Villain("도깨1ㅣ", 30, 175, 70, "11001121", 1, 77.5);
        v2.printPerson();
        System.out.print(v2.getName() + "");
        v2.move();

        //[2] 객체생성
        Villain v3 = new Villain("몽달귀신", 40, 150, 40, "10001010", 3, 27.5);
        v3.printPerson();
        System.out.print(v3.getName() + "");
        v3.move();
    }
}*/

//### 문제 32
// 객체에 대한 참조값을 요소로 가지는 객체 배열을 생성하는 코드를 구현하시오.
// 이 문제는 기본형 타입이 아닌 참조형 타입의 객체가 원소인 객체 배열을 구현할 수 있는지를 묻는 문제이다.
// 아래와 같이 출력하는데 다양한 방식으로 출력해보시오. → 3가지 정도로..
// 반복문을 사용해서 객체를 생성해보시오.

/*[ 결과 출력 ] -------------------------------------------------------------------------------------------------------------------------------------------
        0번 후보자 --> 나이 : 20
        1번 후보자 --> 나이 : 21
        2번 후보자 --> 나이 : 22
        3번 후보자 --> 나이 : 23
        4번 후보자 --> 나이 : 24
        5번 후보자 --> 나이 : 25
        6번 후보자 --> 나이 : 26
        7번 후보자 --> 나이 : 27
        8번 후보자 --> 나이 : 28
        9번 후보자 --> 나이 : 29
 */

/*
class Person{
    //Field
    private String name;
    private int age;

    //Constructor
    Person(){}
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    //Method
    public void setName(String name){this.name = name;}
    public String getName(){return name;}

    public void setAge(int age){this.age = age;}
    public int getAge(){return age;}
}

public class Java100ClassThree {
    public static void main(String[] args) {
        //[1]:객체 생성
        int[] ar1 = {1,2,3,4,5};
        char[] ar2 = {'A','B','C','D','E'};
        Person[] pa = new Person[5];
        pa[0] = new Person("홍길동", 20);
        pa[1] = new Person("장길동", 21);
        pa[2] = new Person("김길동", 22);
        pa[3] = new Person("영길동", 23);
        pa[4] = new Person("오길동", 24);

        //[2]:출력
        for(int i=0; i<pa.length; i++){
            System.out.println(pa[i].getName()+ "\t\t" +"나이 : "+ pa[i].getAge() + "\t\t");
        }
        System.out.println();
    }
}*/

//### 문제 33

// 반복문(for)을 사용하여 객체 배열을 생성하고 출력해보시오.
// 이 문제는 객체의 주소를 저장하고 있는 객체 배열을 반복문을 사용하여 만들 수 있는지를 묻는 문제이다.

class Person{
    //Field
    private String name;
    private int age;

    //Constructor
    Person(){}
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    //Method
    public void setName(String name){this.name = name;}
    public String getName(){return name;}

    public void setAge(int age){this.age = age;}
    public int getAge(){return age;}
}

public class Java100ClassThree {
    public static void main(String[] args) {

        //[1]:객체생성
        Person[] pa;    //Person타입의 객체 배열 변수 pa 선언
        pa = new Person[] {
                new Person("yeji", 28),
                new Person("hello", 54),
                new Person("jiyong", 20),
                new Person("tamie", 30),
                new Person("leooo", 40),
        };

        //[2]:반복문(foreach)돌면서 Person()객체 생성
        for(Person temp:pa)
        {
            System.out.println(temp.getAge() +"살\t"+ temp.getName());
        }
    }
}