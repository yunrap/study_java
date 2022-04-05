package study_java.src.com.yunrap.algorithm;

/* 선택정렬 */


public class Selectsort {
    public static void main(String[] args){
        int[] a = {5, 2, 4, 7, 12, 2, 1};
        int b;
        for(int i=0; i<a.length-1; i++){
            for(int j = i+1; j<a.length; j++){
                if(a[i] > a[j]){
                    b = a[j];
                    a[j] = a[i];
                    a[i] = b;
                }
            }
        }

        for(int i =0; i<a.length; i++){
            System.out.println(a[i]);
        }
    }
}
