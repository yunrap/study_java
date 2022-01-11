
# 자바 1000제 part1

## 변수

### 문제1 <br>
자바의 기본적인 코드를 작성한 것인데 에러가 많이 나온다. 에러를 모두 찾아서 수정하시오. <br>
이 문제는 자바의 기본적인 코드 작성 규칙을 알고 있는지와 그에 따라 작성할 수 있는지를 묻는 문제이다.
```
public class java100_variable_HelloWorld {

	public static void main(string[] args) 
	{ 
		system.out.println( 'Hello World~' )
	}
}
```


해설1
```
public class Java100ClassOne {	//클래스는 대문자 
	public static void main(String[] args) {	//String 
		System.out.println("Hello world");		//System , 세미콜론 사용 ,문자열은 " "
	}
}	//자바는 클래스명이 첫시작은 대문자로 설정한다 
```



### 문제2 <br>
자바의 기본적인 코드 구성에서 각 키워드를 간략히 설명해보시오. <br>
이 문제는 자바 코드의 주요 키워드들에 대해서 각각의 의미와 쓰임새(용도)에 대해서 아는지를 묻는 문제이다. <br>
 지금 단계에서는 간략한 개념 정도만 알면 된다. 더 알 수도 없다.<br>
 ```
 public class Java100ClassOne {
	public static void main(String[] args) {
		System.out.println("Hello world");
	}
}
 ```


해설2

접근제한자 클래스선언 클래스이름 {
	접근제한자 static 반환타입 메서드이름(파라미터) {
		//구현할 코드 작성 
	}
}


(1) 접근제한자 --> public, private, protected, default <br>
--> 클래스나 매서드에 접근할수있는 범위를 지정 --> 접근제한자, 접근제어자 <br>
--> private > protected > public	 <br>
(2) 클래스선언 --> class <br>
--> 객체를 생성하는 공장 <br>
(3) 클래스이름 --> 카멜케이스(단어와 단어사이의 구분 --> 대문자 ) <br>
(4) 메서드이름 --> 메서드란? 함수 --> 어떤 특정한 동작이나 작업, 행위등을 수행하는 것. <br>



### 문제3
자바의 메인 메서드를 작성한 코드에서 틀린 곳을 찾아서 모두 수정하시오. <br>
이 문제는 자바의 기본 코드 구성에서 메인 메서드의 특징과 주의할 점에 대해서 아는지를 묻는 문제이다. <br>


```
public class Java100ClassOne {

	public void main_method(String[] gaddonge) 
	{ 
		System.out.println( "Hello World~" );
	}

}
```

해설3

```
public class Java100ClassOne {		//반드시 파일명과 클래스명과 동일하게할

	public void main(String[] gaddonge) 	//반드시 메인메소드는 메인으로 해줘야함 , 매개변수는 args가 아니여도 각자의미에맞게..
	{ 
		System.out.println( "Hello World~" );
	}

}
```

(1)메인메서드 --> main() --> 만약 다르게 작성하면 기본 메서드를 찾을 수 없다라고 에러 발생 --> 기본 메서드(main) 작성하라고함  <br>
					--> 자바크로그램이 실행되면 제일 먼저 메인 메서드를 찾아서 실행. <br>
					--> 길제 작성된 소스에서 그 프로그램의 시작이 어딘지 알 수 없으면 안되므로 시작점을 알려주는 							용도 --> entry point --> main() <br>
(2)파라미터 --> 메서드(함수) 호출시 하나 or 둘 이상의 파라미터 값을 넣어서 호출할 수 있음 . <br>
			--> 그러한 인수(파라미터)들의 값을 저장할 변수(바구니) 들을 명시. <br>
			--> String --> 문자열 --> [] 배열 --> args <br>
			--> args는 하나의 변수명일경우 임의의 이름을 지정해도 무방. <br>


### 문제4
자바 메인 메서드에서 static 키워드의 역할에 대해서 설명해보시오. (★ ★ ★) <br>
작성한 자바 코드를 실행시 static을 안쓰면 에러가 나는데 그 이유가 무엇인지도 같이 설명해보시오.  <br>
 이 문제는 static의 개념과 역할에 대해서 알고 있는지를 묻는 문제이다. <br>
 
```
public class Java100ClassOne {
	
public static void main(String[] args) 
	{ 
		System.out.println( "Hello World~" );
	}

}
```


해설4
(1) static으로 선언된 함수(메서드)나 변수는 자바 버츄얼 머신에서 인스턴스 객체 생성없이 호출 할수있다. <br>
		쉽게말해서 , 객체 생성없이 해당 함수(메서드)를 호출해서 사용할 수 있다.  <br>
 자바프로그램을 실행하면 static으로 지정된 메서드를 찾아서 먼저 메모리에 할당시킨다.  <br>
 static으로 지정된 메서드가 여러개인 경우에는 객체를 생성하는 것과 상관없이 모두 메모리에 할당시킨다. <br>
 그런후에, "main"으로 이름이 만들어진 메서드가 있는지를 찾아서 그 메서드를 가장 먼저 시작점의 메소드로 호출시킨다 <br>


### 문제5 
변수와 변수 선언이란 무엇이고, 변수의 용도와 왜 필요한지 설명해보시오. 
 1. 변수란 무엇인가?
2. 변수 선언이란 무엇인가?
3. 변수의 용도는 무엇이고 왜 필요한가?

왜필요한가? 


해설5

```
public class Java100ClassOne {
	public static void main(String[] args) {
		//5
		//9
		System.out.print(2+4);
	}
}
```

사용자가 입력한값을 변수를만들어서 저장을해놓고 어떻연산을하려해도, 변수가없다면 사용자가입력할 값들을 보관하고 저장할방법이없기때문에 <br>
변수라는 저장바구니가있다면 보관이 용이하다. 또한 프로그래밍을 유연하고 편안하게 도와준다. <br>





```
public class Java100ClassOne {
	public static void main(String[] args)
	{
		int a; //정수가 저장될 변수 이름을 a 로 만들어라
		int b;
		int sum;
		
		a=3;		//오른쪽값으로 a변수에 대입해라 
		b=4;

		sum = a + b;
		System.out.println(sum);	//println은 엔터친것과같은효과 ,printf는 그대로 표현 
		
		sum = a + b + a;			//변수는 얼마든지 변할수있다 .  변수 <-> 상수(항상같은수) 
		System.out.println(sum);

	}
}
```


## 자료형

### 문제6

자바의 데이터타입에대해서 각 타입의 사이즈와 함께 설명해보시오.<br>
정수형의 경우 사이즈와 범위도 말해보시오.<br>
이문제는 자바의 자료형 종류와 각 타입의 사이즈에 대해서 아는지를 묻는 문제이다<br>

해설6

[1] : 크게 봤을때 --> 기본형타입,참조형 타입<br>
[2] : 기본형 타입(privitive data type) ---> 8개<br>
정수형 --> byte(1byte) , short(2), int(4), long(8)<br>
실수형 --> float(4) , double(8)<br>
문자형 --> char(2byte) --> 문자한개 --> 참고로 문자열을 다루는 타입은 없다.<br>
논리형 --> boolean(1byte) --> true, false <br>

 [3] : 참조형타입 (Reference Data Type) --> 위 기본형에 속하지 않는 데이터형들<br>
 대표적인 것들 --> 클래스, 배열, 인터페이스, 문자열 <br>
 참조형 변수의 특징 --> 데이터가 저장된 메모리의 주소값을 저장하는 변수이다. <br>



### 문제7

자바의 Primitive Data Type의 바이트 크기와 비트 크기를 출력하는 코드를 구현하시오.<br>
정수형 타입과 문자형 타입에 대해서만 구현한다.<br>
이때, 각 타입의 최댓값과 최솟값도 같이 구하여 출력하시오.<br>
아래 결과에서 문자형의 최댓값, 최솟값이 제대로 출력이 안되었는데 그 이유를 설명하고 수정해보시오.<br>



[ 결과 출력 ] <br>-------------------------------------------------------------------------------------------------------------------------------------------
byte : 1(바이트) --> 8(비트)   l char : 2(바이트) --> 16(비트) <br>
-128 ~127<br>
short : 2(바이트) --> 16(비트)		-32768 ~32767<br>
int : 4(바이트) --> 32(비트)			-2147483648 ~2147483647 <br>
long : 8(바이트) --> 64(비트)		-9223372036854775808 ~9223372036854775807 <br>
 char : 2(바이트) --> 16(비트)		◦~?<br>
char : 2(바이트) --> 16(비트) 		0 ~65535<br>



해설7

```
public class Java100ClassOne {
	public static void main(String[] args) {
		// byte(1), short(2), int(4), long(8), char
		
		System.out.println(Byte.BYTES + "바이트" + "-->" + Byte.SIZE+"(비트)" + Byte.MIN_VALUE + "~" + Byte.MAX_VALUE);		
		System.out.println(Short.BYTES + "바이트" + "-->" + Short.SIZE+"비트" + Short.MIN_VALUE + "~" + Short.MAX_VALUE);		
		System.out.println(Integer.BYTES + "바이트" + "-->" + Integer.SIZE+"비트" + Integer.MIN_VALUE + "~" + Integer.MAX_VALUE);	//Integer, character 둘이 선언과 명이다름!
		System.out.println(Long.BYTES + "바이트" + "-->" + Long.SIZE+"비트" + Long.MIN_VALUE + "~" + Long.MAX_VALUE);	
		System.out.println(Character.BYTES + "바이트" + "-->" + Character.SIZE+"비트" + Character.MIN_VALUE + "~" + Character.MAX_VALUE);		
		System.out.println(Character.BYTES + "바이트" + "-->" + Character.SIZE+"비트" + (int)Character.MIN_VALUE + "~" + (int)Character.MAX_VALUE);		
		
		//char타입은 short하고 같은 크기이지만, 숫자가아닌 문자형이기때문에 int형 즉 정수형으로 출력해야 정상적인 범위가 출력된다. 
		//char타입은 음수가 없다. 
	}
}
```

### 문제8

정수, 실수, 문자형 타입의 변수 사용에서 틀린 곳을 찾아서 모두 수정하시오.<br>
혹, 에러가 안나더라도 올바르게 수정해주시오.<br>
이 문제는 변수 선언과 사용시 주의할 점에 대해서 알고 있는지를 묻는 문제이다.<br>

```
public class Java100ClassOne {
	public static void main(String[] args) {
		int a;
		int b; int c = 90;
		double d;
		char e;
		
		a = 10; 
		d = 10; 
		e = "A";	//문자는 '' 로 표시한다. 
		
		b=10;
		
		System.out.println( a ); 
		System.out.println( b ); //변수를 초기화되지않은 상태에서 출력했다 
		System.out.println( c ); 
		System.out.println( d ); 
		System.out.println( e );
	}
}
```

해설8
```
public class Java100ClassOne {
	public static void main(String[] args) {
		
		//[1] 변수선언
		int a;
		int b; int c = 90;
		double d;
		char e;
		
		//[2] 선언된 변수에 값을 대입
		a = 10;
		b = 20;
		d = 10; //정수 10을 입력하면 10.0 으로 출력 
		e = 'A';//쌍따움표하면 에러 
		
		
		//[3]: 출력
		System.out.println(a); //10
		System.out.println(b);	//20
		System.out.println(c);	//90
		System.out.println(d);	//10.0
		System.out.println(e);	//A
		
		//[4] : 여러개 변수 선언 및 초기화 --> 선언 후 값을 셋팅
		int w; // 에러x --> 안쓰는데 왜 선언했나요???
		int x,y,z = 100; //z만 초기화가 되고 x, y 는 초기화가 안됨 
		
		System.out.println("[4-1]:" + z);
		
		//[4-2]
		int x,y,z;
		x = 900;
		y = 900;
		z = 900;
		System.out.println("[4-2]:" + x+ "-" +y+ "-" +z);
		
		[4-3] 이방식이 조금더 낫다?..
		int x1=300, y1=400, z1=300;
		[4-4] 같은 값으로 초기화 
		String str1, str2, str3;
		str1, str2, str3 = "korea";
		String str1, str2, str3;
		str1 = str2 = str3 = "korea";
		System.out.println(str1 +  str2 + str3);
	}
}
```

### 문제9

기본형 타입의 값을 초기화한 아래의 코드에서 틀린 곳을 찾아 수정하시오.<br>
이 문제는 기본형 타입의 값을 초기화하는 방법에 대해서 알고 있는지를 묻는 문제이다.<br>


[1] : 기본형 타입 --> 8개 --> 변수 선언과 동시에 값을 입력 byte b = 100;<br>
short s = 30000;<br>
int i = 2100000000;<br>
long l = 7000000000; <br>
float f = 9.8;<br>
double d = 3.14; <br>
char c = 'A';<br>
boolean bl = false;<br>


해설9

```
public class Java100ClassOne {
	public static void main(String[] args) {
		
		//[1] : 기본형 타입 --> 8개 --> 변수 선언과 동시에 값을 입력 byte b = 100;
		byte b = 127;
		short s = 32767;
		int i = 2147483647;
		long l = 7000000000L;		//long형은 L 로 표시
		float f = 9.8F;			//float형은 F 로 표시
		double d = 3.14;
		char c = 'A';
		boolean bl = false;
		System.out.println(b + "byte 최대값" + Byte.MAX_VALUE);
		System.out.println(s + "short 최대값" + Short.MAX_VALUE);
		System.out.println(i + "int 최대값" + Integer.MAX_VALUE);
		System.out.println(l);
		System.out.println(f);	
		System.out.println(d);
		System.out.println(c);
		System.out.println(bl);
	}
}
```


### 문제10

정수형 변수를 문자형으로 형(Type) 변환시켜서 출력하면 어떤 결과가 나오는지 말해보시오.<br>
아래 코드의 결과를 예상하여 말해보시오.<br>
이 문제는 정수형과 문자형의 타입 변환시 일어나는 변화에 대해서 알고 있는지를 묻는 문제이다.<br>


```
public class Java100ClassOne {
public static void main(String[] args) {
	
	// [1]
	short a = 'A'; 
	System.out.println( a );	
	// [2]
	short b = 90; 
	System.out.println( (char)b );	
	// [3]
	char c = 'C'; 
	System.out.println( (short)c );
	}

}		
```


해설5

```
public class Java100ClassOne {
public static void main(String[] args) {
	
	// [1]
	short a = 'A'; 
	System.out.println( a );	//A(65) 
	// [2]
	short b = 90; 
	System.out.println( (char)b );	
	// [3]
	char c = 'C'; 
	System.out.println( (short)c );
	}

}	
//아스키테이블코드로 사용한다면 쉽다. 
```






-----------------------------------------------------------------------------------------------------
# 자바 1000제 part3


## 함수 

### 문제 11
아래의 메서드 구현 코드에서 틀린 곳을 찾아 올바르게 수정하시오. <br>
이 문제는 자바의 메서드 구현시 기본적인 주의점에 대해서 아는지를 묻는 문제이다.<br>
클래스명.메서드명();<br>
우선 static은 static을 호출한다 <br>

```
public class Java100ClassThree {

	public void helloWorld() {
		System.out.println( "Hello, World~ ^_^" );
	}
	 
	public static void main(String[] args) {
		// [1] : 메서드 호출 
		helloWorld();
		
	}
}
```

해설 11


### 문제 12
메서드의 정의와 기본적인 자바의 메서드를 작성해보시오.<br>
이 문제는 자바의 메서드 개념과 메서드가 가지는 여러 특징들에 대해서 알고 있는지를 묻는 문제<br>

[1] 메서드란 무엇인가?<br>
 (1) 메서드는 다른 언어에서의 함수와 마찬가지로 어떤 특정한 동작이나 처리를 하도록 만들어진 코드 단위이다.<br>
 (2) 반복적인 작업을 처리해야 하는 경우 메서드로 만들어놓으면 이후에 필요할때 다시 재사용할 수 있어서 아주 유용하다.<br>
 (3) 메서드는 호출시 어떤 결과를 반환하기도 하지만, 결과를 반환하지 않는메서드도 있다.<br>
 (4) 메서드는 호출시 어떤 인자 값들을 넘겨서 호출하는 경우도 있지만, 인자 값 없이 호출하는 경우도 있다. <br>

[2]: 메서드 종류 -->크게 4가지유형<br>
(1) 반환값 --> x   받는 인자값--> x<br>
(2) 반환값 --> x   받는 인자값--> o<br>
(3) 반환값 --> o   받는 인자값--> x<br>
(4) 반환값 --> o   받는 인자값--> o<br>



해설 12

```
public class Java100ClassThree {
	
	public static void helloWorld() {			//static 선언 
		System.out.println("hello world");
	}
	
	public static void showMenu() {			//static 선언 
		System.out.println("showmenu() 메서드가 호출되었습니다.");
	}
	
	public static void main(String[] args) {	//static 선언 
		
		//반환값 -->x    받는인자값 -->x
		showMenu();
		helloWorld();
	}
}
```


### 문제 13
반환값이 없고 받는 인자값이 2개 있는 덧셈 메서드를 구현하시오.<br>
이 문제는 자바의 메서드 작성법과 반환값, 인자값에 대한 이해가 있는지를 묻는 문제이다.<br>



### 해설 13

```
public class Java100ClassThree {
	
	public static void plusMethod(int a,int b) {		//인자값에는 자료형을 써야한다. 
		//단순 출력 
		System.out.printf("인자로 넘겨받은 2개의 값은 %d과 %d입니다.", a,b);
		
		//연산 출력
		int rst = a+b;
		System.out.println("두수더한값은 =" + rst);
	}
	
	
	public static void main(String[] args) {
		//[1]:반환값 --> x   받는 인자값 --> o
		//메서드가 받는 인자값이 있다는 것은 호출부에서 파라미터 값을 넘긴다는 뜻.
		int a=100, b=200;
		plusMethod(a,b);
	}
}
```



### 문제14 
반환값이 있고 받는 인자값이 없는 메서드를 구현해보시오.<br>
이 문제는 자바의 메서드 작성법과 반환값, 인자값에 대한 이해가 있는지를 묻는 문제이다.<br>


### 해설 14

```
public class Java100ClassThree {
	
	public static int returnMethod() {
		int ret = 100;
		ret += 100;
		return ret;
	}
	
	public static void main(String[] args) {
		
		//[1]:반환값 --> o   받는 인자값 --> x
		//반환값이 있다는것은 return할 값이있다는것이다. 
		int rst = returnMethod();
		
		//[2]:출력
		System.out.println("메서드 호출에 따른리턴된 값은= " + rst);
		
	}
}

```



### 문제15
반환값이 있고 받는 인자값이 있는 대문자 출력 메서드를 구현해보시오.<br>
메서드는 ( "korea" ) 입력시 대문자로 출력되도록 구현한다.<br>
이 문제는 자바의 메서드 작성법과 반환값, 인자값에 대한 이해가 있는지를 묻는 문제이다.<br>



### 해설 15

```
public class Java100ClassThree {
	
	public static String capitalMethod(String str) {
		
		// 문자열 변수 선언
		String ret = str.toUpperCase();
		return ret;
	}
	
	public static void main(String[] args) {
		//[1]:반환값 --> o   받는 인자값 -->o
		//반환값이 있다는 것은 메서드(함수) 호출에 따른 리턴값이 있다는 것으로 호출시 리턴값을 받는 변수를 정의한다.
		//문자열 변수 선언
		String rst;
		
		rst = capitalMethod("korea");
		
		
		//[2]: 출력 
		System.out.println("입력한 소문자의 대문자는 =" +rst);
		
	}
	
}
```


### 문제16
static 선언이 안되어있는 메서드를 사용하는 방법에 대해서 코드로 구현해보시오.<br>
이 문제는 메인 메서드에서 static 선언이 없는 메서드를 사용하는 방법에 대해서 아는지를 묻는 문제이다. <br>
 클래스와 객체에 대한 선행 학습이 필요하므로 이에 대한 학습 후 본 문제를 다시 풀어보는 것이 좋다.<br>
 
 
### 해설 16

 ```
 public class Java100ClassThree {
	public void helloWorld() {
		System.out.println("hello world");
	}
	
	public static void main(String[] args) {
		
		//[1]메서드 호출
		//helloWorld(); //-- 메인 메서드는 static 메서드만 호출할수있기 때문에 에러 
		
		//[2] 객체 생성 후 메서드 호출
		Java100ClassThree jse = new Java100ClassThree();
		jse.helloWorld();
		
	}
}
 ```
 
 

### 문제17
메서드로 인자 전달시 정수 100을 보냈을 때의 아래 코드의 결과를 말해보시오.<br>
이 문제는 자바의 기본형 타입과 참조형 타입의 다양한 메서드 호출 방식에 대해서 아는지를 묻는 문제이다.<br>


### 해설 17

```
public class Java100ClassThree {

	//[!] : Call by value --> 값에의한 호출 -> 값에 의해서 (메서드를) 호출 
	// 메서드로 인자값을 넘길때 해당 값을 복사하여 넘기는 방식 ===>  따라서 sum()메서드 내부에서는 복사된 값으로 처리를한다. 
	
	
	public static void sum(int a) {
		a += 400;
		System.out.println(a);	//500 
	}
	
	public static void main(String[] args) {
		
		//[1]:변수 선언 및 메서드 호출 
		int a = 100;
		sum(a);
		
		//[2]:출력 
		System.out.println(a); //100
	}

}
```


### 문제18
메인 메서드에서 100을 보냈을 때 값이 수정되게끔 Call by reference 방식으로 코드를 수정하시오.<br>
이 문제는 앞서 다뤘던 문제의 Call by value 방식을 Call by reference 방식으로 수정해서 보내라는 의미다. <br>
a 값이 같은 결과가 나오도록 코드를 수정해보시오.<br>

```
public class Java100ClassThree {
	
	public static void sum(Java100ClassThree a) {
		System.out.println("sum()메서드안에서 a값 출력 ---> " +a);	// 1주소값 
	}
	
	public static void main(String[] args) {
		//[1] :변수 선언 및 메서드 호출
		//wrapper 클래스 Integer 클래스타입으로 변수 a로 선언하고, new로 객체를 생성하여 해당 주소값을 메서드로 보낸다. 
		Java100ClassThree gab = new Java100ClassThree();
		sum(gab);
		//[2] : 출력 
		System.out.println(gab);		//2주소
		
//		1주소값 = 2주소값 서로같다. 
	}
}
```


### 문제19

메인 메서드에서 정수 100을 Call by reference 방식으로 메서드 호출하는 코드를 구현하시오.<br>
이 문제는 앞서 다뤘던 문제의 Call by value 방식을 Call by reference 방식으로 수정해서 보내라는 의미다.<br>
a 값이 같은 결과가 나오도록 코드를 수정해보시오.<br>
단, 클래스와 Wrapper, 객체 생성에 대한 개념이 필요하므로 관련 공부를 하고 보는 것이 이해하는데 도움이 된다.<br>


```
class TestNumber{
	int num;
	TestNumber(int num) {this.num = num;}
}

public class Java100ClassThree {
	
	public static void sum(TestNumber a) {
		System.out.println("sum() 메서드안에서의 a값 -->" +a);//a값을 출력해보면 주소가 들어있음을 알수있다.
		System.out.println(a.num);	//100
		a.num = a.num + 400;
		System.out.println(a.num);	//500
	}
	
	public static void main(String[] args) {
		//[1]:객체 변수 선언
		TestNumber a = new TestNumber(100);
		sum(a);
		System.out.println("-------------------");
		System.out.println(a.num);//100 --> 500
	}
}
```

### 문제20

2개의 정수형 값을 리턴하는 메서드를 구현하시오.<br>
이 문제는 두개의 리턴 값을 반환하는 메서드 작성법을 아는지에 대해서 묻는 문제이다. <br>

```
import java.util.Arrays;
public class Java100ClassThree {
	
	public static int[] testMethod() {
		int num1 = 100;
		int num2 = 200;
		return new int[] {num1, num2};
	}
	
	public static void main(String[] args) {
		
		//[1]:변수선언-->  메서드로 부터 반환받을 값이 배열이기 때문에.
		int[] result = testMethod();
		
		//[2]: 출력
		System.out.println(result[0]+ " - " +result[1]);	//각각출
		System.out.println(result[0]+ result[1]);	//300
		System.out.println(result);					//주소값 출력
		System.out.println(Arrays.toString(result)); //한방에 모든요소를 출력 --> 반복문 사용없이...
		
	}
}
```

### 문제21
반환값이 2개 있는 메서드를 구현해보시오.<br>
메서드는 ( "korea", "USA" ) 입력시 소문자는 대문자로 대문자는 소문자로 출력되도록 구현한다.<br>
이 문제는 자바의 메서드 작성시 리턴되는 반환값이 2개일 때 처리하는 방법을 아는지에 대해서 묻는 문제이다.<br>

```
public class Java100ClassThree {
	
	
	public static String[] capitalMethod(String a, String b) {
		
		String a_ = a.toUpperCase();
		String b_ = b.toLowerCase();
		
		// 리턴값 2개를 저장할 배열 변수 선언 
		String[] ret = {a_, b_};
		return ret;
	}
	
	public static void main(String[] args) {
		//[1]:반환값 --> o	받는 인자값--> o
		//반환값이 있다는것-->메서드(호출) 호출에따른리턴값이 있다는 것 --> 호출부에서 리턴값을 받는 변수 정의
		String[] result = capitalMethod("korea", "USA");
		
		//[2]:출력 
		System.out.println(result);	//주소값 출력
		System.out.println(result[0]);	//KOREA
		System.out.println(result[1]);	//usa
		System.out.println(result[0] + "-" + result[1]);	//usa
		System.out.println(Arrays.toString(result));
		
	}
}
```


### 문제22
클래스란 무엇이고 어떤 역할을 하는지에 대해서 설명해보시오.<br>
이 문제는 클래스의 개념과 역할, 용도 등에 대해서 알고 있는지를 묻는 문제이다.<br>

[1]: 클래스란 무엇인가?<br>
클래스란 객체(또는 인스턴스)를 생성하는 하나의 공장(=틀, 프레임, 템플릿, 판형 등등...)이다.<br>
시골 허허벌판에 농기계를 만들어내는 공장(class)이 들어섰고, 농부들이 주문을 넣으면 농기계가 만들어져나온다. -->그게바로 "객체"~!!<br>
농기계 공장을 하나의 예로 들었을뿐 얼마든지 내가 만들고자 하는 것을클래스로 만들어낼 수있따.<br>
자동차 클래스(공장) , 동물 클래스(공장), AI 로봇클래스(공장) 등등... 만들고싶은거 다 만들수 있다. <br>

[2]: 클래스 공장을 통해서 객체를 어떻게 만들어내지?<br>
사람들이 공장에 주문을 넣는 과정을 잘 생각해보면 답은 쉽게 나온다.<br>
예를들면, 어떤 농부가 경작용 트랙터를 주문한다고 하면 가격을 고민하고, 색상도 고민하고, 연식도 고민할 것이다.<br>
뿐만아니라, 트랙터의 기능이나 성능 등 동작들에 대해서도 많은 고민을 할 것이다. <br>
고민하는걸 2개정도로 압축하면 크게 봤을때 "특징"과 "동작"이된다. <br>
클래스는 이러한 만들고자 하는 객체 "특징"과 "동작"에 많은 시간을 들이고 집중하면서 설계를 하게된다. <br>


[3]: 위사항들을 조금은 어려운말로 정의해본다면?<br>
객체의 특징 -->속성(attribute)<br>
객체의 동작 -->메서드(method) --> 함수와 거의 동일.<br>
클래내에서의 함수는 메서드라고 부른다. 거의 함수와 동일하다. <br>

