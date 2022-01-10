package java100one;


//문제 11
//아래의 메서드 구현 코드에서 틀린 곳을 찾아 올바르게 수정하시오.
//이 문제는 자바의 메서드 구현시 기본적인 주의점에 대해서 아는지를 묻는 문제이다.
//클래스명.메서드명();
//우선 static은 static을 호출한다 


//public class Java100ClassThree {
//
//	public void helloWorld() {
//		System.out.println( "Hello, World~ ^_^" );
//	}
//	 
//	public static void main(String[] args) {
//		// [1] : 메서드 호출 
//		helloWorld();
//		
//	}
//}

//해설11 
//public class Java100ClassThree {
//	
//	public static void helloWorld() {				//호출할때 static 끼리 호출할수있다.  
//		System.out.println( "Hello, World~ ^_^" );
//	}
//	
//	public static void main(String[] args) {	
//		helloWorld();
//	}	
//
//}


//문제12
//메서드의 정의와 기본적인 자바의 메서드를 작성해보시오.
//이 문제는 자바의 메서드 개념과 메서드가 가지는 여러 특징들에 대해서 알고 있는지를 묻는 문제


//[1] 메서드란 무엇인가?
// (1) 메서드는 다른 언어에서의 함수와 마찬가지로 어떤 특정한 동작이나 처리를 하도록 만들어진 코드 단위이다.
// (2) 반복적인 작업을 처리해야 하는 경우 메서드로 만들어놓으면 이후에 필요할때 다시 재사용할 수 있어서 아주 유용하다. 
// (3) 메서드는 호출시 어떤 결과를 반환하기도 하지만, 결과를 반환하지 않는메서드도 있다.
// (4) 메서드는 호출시 어떤 인자 값들을 넘겨서 호출하는 경우도 있지만, 인자 값 없이 호출하는 경우도 있다. 


//[2]: 메서드 종류 -->크게 4가지유형
//(1) 반환값 --> x   받는 인자값--> x
//(2) 반환값 --> x   받는 인자값--> o
//(3) 반환값 --> o   받는 인자값--> x
//(4) 반환값 --> o   받는 인자값--> o



//public class Java100ClassThree {
//	
//	public static void helloWorld() {			//static 선언 
//		System.out.println("hello world");
//	}
//	
//	public static void showMenu() {			//static 선언 
//		System.out.println("showmenu() 메서드가 호출되었습니다.");
//	}
//	
//	public static void main(String[] args) {	//static 선언 
//		
//		//반환값 -->x    받는인자값 -->x
//		showMenu();
//		helloWorld();
//	}
//}


//문제13
//반환값이 없고 받는 인자값이 2개 있는 덧셈 메서드를 구현하시오.
//이 문제는 자바의 메서드 작성법과 반환값, 인자값에 대한 이해가 있는지를 묻는 문제이다.


//public class Java100ClassThree {
//	
//	public static void plusMethod(int a,int b) {		//인자값에는 자료형을 써야한다. 
//		//단순 출력 
//		System.out.printf("인자로 넘겨받은 2개의 값은 %d과 %d입니다.", a,b);
//		
//		//연산 출력
//		int rst = a+b;
//		System.out.println("두수더한값은 =" + rst);
//	}
//	
//	
//	public static void main(String[] args) {
//		//[1]:반환값 --> x   받는 인자값 --> o
//		//메서드가 받는 인자값이 있다는 것은 호출부에서 파라미터 값을 넘긴다는 뜻.
//		int a=100, b=200;
//		plusMethod(a,b);
//	}
//}




//문제14 
//반환값이 있고 받는 인자값이 없는 메서드를 구현해보시오.
//이 문제는 자바의 메서드 작성법과 반환값, 인자값에 대한 이해가 있는지를 묻는 문제이다.


//해설 14
//public class Java100ClassThree {
//	
//	public static int returnMethod() {
//		int ret = 100;
//		ret += 100;
//		return ret;
//	}
//	
//	public static void main(String[] args) {
//		
//		//[1]:반환값 --> o   받는 인자값 --> x
//		//반환값이 있다는것은 return할 값이있다는것이다. 
//		int rst = returnMethod();
//		
//		//[2]:출력
//		System.out.println("메서드 호출에 따른리턴된 값은= " + rst);
//		
//	}
//}


//문제15
//반환값이 있고 받는 인자값이 있는 대문자 출력 메서드를 구현해보시오.
//메서드는 ( "korea" ) 입력시 대문자로 출력되도록 구현한다.
//이 문제는 자바의 메서드 작성법과 반환값, 인자값에 대한 이해가 있는지를 묻는 문제이다.


//해설 15

//public class Java100ClassThree {
//	
//	public static String capitalMethod(String str) {
//		
//		// 문자열 변수 선언
//		String ret = str.toUpperCase();
//		return ret;
//	}
//	
//	public static void main(String[] args) {
//		//[1]:반환값 --> o   받는 인자값 -->o
//		//반환값이 있다는 것은 메서드(함수) 호출에 따른 리턴값이 있다는 것으로 호출시 리턴값을 받는 변수를 정의한다.
//		//문자열 변수 선언
//		String rst;
//		
//		rst = capitalMethod("korea");
//		
//		
//		//[2]: 출력 
//		System.out.println("입력한 소문자의 대문자는 =" +rst);
//		
//	}
//	
//}



//문제16
//static 선언이 안되어있는 메서드를 사용하는 방법에 대해서 코드로 구현해보시오.
//이 문제는 메인 메서드에서 static 선언이 없는 메서드를 사용하는 방법에 대해서 아는지를 묻는 문제이다. 
// 클래스와 객체에 대한 선행 학습이 필요하므로 이에 대한 학습 후 본 문제를 다시 풀어보는 것이 좋다.

//해설 16
public class Java100ClassThree {
	public static void main(String[] args) {
			
	}
}
















