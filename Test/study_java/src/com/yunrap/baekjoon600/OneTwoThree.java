package study_java.src.com.yunrap.baekjoon600;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

/*
* 1,2,3 단계를위한 연습장
*
* class Main{} 첨부
* */
public class OneTwoThree {

    @DisplayName("1330번 두수 비교하기")
    @Test
    public static void comparable(String args[]){
        int a=0, b=0;
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        b = input.nextInt();

        if(a > b){
            System.out.println(">");
        }else if(a < b){
            System.out.println("<");
        }else{
            System.out.println("==");
        }
    }
}



/*
기본형식
* import java.util.Scanner;

class Main{
	public static void main(String args[]) {

	double a = 0, b = 0;
	Scanner input = new Scanner(System.in);
	a = input.nextInt();
	b = input.nextInt();

	System.out.print((double)a/b);


	}
}*/