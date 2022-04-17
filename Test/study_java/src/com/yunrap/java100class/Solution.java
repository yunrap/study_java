package study_java.src.com.yunrap.java100class;

import java.util.Arrays;

/*
//문제1
public class Solution {
    public int[] solution(String[] shirtSize) {
        int[] size_counter = new int[6];
        for(int i = 0; i < shirtSize.length; ++i) {
            if(shirtSize[i].equals("XS"))
                size_counter[0]++;
            else if(shirtSize[i].equals("S"))
                size_counter[1]++;
            else if(shirtSize[i].equals("M"))
                size_counter[2]++;
            else if(shirtSize[i].equals("L"))
                size_counter[3]++;
            else if(shirtSize[i].equals("XL"))
                size_counter[4]++;
            else if(shirt_size[i].equals("XXL"))
                size_counter[5]++;
        }
        return size_counter;
    }

    // The following is main method to output testcase.
    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] shirtSize = {"XS", "S", "L", "L", "XL", "S"};
        int[] ret = sol.solution(shirtSize);

        // Press Run button to receive output.
        System.out.println("Solution: return value of the method is " + Arrays.toString(ret) + " .");
    }
}*/

//문제2
/*class Solution {
    public int solution(int price, String grade) {
        //1. if문으로 grade가 S, G, V 설정
        //2. s일경우 s * 0.95, g일경우 g * 0.9, v일경우 v * 0.85
        int answer = 0;

        if(grade.equals("S")){
            answer = (int)(price * 0.95);
        }else if(grade.equals("G")){
            answer = (int)(price * 0.9);
        }else{
            answer = (int)(price * 0.85);
        }
        return answer;
    }

    // The following is main method to output testcase.
    public static void main(String[] args) {
        Solution sol = new Solution();
        int price1 = 2500;
        String grade1 = new String("V");
        int ret1 = sol.solution(price1, grade1);

        // Press Run button to receive output.
        System.out.println("Solution: return value of the method is " + ret1 + " .");

        int price2 = 96900;
        String grade2 = new String("S");
        int ret2 = sol.solution(price2, grade2);

        // Press Run button to receive output.
        System.out.println("Solution: return value of the method is " + ret2 + " .");
    }
}*/







