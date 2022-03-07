package study_java.src.com.yunrap.javaBookStandard;

public class Chapter8 {
    public static void main(String args[]){
        try{
            copyFiles();
            return;
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            deleteTempFiles();
        }// try-catch의 끝
    }//main 의 끝

    static void copyFiles(){
        try{
            System.out.println("copyFiles() 의 try 블럭이 호출되었습니다.");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("copyFiles() 의 finally 블럭이 실행되었습니다.");
        }
    }       //파일들을 복사하는 코드를 적는다.
    static void deleteTempFiles(){
        try{
            System.out.println("deleteTempFiles() 의 try 블럭이 호출되었습니다.");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("deleteTempFiles() 의 finally 블럭이 실행되었습니다.");
        }
    } //입시파일들을 삭제하는 코드를 적는다.

}
