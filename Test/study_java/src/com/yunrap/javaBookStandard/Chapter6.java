package study_java.src.com.yunrap.javaBookStandard;

/*
* 클래스 변수 : 클래스가 메모리에 올라갈때 생성된다.
* 인스턴스 변수 : 클래스의 인스턴스를 생성할때 만들어진다
* 지역 변수 : 메서드내에서만 사용가능하다, 매서드가 종료되면 사용할수없게된다.
*
* 인스턴스변수는 인스턴스가 생성될때마다 각기다른값을 유지한다.
* 클래스변수는 모든인스턴스가 하나의 저장공간을 공유한다. (힝상공통된값을 유지한다.)
* */


public class Chapter6 {
    public static void main(String args[]){

        System.out.println(Card.width);
        System.out.println(Card.height);

        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 3;

        Card c2 = new Card();
        c2.kind = "diamond";
        c2.number = 7;


        Card.width =30;
        Card.height =20;

        System.out.println(c1.kind + c1.number);
        System.out.println(c2.kind + c2.number);

        System.out.println(Card.width);
        System.out.println(Card.height);
    }
}

class Yeji{
    public static void main(String[] args){
        System.out.println("yeji 클래스 "+Card.width);
        System.out.println("yeji 클래스 "+Card.height);
    }
}

class Card{
    String kind;                //카드의 무늬 - 인스턴스변수
    int number;                 //카드의 숫자 - 인스턴스변수
    static int width = 100;     //카드의 폭 - 클래스변수
    static int height = 250;    //카드의 높이 - 클래스변수
}






