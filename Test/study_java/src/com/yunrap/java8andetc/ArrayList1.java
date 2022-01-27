package study_java.src.com.yunrap.java8andetc;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class ArrayList1 {

    @DisplayName("ArrayList")
    @Test
    void arrayListTest(){
        ArrayList<Integer> arrList = new ArrayList();

        //add()메소드를 이용한 요소의 저장
        arrList.add(40);
        arrList.add(20);
        arrList.add(30);
        arrList.add(10);

        //for문과 get() 메소드를 이용한 요소의 출력
        for(int i=0; i<arrList.size(); i++)
        {
            System.out.print(arrList.get(i) + " ");
        }
        System.out.println();


        //remove() 메소드를 이용한 요소의 제거
        arrList.remove(1);


        //Enhanced for 문과 get() 메소드를 이용한 요소의 출력
        for(int e : arrList)
        {
            System.out.print(e + " ");
        }

        System.out.println("향상된 for문 ");
        for(Integer list : arrList ) {
            System.out.println(list);
        }


    }
}
