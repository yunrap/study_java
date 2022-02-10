package study_java.src.com.yunrap.java8andetc;


//정통적인 스레드생성과 람다표현식의 스레드생성의 차이첨을 말하시오


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.function.Function;


public class LamdaExpression {


    @DisplayName("일반적인 인터페이스")
    @Test
    void generalTest(){

        interface  Calculator{
            int sum(int a, int b);
        }
        

        class MyCalculator implements Calculator{
            public int sum(int a, int b){
                return a+b;
            }

        }

        MyCalculator mc = new MyCalculator();
        int result = mc.sum(3,4);
        System.out.println(result);
    }

    //------------------------------------------------------
    //람다는 익명함수라고한다.
    //람다의 기본 표현식
    //(int a, int b) -> sum 함수의 : 입력항목
    // -> a+b : 리턴값을 표현

    @DisplayName("람다를 적용한 코드")
    @Test
    void lamdaTest(){

        @FunctionalInterface    //단,람다에서는 한개의 메소드만 적용할수있다 (구별어노테이션)
        interface  Calculator{
            int sum(int a, int b);
            //int minus(int b, int c);
        }

        Calculator mc = (int a, int b) -> {return a+b;};  //괄호안에 매개변수
        int result = mc.sum(3,4);
        System.out.println(result);

        Calculator mc1 = (a,b ) -> {return a+b;};
        int result2 = mc1.sum(4,5); // 매개변수 생략
        System.out.println(result2);

    }



    //------------------------------------------------------
    @DisplayName("람다식을 사용한 for문")
    @Test
    void enhanceForLamda(){
        ArrayList<Integer> daylist =new ArrayList<Integer>();
        daylist.add(3);
        daylist.add(12);
        daylist.add(22);
        for(int a : daylist){
            System.out.println(a);
        }

    }

    //------------------------------------------------------
    //java8의 Function은 무엇인가?
    //1개의 인자(Type T)를 받고 1개의 객체(Type R)를 리턴하는 함수형 인터페이스입니다.

    @DisplayName("Function 사용법")
    @Test
    void funtionTest(){
        Function<Integer, Integer> func1 = x -> x * x;
        Integer result = func1.apply(10);
        System.out.println(result);

    }




}
