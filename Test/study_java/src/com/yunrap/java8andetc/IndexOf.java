package study_java.src.com.yunrap.java8andetc;

//indexOf : 입력값이 문자열에 없다면, 리턴 -1
//메서드에 문자열을 입력하면 위치에따라 숫자로 반환한다.

public class IndexOf {
    public static void main(String[] args){
        String str = "Hello world";
        System.out.println(str.indexOf("H"));       //위치에따라 숫자로 반환한다.
        System.out.println(str.indexOf("o"));       // 4
        System.out.println(str.indexOf('a'));      //값이없을땐, -1

    }
}
