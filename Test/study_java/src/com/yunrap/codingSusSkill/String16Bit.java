package study_java.src.com.yunrap.codingSusSkill;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.Convert;

public class String16Bit {

    @DisplayName("타입에따른 출력차이")
    @Test
    void test0(){
        char ch = 'A';  //컴퓨터는 저장할때 2진수로 100001 저장
        short a = 65;   //동일하다

        System.out.println(ch); //그러나 출력값은 다르다.  A 출력
        System.out.println(a);  // 65출력'

        System.out.println((int)ch);
        System.out.println(Integer.toBinaryString(ch));

        //println()은 변수의 타입이 정수형이면 10진수로 변환하여 출력 문자형이면 유니코드문자출력
    }

    @DisplayName("String 객체 생성방법")
    @Test
    void test1(){
        String a1 = "a";
        String a2 = new String("a");
        System.out.println("a1 = a2 : " + (a1 == a2));
    }

    @DisplayName("리터럴로 생성된 String 객체")
    @Test
    void test2(){
        String a1 = "a";
        String a2 = "a";
        System.out.println("a1 = a2 : " + (a1 == a2));
    }

}
