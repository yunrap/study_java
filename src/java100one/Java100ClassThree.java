package java100one;

import java.util.Arrays;

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
//public class Java100ClassThree {
//	public void helloWorld() {
//		System.out.println("hello world");
//	}
//	
//	public static void main(String[] args) {
//		
//		//[1]메서드 호출
//		//helloWorld(); //-- 메인 메서드는 static 메서드만 호출할수있기 때문에 에러 
//		
//		//[2] 객체 생성 후 메서드 호출
//		Java100ClassThree jse = new Java100ClassThree();
//		jse.helloWorld();
//		
//	}
//}


//문제17
//메서드로 인자 전달시 정수 100을 보냈을 때의 아래 코드의 결과를 말해보시오.
//이 문제는 자바의 기본형 타입과 참조형 타입의 다양한 메서드 호출 방식에 대해서 아는지를 묻는 문제이다.

//public class Java100ClassThree {
//
//	//[!] : Call by value --> 값에의한 호출 -> 값에 의해서 (메서드를) 호출 
//	// 메서드로 인자값을 넘길때 해당 값을 복사하여 넘기는 방식 ===>  따라서 sum()메서드 내부에서는 복사된 값으로 처리를한다. 
//	
//	
//	public static void sum(int a) {
//		a += 400;
//		System.out.println(a);	//500 
//	}
//	
//	public static void main(String[] args) {
//		
//		//[1]:변수 선언 및 메서드 호출 
//		int a = 100;
//		sum(a);
//		
//		//[2]:출력 
//		System.out.println(a); //100
//	}
//
//}

//문제18
//메인 메서드에서 100을 보냈을 때 값이 수정되게끔 Call by reference 방식으로 코드를 수정하시오.
//이 문제는 앞서 다뤘던 문제의 Call by value 방식을 Call by reference 방식으로 수정해서 보내라는 의미다. 
// a 값이 같은 결과가 나오도록 코드를 수정해보시오.

//public class Java100ClassThree {
//	
//	public static void sum(Java100ClassThree a) {
//		System.out.println("sum()메서드안에서 a값 출력 ---> " +a);	// 1주소값 
//	}
//	
//	public static void main(String[] args) {
//		//[1] :변수 선언 및 메서드 호출
//		//wrapper 클래스 Integer 클래스타입으로 변수 a로 선언하고, new로 객체를 생성하여 해당 주소값을 메서드로 보낸다. 
//		Java100ClassThree gab = new Java100ClassThree();
//		sum(gab);
//		//[2] : 출력 
//		System.out.println(gab);		//2주소
//		
////		1주소값 = 2주소값 서로같다. 
//	}
//}


//문제19
//메인 메서드에서 정수 100을 Call by reference 방식으로 메서드 호출하는 코드를 구현하시오.
//이 문제는 앞서 다뤘던 문제의 Call by value 방식을 Call by reference 방식으로 수정해서 보내라는 의미다.
//a 값이 같은 결과가 나오도록 코드를 수정해보시오.
//단, 클래스와 Wrapper, 객체 생성에 대한 개념이 필요하므로 관련 공부를 하고 보는 것이 이해하는데 도움이 된다.

//class TestNumber{
//	int num;
//	TestNumber(int num) {this.num = num;}
//}
//
//public class Java100ClassThree {
//	
//	public static void sum(TestNumber a) {
//		System.out.println("sum() 메서드안에서의 a값 -->" +a);//a값을 출력해보면 주소가 들어있음을 알수있다.
//		System.out.println(a.num);	//100
//		a.num = a.num + 400;
//		System.out.println(a.num);	//500
//	}
//	
//	public static void main(String[] args) {
//		//[1]:객체 변수 선언
//		TestNumber a = new TestNumber(100);
//		sum(a);
//		System.out.println("-------------------");
//		System.out.println(a.num);//100 --> 500
//	}
//}


//문제20
//2개의 정수형 값을 리턴하는 메서드를 구현하시오.
//이 문제는 두개의 리턴 값을 반환하는 메서드 작성법을 아는지에 대해서 묻는 문제이다. 

//import java.util.Arrays;
//public class Java100ClassThree {
//	
//	public static int[] testMethod() {
//		int num1 = 100;
//		int num2 = 200;
//		return new int[] {num1, num2};
//	}
//	
//	public static void main(String[] args) {
//		
//		//[1]:변수선언-->  메서드로 부터 반환받을 값이 배열이기 때문에.
//		int[] result = testMethod();
//		
//		//[2]: 출력
//		System.out.println(result[0]+ " - " +result[1]);	//각각출
//		System.out.println(result[0]+ result[1]);	//300
//		System.out.println(result);					//주소값 출력
//		System.out.println(Arrays.toString(result)); //한방에 모든요소를 출력 --> 반복문 사용없이...
//		
//	}
//}

//문제21
//반환값이 2개 있는 메서드를 구현해보시오.
//메서드는 ( "korea", "USA" ) 입력시 소문자는 대문자로 대문자는 소문자로 출력되도록 구현한다.
//이 문제는 자바의 메서드 작성시 리턴되는 반환값이 2개일 때 처리하는 방법을 아는지에 대해서 묻는 문제이다.


//public class Java100ClassThree {
//	
//	
//	public static String[] capitalMethod(String a, String b) {
//		
//		String a_ = a.toUpperCase();
//		String b_ = b.toLowerCase();
//		
//		// 리턴값 2개를 저장할 배열 변수 선언 
//		String[] ret = {a_, b_};
//		return ret;
//	}
//	
//	public static void main(String[] args) {
//		//[1]:반환값 --> o	받는 인자값--> o
//		//반환값이 있다는것-->메서드(호출) 호출에따른리턴값이 있다는 것 --> 호출부에서 리턴값을 받는 변수 정의
//		String[] result = capitalMethod("korea", "USA");
//		
//		//[2]:출력 
//		System.out.println(result);	//주소값 출력
//		System.out.println(result[0]);	//KOREA
//		System.out.println(result[1]);	//usa
//		System.out.println(result[0] + "-" + result[1]);	//usa
//		System.out.println(Arrays.toString(result));
//		
//	}
//}


//문제22
//클래스란 무엇이고 어떤 역할을 하는지에 대해서 설명해보시오.
//이 문제는 클래스의 개념과 역할, 용도 등에 대해서 알고 있는지를 묻는 문제이다.

//[1]: 클래스란 무엇인가?
//클래스란 객체(또는 인스턴스)를 생성하는 하나의 공장(=틀, 프레임, 템플릿, 판형 등등...)이다.
//시골 허허벌판에 농기계를 만들어내는 공장(class)이 들어섰고, 농부들이 주문을 넣으면 농기계가 만들어져나온다. -->그게바로 "객체"~!!
//농기계 공장을 하나의 예로 들었을뿐 얼마든지 내가 만들고자 하는 것을클래스로 만들어낼 수있따.
//자동차 클래스(공장) , 동물 클래스(공장), AI 로봇클래스(공장) 등등... 만들고싶은거 다 만들수 있다. 


//[2]: 클래스 공장을 통해서 객체를 어떻게 만들어내지?
//사람들이 공장에 주문을 넣는 과정을 잘 생각해보면 답은 쉽게 나온다.
//예를들면, 어떤 농부가 경작용 트랙터를 주문한다고 하면 가격을 고민하고, 색상도 고민하고, 연식도 고민할 것이다.
//뿐만아니라, 트랙터의 기능이나 성능 등 동작들에 대해서도 많은 고민을 할 것이다. 
//고민하는걸 2개정도로 압축하면 크게 봤을때 "특징"과 "동작"이된다. 
//클래스는 이러한 만들고자 하는 객체 "특징"과 "동작"에 많은 시간을 들이고 집중하면서 설계를 하게된다. 

//[3]: 위사항들을 조금은 어려운말로 정의해본다면?
//객체의 특징 -->속성(attribute)
//객체의 동작 -->메서드(method) --> 함수와 거의 동일.
//클래내에서의 함수는 메서드라고 부른다. 거의 함수와 동일하다. 

















