package java100one;
/*
public class Java100ClassOne {	//클래스는 대문자 
	public static void main(String[] args) {	//String 
		System.out.println("Hello world");		//System , 세미콜론 사용 ,문자열은 " "
	}
}
*/


//자바는 클래스명이 첫시작은 대문자로 설정한다  

//자바 100제 변수  

//public class Java100ClassOne {
//	public static void main(String[] args) {
//		System.out.println("Hello world");
//	}
//}

//
//접근제한자 클래스선언 클래스이름 {
//	접근제한자 static 반환타입 메서드이름(파라미터) {
//		//구현할 코드 작성 
//	}
//}

//(1) 접근제한자 --> public, private, protected, default 
//			--> 클래스나 매서드에 접근할수있는 범위를 지정 --> 접근제한자, 접근제어자
//			--> private > protected > public
//(2) 클래스선언 --> class
//			--> 객체를 생성하는 공장 
//(3) 클래스이름 --> 카멜케이스(단어와 단어사이의 구분 --> 대문자 )
//(4) 메서드이름 --> 메서드란? 함수 --> 어떤 특정한 동작이나 작업, 행위등을 수행하는 것.



//(1)메인메서드 --> main() --> 만약 다르게 작성하면 기본 메서드를 찾을 수 없다라고 에러 발생 --> 기본 메서드(main) 작성하라고함
//					--> 자바크로그램이 실행되면 제일 먼저 메인 메서드를 찾아서 실행.
//					--> 길제 작성된 소스에서 그 프로그램의 시작이 어딘지 알 수 없으면 안되므로 시작점을 알려주는 용도 --> entry point --> main()
//(2)파라미터 --> 메서드(함수) 호출시 하나 or 둘 이상의 파라미터 값을 넣어서 호출할 수 있음 . 
//			--> 그러한 인수(파라미터)들의 값을 저장할 변수(바구니) 들을 명시. 
//			--> String --> 문자열 --> [] 배열 --> args 
//			--> args는 하나의 변수명일경우 임의의 이름을 지정해도 무방. 

//(3)반환할타입 --> return type --> 반환할 값이 있냐? 없냐 --> 없으면 void


// 문제1
// 자바 메인메서드에서 static 이 없으면 안되는 이유를 설명하시오 

//(1) static으로 선언된 함수(메서드)나 변수는 자바 버츄얼 머신에서 인스턴스 객체 생성없이 호출 할수있다. 
//		쉽게말해서 , 객체 생성없이 해당 함수(메서드)를 호출해서 사용할 수 있다. 
// 자바프로그램을 실행하면 static으로 지정된 메서드를 찾아서 먼저 메모리에 할당시킨다. 
// static으로 지정된 메서드가 여러개인 경우에는 객체를 생성하는 것과 상관없이 모두 메모리에 할당시킨다.
// 그런후에, "main"으로 이름이 만들어진 메서드가 있는지를 찾아서 그 메서드를 가장 먼저 시작점의 메소드로 호출시킨다 

// 변수란 무엇인가? --> 바구니이다. --> 데이터를 저장하는 메모리공간이다. --> 변하는 수 
// 변수선언이란 무엇인가? --> 변수를 사용하기 위해서는 먼저 변수의 타입에 맞는 선언을 해줘야한다. 
// 정수형의 변수를 사용하고자 한다면 --> 먼저 정수형의 타입의 자료형을 선언해주고 사용해야 한다. 

// 변수의 용도? --> 저장 --> 어떤 연산을 수행할 때 값들을 저장해놓아야 하는데 그때 변수를 활용한다. 

// 왜필요한가? 

//public class Java100ClassOne {
//	public static void main(String[] args)
//	{
//		int a; //정수가 저장될 변수 이름을 a 로 만들어라
//		int b;
//		int sum;
//		
//		a=3;
//		b=4;
//
//		sum = a + b;
//		System.out.print(sum);
//		
//		sum = a + b + a;
//		System.out.print(sum);
//
//	}
//}

//자바의 데이터타입에대해서 각 타입의 사이즈와 함께 설명해보시오.
//정수형의 경우 사이즈와 범위도 말해보시오.
//이문제는 자바의 자료형 종류와 각 타입의 사이즈에 대해서 아는지를 묻는 문제이다

//[1] : 크게 봤을때 --> 기본형타입,참조형 타입
//[2] : 기본형 타입(privitive data type) ---> 8개
//정수형 --> byte(1byte) , short(2), int(4), long(8)
//실수형 --> float(4) , double(8)
//문자형 --> char(2byte) --> 문자한개 --> 참고로 문자열을 다루는 타입은 없다.
//논리형 --> boolean(1byte) --> true, false 

// [3] : 참조형타입 (Reference Data Type) --> 위 기본형에 속하지 않는 데이터형들
// 대표적인 것들 --> 클래스, 배열, 인터페이스, 문자열 
// 참조형 변수의 특징 --> 데이터가 저장된 메모리의 주소값을 저장하는 변수이다. 




//문제 
//자바의 Primitive Data Type의 바이트 크기와 비트 크기를 출력하는 코드를 구현하시오.
//정수형 타입과 문자형 타입에 대해서만 구현한다.
//이때, 각 타입의 최댓값과 최솟값도 같이 구하여 출력하시오.
//아래 결과에서 문자형의 최댓값, 최솟값이 제대로 출력이 안되었는데 그 이유를 설명하고 수정해보시오.


//public class Java100ClassOne {
//	public static void main(String[] args) {
//		// byte(1), short(2), int(4), long(8), char
//		System.out.println(Byte.BYTES);		//바이트계산 
//		System.out.println(Byte.SIZE);		//비트계산 
//		
//		System.out.println(Short.BYTES);		//바이트계산 
//		System.out.println(Short.SIZE);		//비트계산 
//
//		System.out.println(Byte.BYTES + "바이트" + "-->" + Byte.SIZE+"비트" + Byte.MIN_VALUE + "~" + Byte.MAX_VALUE);		//바이트계산 
//		System.out.println(Short.BYTES + "바이트" + "-->" + Short.SIZE+"비트" + Short.MIN_VALUE + "~" + Short.MAX_VALUE);		//바이트계산 
//		System.out.println(Integer.BYTES + "바이트" + "-->" + Integer.SIZE+"비트" + Integer.MIN_VALUE + "~" + Integer.MAX_VALUE);		//바이트계산 
//		System.out.println(Long.BYTES + "바이트" + "-->" + Long.SIZE+"비트" + Long.MIN_VALUE + "~" + Long.MAX_VALUE);		//바이트계산 
//		System.out.println(Character.BYTES + "바이트" + "-->" + Character.SIZE+"비트" + (int)Character.MIN_VALUE + "~" + (int)Character.MAX_VALUE);		//바이트계산 
//
//		
//	}
//}

//문제 
//정수, 실수, 문자형 타입의 변수 사용에서 틀린 곳을 찾아서 모두 수정하시오.
//혹, 에러가 안나더라도 올바르게 수정해주시오.
//이 문제는 변수 선언과 사용시 주의할 점에 대해서 알고 있는지를 묻는 문제이다.


//public class Java100ClassOne {
//	public static void main(String[] args) {
//		int a;
//		int b; int c = 90;
//		double d;
//		char e;
//		
//		a = 10; 
//		d = 10; 
//		e = "A";	//문자는 '' 로 표시한다. 
//		
//		b=10;
//		
//		System.out.println( a ); 
//		System.out.println( b ); //변수를 초기화되지않은 상태에서 출력했다 
//		System.out.println( c ); 
//		System.out.println( d ); 
//		System.out.println( e );
//	}
//}

//public class Java100ClassOne {
//	public static void main(String[] args) {
		
//		
//		//[1] 변수선언
//		int a;
//		int b; int c = 90;
//		double d;
//		char e;
//		
//		//[2] 선언된 변수에 값을 대입
//		a = 10;
//		b = 20;
//		d = 10; //정수 10을 입력하면 10.0 으로 출력 
//		e = 'A';//쌍따움표하면 에러 
//		
//		
//		//[3]: 출력
//		System.out.println(a); //10
//		System.out.println(b);	//20
//		System.out.println(c);	//90
//		System.out.println(d);	//10.0
//		System.out.println(e);	//A
//		
//		//[4] : 여러개 변수 선언 및 초기화 --> 선언 후 값을 셋팅
//		int w; // 에러x --> 안쓰는데 왜 선언했나요???
//		int x,y,z = 100; //z만 초기화가 되고 x, y 는 초기화가 안됨 
//		
//		System.out.println("[4-1]:" + z);
//		
//		//[4-2]
//		int x,y,z;
//		x = 900;
//		y = 900;
//		z = 900;
//		System.out.println("[4-2]:" + x+ "-" +y+ "-" +z);
		
		//[4-3] 이방식이 조금더 낫다?..
//		int x1=300, y1=400, z1=300;
		
		//[4-4] 같은 값으로 초기화 
//		String str1, str2, str3;
//		str1, str2, str3 = "korea";
//		String str1, str2, str3;
//		str1 = str2 = str3 = "korea";
//		System.out.println(str1 +  str2 + str3);
		
//	}
//}


//기본형 타입의 값을 초기화한 아래의 코드에서 틀린 곳을 찾아 수정하시오.
//이 문제는 기본형 타입의 값을 초기화하는 방법에 대해서 알고 있는지를 묻는 문제이다.




//public class Java100ClassOne {
//	public static void main(String[] args) {
//		
//		//[1] : 기본형 타입 --> 8개 --> 변수 선언과 동시에 값을 입력 byte b = 100;
//		byte b = 127;
//		short s = 32767;
//		int i = 2147483647;
//		long l = 700000;
//		boolean bi = true;
//		System.out.println(b + "byte 최대값" + Byte.MAX_VALUE);
//		System.out.println(s + "short 최대값" + Short.MAX_VALUE);
//		System.out.println(i + "int 최대값" + Integer.MAX_VALUE);
//		System.out.println(l);
//
//	}
//}

//정수형 변수를 문자형으로 형(Type) 변환시켜서 출력하면 어떤 결과가 나오는지 말해보시오.
//아래 코드의 결과를 예상하여 말해보시오.
//이 문제는 정수형과 문자형의 타입 변환시 일어나는 변화에 대해서 알고 있는지를 묻는 문제이다.
//public class Java100ClassOne {
//public static void main(String[] args) {
//	
//	// [1]
//	short a = 'A'; 
//	System.out.println( a );	//a = 
//	// [2]
//	short b = 90; 
//	System.out.println( (char)b );
//	// [3]
//	char c = 'C'; 
//	System.out.println( (short)c );
//	}
//
//}


//문제 
//정수형(int)을 문자열(String)로 변환하여 정수의 자릿수를 구하는 코드를 구현해보시오.
//정수 12345를 입력하면"자릿수가 "5"로 출력되도록 한다.
//이 문제는 정수형을 문자열로 문자열을 정수형으로 변환하는 방법에 대해서 아는지를 묻는 문제이다.

//public class Java100ClassOne {
//	public static void main(String[] args) {
//		int a = 12345;
//		String str = "123";
//		System.out.println(str.length()); //5
//		
//		//정수를 -> 문자열로 변환해주는것.
//		String atra = String.valueOf(a);
//		System.out.println(atra.length());
//		
//		// [3] : 문자열 + 정수형 = ?
//		System.out.println(12345 + 1);
//		System.out.println(str + 1);
//		
//		// [4]: 문자열 -> 정수로 변환 
//		int b = Integer.valueOf(str);
//		System.out.println("[4]-->" + (b + 1));
//		
//	}
//}


//문제 
//수치 연산자에 대해서 설명해보시오.
//이 문제는 자바의 기본적인 수치 연산자에 대해서 알고 있는지를 묻는 문제이다.

//public class Java100ClassOne {
//	public static void main(String[] args) {
//		
//		int a,b,c,d;
//		a=60; b=7; c=2; d=20;
//		
//		System.out.println(a+b);
//		System.out.println("a+b="+ (a+b));	//괄호로 구별해서 먼저 연산하게끔해준다. 
//		System.out.println("a-b="+(a-b));
//		System.out.println("a*b="+(a*b));
//		System.out.println("a/b="+(a/b));
//		System.out.println("a%b="+(a%b));
//	}
//}



//문제 
//수치 연산자를 사용한 연산에서 소숫점 결과가 예상과 다르게 나오는 것에 대해서 설명해보시오. // 아래의 코드 결과가 올바르게 나오도록 수정해보시오.
//이 문제는 자바의 기본적인 수치 연산자에 대해서 알고 있는지를 묻는 문제이다.

//public class Java100ClassOne {
//	public static void main(String[] args) {
//	
//	//축약된 형태 
//	int a=0, b=100;
//	a = a+1;
//	System.out.println(a);
//	
//	a += 1;			//이렇게쓰는 방법 알아야한다. 
//	System.out.println(a);
//	
//	a -= 1;
//	System.out.println(a);
//
//	b++;
//	System.out.println(b); //101
//
//	b++;
//	System.out.println(b); //102
//
//	
//	}
//}





//문제 
//수치 연산자를 사용한 연산에서 소숫점 결과가 예상과 다르게 나오는 것에 대해서 설명해보시오. // 아래의 코드 결과가 올바르게 나오도록 수정해보시오.
//이 문제는 자바의 기본적인 수치 연산자에 대해서 알고 있는지를 묻는 문제이다.

//public class Java100ClassOne {
//	public static void main(String[] args) {
//		int a=60, b=8;
//		int rst1;
//		
//		rst1 = a/b;
//		
//		System.out.println(rst1);
//		System.out.println((double)(rst1));	//7.0 으로 출력
//		
//		double rst2;
//		rst2 = a/(double)b;
//		System.out.println(rst2);		//둘중에 하나만 double로 바꾸면 , 자바는 더큰값을 자료형으로인식해7.5가 출력된다. 
//
//	}
//}


//문제
//관계 연산자에 대해서 설명해보시오.
//이 문제는 자바의 기본적인 관계 연산자에 대해서 알고 있는지를 묻는 문제이다.
//public class Java100ClassOne {
//	public static void main(String[] args) {
//	
//		//관계연산자  ==, != , >=, <=  즉 참과 거짓이냐 
//		//과너계연산자를 사용해서 연산을 수행하면 그결과는 참, 거짓이된다.
//		
//		int kor = 70, eng = 30, math=39;
//		boolean rst1, rst2, rst3 ;
//		
//		rst1 = kor == eng; //false
//		rst2 = kor != eng; //true
//		rst3 = kor > eng; //true
//		System.out.println(rst1);
//		System.out.println(rst2);
//		System.out.println(rst3);
//
//	}
//}





//문제
//논리 연산자에 대해서 설명해보시오.
//참, 거짓을 판단하는 문장을 가지고 논리 연산자를 사용해보시오.
//이 문제는 자바의 기본적인 논리 연산자에 대해서 알고 있는지를 묻는 문제이다.

//public class Java100ClassOne {
//	public static void main(String[] args) {
//		
//		// &&(and)   || (or)   ! (not)
//		// A && B 둘다 모두 참이여야함
//		// A || B 둘중 하나만 참이여만함
//			
//		int a = 10, b=20, c=30; 
//		
//		boolean rst1 = a<b && c>b;
//		System.out.println(rst1);
//		
//		boolean rst2 = a<b || c<b;
//		System.out.println(rst2);
//	
//		boolean rst3 = a>c || b!=c;
//		System.out.println(rst3);
//		
//	}	
//}












			