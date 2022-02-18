
# 자바 1000제 part1

### ch1 : 자바 기본코드 작성법
자바의 기본적인 코드를 작성한 것인데 에러가 많이 나온다. 에러를 모두 찾아서 수정하시오. <br>
이 문제는 자바의 기본적인 코드 작성 규칙을 알고 있는지와 그에 따라 작성할 수 있는지를 묻는 문제이다.

```java
public class java100_variable_HelloWorld {

	public static void main(string[] args) 
	{ 
		system.out.println( 'Hello World~' )
	}
}
```

<details markdown="1">

### 해설
```
public class Java100ClassOne {	//클래스는 대문자 
	public static void main(String[] args) {	//String 
		System.out.println("Hello world");		//System , 세미콜론 사용 ,문자열은 " "
	}
}	//자바는 클래스명이 첫시작은 대문자로 설정한다 
```

</details>

-----------------------------------------------------------------------------------------------------

### ch1 : 자바 기본코드 키워드
자바의 기본적인 코드 구성에서 각 키워드를 간략히 설명해보시오. <br>
이 문제는 자바 코드의 주요 키워드들에 대해서 각각의 의미와 쓰임새(용도)에 대해서 아는지를 묻는 문제이다. <br>
 지금 단계에서는 간략한 개념 정도만 알면 된다. 더 알 수도 없다.<br>

 ```java
 public class Java100ClassOne {
	public static void main(String[] args) {
		System.out.println("Hello world");
	}
}
 ```


### 해설

<details markdown="1">

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

</details>

-----------------------------------------------------------------------------------------------------
### ch1 : 자바 main 메서드 특징
자바의 메인 메서드를 작성한 코드에서 틀린 곳을 찾아서 모두 수정하시오. <br>
이 문제는 자바의 기본 코드 구성에서 메인 메서드의 특징과 주의할 점에 대해서 아는지를 묻는 문제이다. <br>

```java
public class Java100ClassOne {

	public void main_method(String[] gaddonge) 
	{ 
		System.out.println( "Hello World~" );
	}

}
```

### 해설

<details markdown="1">

```java
public class Java100ClassOne {		//반드시 파일명과 클래스명과 동일하게할

	public void main(String[] gaddonge) 	//반드시 메인메소드는 메인으로 해줘야함 , 매개변수는 args가 아니여도 각자의미에맞게..
	{ 
		System.out.println( "Hello World~" );
	}

}

/*
(1)메인메서드 --> main() --> 만약 다르게 작성하면 기본 메서드를 찾을 수 없다라고 에러 발생 --> 기본 메서드(main) 작성하라고함  
					--> 자바크로그램이 실행되면 제일 먼저 메인 메서드를 찾아서 실행. 
					--> 길제 작성된 소스에서 그 프로그램의 시작이 어딘지 알 수 없으면 안되므로 시작점을 알려주는 							
                                        용도 --> entry point --> main()
(2)파라미터 --> 메서드(함수) 호출시 하나 or 둘 이상의 파라미터 값을 넣어서 호출할 수 있음 . 
			--> String --> 문자열 --> [] 배열 --> args 
			--> args는 하나의 변수명일경우 임의의 이름을 지정해도 무방
*/

```

</details>

-----------------------------------------------------------------------------------------------------

### ch1 : static 키워드 역활
자바 메인 메서드에서 static 키워드의 역할에 대해서 설명해보시오. (★ ★ ★) <br>
작성한 자바 코드를 실행시 static을 안쓰면 에러가 나는데 그 이유가 무엇인지도 같이 설명해보시오.  <br>
 이 문제는 static의 개념과 역할에 대해서 알고 있는지를 묻는 문제이다. <br>
 
```java
public class Java100ClassOne {
	
    public static void main(String[] args) 
    { 
        System.out.println( "Hello World~" );
    }
}
```


### 해설

<details markdown="1">

```text
(1) static으로 선언된 함수(메서드)나 변수는 자바 버츄얼 머신에서 인스턴스 객체 생성없이 호출 할수있다. 
		쉽게말해서 , 객체 생성없이 해당 함수(메서드)를 호출해서 사용할 수 있다.  
 자바프로그램을 실행하면 static으로 지정된 메서드를 찾아서 먼저 메모리에 할당시킨다. 
 static으로 지정된 메서드가 여러개인 경우에는 객체를 생성하는 것과 상관없이 모두 메모리에 할당시킨다.
 그런후에, "main"으로 이름이 만들어진 메서드가 있는지를 찾아서 그 메서드를 가장 먼저 시작점의 메소드로 호출시킨다
```


</details>

-----------------------------------------------------------------------------------------------------
### ch1 : 변수란? 
변수와 변수 선언이란 무엇이고, 변수의 용도와 왜 필요한지 설명해보시오. 
 1. 변수란 무엇인가?
2. 변수 선언이란 무엇인가?
3. 변수의 용도는 무엇이고 왜 필요한가?

왜필요한가? 


### 해설

#### 변수 사용 x
<details markdown="1">

```java
public class Java100ClassOne {
	public static void main(String[] args) {
		//5
		//9
		System.out.print(2+4);
	}
}
/*
사용자가 입력한값을 변수를만들어서 저장을해놓고 어떻연산을하려해도, 변수가없다면 사용자가입력할 값들을 보관하고 저장할방법이없기때문에 
변수라는 저장바구니가있다면 보관이 용이하다. 또한 프로그래밍을 유연하고 편안하게 도와준다. 
*/
```

</details>


#### 변수 사용 o
<details markdown="1">

```java
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

</details>

-----------------------------------------------------------------------------------------------------

### ch1 : 자바의 자료형, 각 타입사이즈

자바의 데이터 타입에대해서 각 타입의 사이즈와 함께 설명해보시오.<br>
정수형의 경우 사이즈와 범위도 말해보시오.<br>
이문제는 자바의 자료형 종류와 각 타입의 사이즈에 대해서 아는지를 묻는 문제이다<br>

### 해설

<details markdown="1">

```text
[1] : 크게 봤을때 --> 기본형타입,참조형 타입
[2] : 기본형 타입(privitive data type) ---> 8개
        정수형 --> byte(1byte) , short(2), int(4), long(8)
        실수형 --> float(4) , double(8)
        문자형 --> char(2byte) --> 문자한개 --> 참고로 문자열을 다루는 타입은 없다.
        논리형 --> boolean(1byte) --> true, false 

 [3] : 참조형타입 (Reference Data Type) --> 위 기본형에 속하지 않는 데이터형들
 대표적인 것들 --> 클래스, 배열, 인터페이스, 문자열 
 참조형 변수의 특징 --> 데이터가 저장된 메모리의 주소값을 저장하는 변수이다. 

```

</details>

-----------------------------------------------------------------------------------------------------

### ch1 : 자료형 최대값 최소값 구하기

자바의 Primitive Data Type의 바이트 크기와 비트 크기를 출력하는 코드를 구현하시오.<br>
정수형 타입과 문자형 타입에 대해서만 구현한다.<br>
이때, 각 타입의 최댓값과 최솟값도 같이 구하여 출력하시오.<br>
아래 결과에서 문자형의 최댓값, 최솟값이 제대로 출력이 안되었는데 그 이유를 설명하고 수정해보시오.<br>



[ 결과 출력 ] <br>-----------------------------------------------------------------<br>
byte : 1(바이트) --> 8(비트)   l char : 2(바이트) --> 16(비트) -128 ~127<br>
short : 2(바이트) --> 16(비트)		-32768 ~32767<br>
int : 4(바이트) --> 32(비트)			-2147483648 ~2147483647 <br>
long : 8(바이트) --> 64(비트)		-9223372036854775808 ~9223372036854775807 <br>
 char : 2(바이트) --> 16(비트)		◦~?<br>
char : 2(바이트) --> 16(비트) 		0 ~65535<br>



### 해설

<details markdown="1">

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

</details>

-----------------------------------------------------------------------------------------------------

### ch1 : 변수 선언, 주의점

정수, 실수, 문자형 타입의 변수 사용에서 틀린 곳을 찾아서 모두 수정하시오.<br>
혹, 에러가 안나더라도 올바르게 수정해주시오.<br>
이 문제는 변수 선언과 사용시 주의할 점에 대해서 알고 있는지를 묻는 문제이다.<br>

<details markdown="1">


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
</details>

### 해설

<details markdown="1">

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

</details>

-----------------------------------------------------------------------------------------------------

### ch1 : 기본형타입 초기화 방법

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


### 해설
<details markdown="1">

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

</details>

-----------------------------------------------------------------------------------------------------


### 문제10

정수형 변수를 문자형으로 형(Type) 변환시켜서 출력하면 어떤 결과가 나오는지 말해보시오.<br>
아래 코드의 결과를 예상하여 말해보시오.<br>
이 문제는 정수형과 문자형의 타입 변환시 일어나는 변화에 대해서 알고 있는지를 묻는 문제이다.<br>

<details markdown="1">

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

</details>


### 해설5

<details markdown="1">

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

</details>




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



### 해설 12
<details markdown="1">

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

</details>

### 문제 13
반환값이 없고 받는 인자값이 2개 있는 덧셈 메서드를 구현하시오.<br>
이 문제는 자바의 메서드 작성법과 반환값, 인자값에 대한 이해가 있는지를 묻는 문제이다.<br>



### 해설 13
<details markdown="1">

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

</details>


### 문제14 
반환값이 있고 받는 인자값이 없는 메서드를 구현해보시오.<br>
이 문제는 자바의 메서드 작성법과 반환값, 인자값에 대한 이해가 있는지를 묻는 문제이다.<br>


### 해설 14
<details markdown="1">

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

</details>


### 문제15
반환값이 있고 받는 인자값이 있는 대문자 출력 메서드를 구현해보시오.<br>
메서드는 ( "korea" ) 입력시 대문자로 출력되도록 구현한다.<br>
이 문제는 자바의 메서드 작성법과 반환값, 인자값에 대한 이해가 있는지를 묻는 문제이다.<br>



### 해설 15
<details markdown="1">

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

</details>

### 문제16
static 선언이 안되어있는 메서드를 사용하는 방법에 대해서 코드로 구현해보시오.<br>
이 문제는 메인 메서드에서 static 선언이 없는 메서드를 사용하는 방법에 대해서 아는지를 묻는 문제이다. <br>
 클래스와 객체에 대한 선행 학습이 필요하므로 이에 대한 학습 후 본 문제를 다시 풀어보는 것이 좋다.<br>
 
 
### 해설 16
<details markdown="1">

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
</details>
 

### 문제17
메서드로 인자 전달시 정수 100을 보냈을 때의 아래 코드의 결과를 말해보시오.<br>
이 문제는 자바의 기본형 타입과 참조형 타입의 다양한 메서드 호출 방식에 대해서 아는지를 묻는 문제이다.<br>


### 해설 17
<details markdown="1">

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

</details>

### 문제18
메인 메서드에서 100을 보냈을 때 값이 수정되게끔 Call by reference 방식으로 코드를 수정하시오.<br>
이 문제는 앞서 다뤘던 문제의 Call by value 방식을 Call by reference 방식으로 수정해서 보내라는 의미다. <br>
a 값이 같은 결과가 나오도록 코드를 수정해보시오.<br>


### 해설18

<details markdown="1">

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

</details>

### 문제19

메인 메서드에서 정수 100을 Call by reference 방식으로 메서드 호출하는 코드를 구현하시오.<br>
이 문제는 앞서 다뤘던 문제의 Call by value 방식을 Call by reference 방식으로 수정해서 보내라는 의미다.<br>
a 값이 같은 결과가 나오도록 코드를 수정해보시오.<br>
단, 클래스와 Wrapper, 객체 생성에 대한 개념이 필요하므로 관련 공부를 하고 보는 것이 이해하는데 도움이 된다.<br>


### 해설19

<details markdown="1">

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

</details>

### 문제20

2개의 정수형 값을 리턴하는 메서드를 구현하시오.<br>
이 문제는 두개의 리턴 값을 반환하는 메서드 작성법을 아는지에 대해서 묻는 문제이다. <br>


<details markdown="1">

### 해설21
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

</details>

### 문제21
반환값이 2개 있는 메서드를 구현해보시오.<br>
메서드는 ( "korea", "USA" ) 입력시 소문자는 대문자로 대문자는 소문자로 출력되도록 구현한다.<br>
이 문제는 자바의 메서드 작성시 리턴되는 반환값이 2개일 때 처리하는 방법을 아는지에 대해서 묻는 문제이다.<br>



### 해설21

<details markdown="1">

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

</details>

### 문제22
클래스란 무엇이고 어떤 역할을 하는지에 대해서 설명해보시오.<br>
이 문제는 클래스의 개념과 역할, 용도 등에 대해서 알고 있는지를 묻는 문제이다.<br>


### 해설22

<details markdown="1">

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

</details>

### 문제23 (21.1.14)
FarmMachine의 속성과 동작들을 가지는 클래스를 코드로 구현하고 <br>
객체를 생성하여 동작시켜보시오. <br>
 이 문제는 어떤 사물에 대한 클래스를 실제 코드로 구현할 수 있는지를 묻는 문제이다.<br>
아래와 같이 결과가 나오도록 작성하시오.<br>

```
1000000
2020
red
Farm-machine is moving.
Fram-machine is digging.
Fram-machine is grinding.
```

### 해설23 

<details markdown="1">

```
class FarmMachine {
	//[1] 속성(특징)
	int price; 	//가격
	int year;	//연식
	String color;	//색상
	
	
	//[2] 동작/기능/행동(method) --> 농기계마다 동작이 다양할 것이므로공통적인 동작을 생각해본다.
	void move() {
		System.out.println("Farm-machine is moving");
	}
	
	void dig() {
		System.out.println("Farm-machine is digging");
	}
	
	void gring() {
		System.out.println("Fram-machine is grinding");
	}
}

public class Java100ClassThree {
	public static void main(String[] args) {

		//[1]:객체 생성
		FarmMachine fn = new FarmMachine();
		System.out.println(fn);
		
		//생성된 객체에 속성값 입력하기 
		fn.price = 1000000;
		fn.year = 2020;
		fn.color = "red";
		
		// [3] : 속성값 출력하기
		System.out.println(fn.price);
		System.out.println(fn.year);
		System.out.println(fn.color);
		
		// [4] : 동작 수행하기
		fn.move();
		fn.dig();
	}
}
```
</details>

### 문제24 (21.01.15)
문자열을 숫자로 바꿔서 연산해보시오.<br>
이때, 인자값으로 진수를 지정해서 출력해보시오.<br>
이 문제는 자바 프로그래밍시 문자열을 숫자로 변환시키는 것에 대해서 아는지를 묻는 문제이다.<br>

```
[ 결과 출력 ]
-------------------------------------------------------------------------------------------------------------------------------------------
1+2=3
1 + 2 = 12 -------------------------[진수 지정] 2022
2022
1
9
516
10
15
255
-------------------------[진수 지정]
```



### 해설

<details markdown="1">

```
[!] : 왜 변환이 필요한가?
1+2 숫자끼리의 연산은 3이지만, 문자열끼리 연산은 12가 되기 때문에 숫자로 변환 후 연산을 수행해야한다.
문자열을 숫자로 변환시키는 방법 --> Integer.parseInt() 사용
parseInt() --> Integer 클래스의 static으로 지정 --> 따라서, 객체의 생성없이 바로 "클래스명.parseInt()로 직접사용이가능"
두번째 인자 값으로 진수를 지정 --> 해당 진수에 맞는 값이 됨 --> Integer.parseInt("1000",2);

public class Java100ClassThree {
	public static void main(String[] args) {
		//[1]: 숫자끼리의 연산
		int a = 1;
		int b = 2;
		int c = a+b;
		System.out.println("a+b=" +c);	//3
		
		//[2]: 문자열끼리의 연산
		String a1 = "1";
		String b1 = "2";
		String c1 = a1 + b1;
		System.out.println("a1 + b1=" +c1 );	//12
		System.out.println(c1.getClass().getName());
		
		//[3]: 문자열 --> 숫자로 변환후 연산
		int a2 = Integer.parseInt(a1);
		int b2 = Integer.parseInt(b1);
		System.out.println(a2 + b2);
		
		//[4]: 진수 지정
		System.out.println("--------------------------[진수 지정 ]");
		System.out.println(Integer.parseInt("2022"));	//2022
		System.out.println(Integer.parseInt("2022", 10));	//2022
		System.out.println(Integer.parseInt("1", 2));	//1
		System.out.println(Integer.parseInt("1001", 2));	//9
		System.out.println(Integer.parseInt("1004", 8));	/516
		System.out.println(Integer.parseInt("A",16));	//10
		System.out.println(Integer.parseInt("B", 16));	//13
		System.out.println(Integer.parseInt("FF", 16));	//255
		
	}
}

```

</details>

### ch3 : 클래스 작성시 주의사항

다음은 클래스 작성시 주의할 사항인데 이중 틀린 것을 말해보시오.<br>
이 문제는 여러 클래스 작성시 주의할 점에 대해서 알고 있는지를 묻는 문제이다.<br>

[문제] 클래스 작성시 주의사항으로 틀린것은?<br>
(1) 하나의 파일에 2개이상의 클래스를 작성할 수 있다.<br>
(2) 3개의 클래스가 있다면 자바 파일명이 될수있는것은 public 키워드가 붙은 클래스이다.<br>
(3) 하나의 파일에 있는 3개의 클래스에 모두 public 키워드를 붙일 수 있다.<br>
(4) 한 파일내 3개 이상의 클래스에 모두 public 키워드를 안붙일 수 있다.<br>
(5) 한 파일내 3개 이상의 클래스에 모두 public 키워드가 없다면 클래스중 어느 것이라도 파일명이 될 수있다.<br>
(6) 자바 파일에 클래스가 한개 있다면 클래스명이 곧 파일명이 되어야한다. <br>

### 해설

<details markdown="1">

```
class A{}
class B{}

public class Java100ClassThree {
	public static void main(String[] args) {
	}
}

(1) O , 그렇다 2개이상의 클래스를 작성할수있다
(2) public이 붙은 클래스가파일명이 될수있다.
(3)하나의 파일에있는 클래스에는 한개만 public 을 붙일수있다.
(4)가능하다
(5) o
(6) o
```

</details>

### ch3 : 생성자란?

클래스에서 생성자란 무엇이고 어떤 특징을 갖고 있는지 말해보시오.<br>
이 문제는 클래서에서 생성자의 개념과 역할, 특징 등에 대해서 알고 있는지를 묻는 문제이다. 

### 해설

<details markdown="1">

```
[1] : 생성자
생성자는 new키워드로 클래스의 객체(또는 인스턴가)생성될때 제일 먼저 자동적으로 호출되는 특별한 메서드이다.
따라서, 객체의 초깃값을 설정하는 등의 용도로 많이 사용된다.
생성자명은 클래스명과 동일하게 만든다.
생성자는 리턴되는 반환값이 없다. --> 객체가 생성될때 제일 먼저 호출만 된다.
생성자는 오버로딩이 가능하다.
생성자는 default생성자란게 있다. --> 클래스내에 생성자가 없다면 default 생성자가 자동호출 --> 클래스명과 동일하고, 받는인자값 x

[2]:생성자 위치
보통 속성과 메서드 사이에 기술한다.
생성자도 메서드이므로 메서드 그에 속하는데 제일 상단에 보통 위치한다.

class Person{
	//[1]: 속성(attribute)
	int age;
	String name;
	
	
	//[2]: 생성자(Constructor)
	Person() {}
	
	//[3]: 메서드(Method)
	void move() {
		System.out.println("Person is moving");
	}
}
```

</details>


### ch3 : 생성자 초기화와 구현
객체 생성시 초깃값을 생성자 메서드에서 설정하는 클래스를 구현해보시오. <br>
이 문제는 클래스의 인스턴스 생성시 생성자를 통해서 초기화하는 것을 알고 있는지 묻는 문제이다. <br>

[ 결과 출력 ]<br>
<br>나이 : 20, 이름 : 홍길동
<br>나이 : 30, 이름 : 이순신<br>
나이 : 40, 이름 : 을지문덕<br>

### 해설

<details markdown="1">

```
class Person{
    //[1] 속성 (Attribute)
    int age;
    String name;

    //[2] 생성자(Constructor)
    Person() {}
    Person(int age, String name) {
        this.age = age; //객체가만들어질때 객체자신을가리킨다. this
        this.name = name;
    }

    //[3]메서드(Method)
    void printPerson() {
        System.out.println("나이:" +age+ ", 이름"+ +name)
    }

    public class Java100ClassThree {
        public static void main(String[] args) {
            Person p1 = new Person((20, "홍길동");
            System.out.println(p1);
            p1.printPerson();

            Person p3 = new Person(30, "이순신");
            p3.printPerson();
        }
    }
}
```

</details>

### ch3 : 상속이란?

클래스에서 상속이란 무엇인지 상속의 정의와 특징을 말해보시오. <br>
이 문제는 자바 OOP 문법에서 상속에 대한 개념과 특징들에 대해서 알고 있는지를 묻는 문제이다.<br>

### 해설

<details markdown="1">

```
상속 이란?
말그대로 부모클래스가 가지고있는 변수들과 메소드등을 물려받아 새로운 클래스를 만드는 것.
상속을 활용하면 물려받은 것들은 그대로쓰면되고, 거기에 덧붙여 새로운것만 만들면된다.
이때, 물려받게 되는 원본클래스를 부모클래스 또는 슈퍼클래스라고부른다.
상속받아 새롭게 만들어진 클래스는 자식클래스 또는 서브클래스, 하위클래스라고부른다.

[2] 상속의 장점
가장 큰 장점 --> 재활용성
완전히 새로운 것을 만드는것이아니라 기존 부모로부터 상속을 받아 필요한것만추가로만드는것
부모클래스에 정의되어있는 멤버필드나 메서드들을 그대로 상속받아 사용하면 된다.
상속받은 메서드라 해도 필요에 따라서 자식클래스에서 용도를 변경해서사용도 가능

[3] 상속의 사용
기존 부모클래스를 확장한다는 개념 ----> extends 키워드사용
부모클래스의 멤버필드, 메서드는 상속이 가능하나 생성자는 상속이 안된다.
부모 클래스의 접근 제한자 private인 경우에는 아무리 자식 클래스가 상속받았다해도 접근불가능
```

</details>


### ch3 : 상속 구현

클래스의 상속을 코드로 구현해보시오. <br>
이 문제는 자바 OOP 문법에서 상속에 대한 개념과 그것을 코드로 구현할 수 있는지를 묻는 문제이다 <br>

### 해설 

<details markdown="1">

```
   class Person{
        //Field
        int gender;
        int power;

        //constuctor
        Person(){
            this.gender = 1;
            this.power = 100;
        }

        //Method
        void walk() {
            System.out.println("걸어가고 있어요");
        }
    }

    class Hero extends Person{
        String name;
        int age;

        //constructor
        Hero(){}
        Hero(String name, int age)
        {
            super();
            this.name = name;
            this.age = age;
        }

        //method
        void walk(){
            System.out.println("2배로 빨리 걸어가고있어요");
        }

        void eat(){
            System.out.println("밥먹고 있어요");
        }

        void displayPerson(){
            System.out.println("이름 :" +name+ ",나이" +age+ ",성멸:" +gender+ ",파워" +power);
        }
    }

    public class Java100ClassThree {
        public static void main(String[] args) {
            Person p1= new Person();
            p1.walk();
            //p1.eat(); //err

            //[2] 상속을 통한 슈퍼맨 객체생성
            Hero h1 = new Hero("슈퍼맨, 20");  //먼저 부모 필드부분이 초기화가되고 -> 자식에서 초기화된다.
            System.out.println(h1.name);
            System.out.println(h1.age);
            System.out.println(h1.gender);  //부모클래스 필드(변수)
            System.out.println(h1.power); // 부모클래스 필드(변수)

        }
    }
```

</details>

### ch3 : 상속과 오버라이딩 구현

 클래스 상속에서 메서드 오버라이딩에 대해서 설명하고 구현해보시오.<br>
 이 문제는 상속에서 부모 클래스의 메서드를 자식이 오버라이딩해서 구현할 수 있는지를 묻는 문제이다.<br>

[ 결과 출력 ] <br>
부모 클래스→걸어가고 있어요~<br>
이름 : 슈퍼맨, 나이 : 20, 성별 : 1, 파워 : 100<br>
이름 : 원더우먼, 나이 : 30, 성별 : 1, 파워 : 100<br>
이름 : 원더우먼, 나이 : 30, 성별 : 2, 파워 : 300<br>
자식 클래스→2배로 빨리 걸어가고 있어요~<br>

### 해설

<details markdown="1">

```java
class Person{
    //Field
    int gender;
    int power;

    //constuctor
    Person(){
        this.gender = 1;
        this.power = 100;
    }

    //Method
    void walk() {
        System.out.println("걸어가고 있어요");
    }
}

class Hero extends Person{
    String name;
    int age;

    //constructor
    Hero(){}
    Hero(String name, int age)
    {
        super();
        this.name = name;
        this.age = age;
    }

    //method 오버라이딩
    void walk(){
        System.out.println("2배로 빨리 걸어가고있어요");
    }

    void eat(){
        System.out.println("밥먹고 있어요");
    }

    void displayPerson(){
        System.out.println("이름 :" +name+ ",나이" +age+ ",성멸:" +gender+ ",파워" +power);
    }
}

public class Java100ClassThree {
    public static void main(String[] args) {
        Person p1= new Person();
        p1.walk();
        //p1.eat(); //err

        //[2] 상속을 통한 슈퍼맨 객체생성
        Hero h1 = new Hero("슈퍼맨", 20);  //먼저 부모 필드부분이 초기화가되고 -> 자식에서 초기화된다.
        System.out.println(h1.name);
        System.out.println(h1.age);
        System.out.println(h1.gender);  //부모클래스 필드(변수)
        System.out.println(h1.power); // 부모클래스 필드(변수)
        h1.walk();
        h1.displayPerson();

        //[2] 원더우먼 객체 생성
        Hero h2 = new Hero("원더우먼", 30);
        h2.displayPerson();
        h2.gender = 2;
        h2.power = 300;
        h2.displayPerson();
        h2.walk();
    }
}
```
</details>


### ch3 : 상속구현시 getter setter

getter, setter가 포함된 클래스의 상속을 코드로 구현해보시오.<br>
이 문제는 클래스의 상속을 구현시 getter, setter의 개념과 용도를 알고 있는지를 묻는 문제이다.<br>
부모 클래스 --> Person, 자식 클래스 --> Villain, Hero<br>

---------------------------- 악당 이름 : 좀비<br>
악당 나이 : 20 살<br>
악당의 키 : 180 Cm<br>
악당 체중 : 80 Kg<br>
악당 넘버 : 15001231 악당 무기 : 창<br>
악당 파워 : 99.5 ---------------------------- 좀비 이동중..<br>
---------------------------- 악당 이름 : 도깨비<br>
악당 나이 : 30 살<br>
악당의 키 : 175 Cm<br>
악당 체중 : 70 Kg<br>
악당 넘버 : 11001121 악당 무기 : 방패<br>
악당 파워 : 140.5 ---------------------------- 도깨비 이동중..<br>
---------------------------- 악당 이름 : 몽달귀신<br>
악당 나이 : 40 살<br>
악당의 키 : 150 Cm<br>
악당 체중 : 40 Kg<br>
악당 넘버 : 14001011 악당 무기 : ---<br>
악당 파워 : 11.5 ---------------------------- 몽달귀신 이동중..<br>

### 해설 

<details markdown="1">

```java
class Person{
    //Field
    int gender;
    private String name;
    private int age;
    private int height;
    private int weight;

    //Constructor
    Person(){}
    Person(String name, int age, int height, int weight){
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }


    //Method
    public String getName()
    {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getAge(){return age;}
    public void setAge(int age){this.age = age;}

    public void setHeight(int height){this.height = height;}
    public int getHeight(){return height;}

    public void setWeight(int weight){this.weight = weight;}
    public int getWeight(){return weight;}

    public void move(){
        System.out.println("이동중...");
    }
}

class Villain extends Person{
    //Field
    private String unique_key;
    private int weapon; //1~9 숫자로 무기 분류 -> 1.창 2.방패 3.총
    private double power;

    //Constructor
    Villain(){}
    Villain(String name, int age, int height, int weight, String unique_key, int weapon, double power){
        super(name, age, height, weight);
        this.unique_key = unique_key;
        this.weapon = weapon;
        this.power = power;
    }

    //Method
    public void setUnique_key(String unique_key) {this.unique_key = unique_key;}
    public String getUnique_key(){return unique_key;}

    public void setWeapon(int weapon){this.weapon = weapon;}
    public int getWeapon(){return weapon;}

    public  void setPower(double power){this.power = power;}
    public double getPower(){return power;}

    //pringPerson()
    public void printPerson(){
        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
        System.out.println("악당 이름: " + getName());
        System.out.println("악당 나이: " + getAge());
        System.out.println("악당 키: " + getHeight());
        System.out.println("악당 체중: " + getWeight());
        System.out.println("악당 넘버: " + getUnique_key());
        System.out.println("악당 무기: " + getWeaponName(getWeapon()));    //숫자(1~9) --->1:창 2:방패 3:총
        System.out.println("악당 파워: " + getPower());
    }

    //getWeaponName()
    public String getWeaponName(int a){
        String weapon;
        switch (a){
            case 1:
                weapon = "창";
                break;
            case 2:
                weapon = "방패";
                break;
            case 3:
                weapon = "총";
                break;
            default:
                weapon = "----";
                break;
        }
        return weapon;
    }
}

class Hero extends Person{}

public class Java100ClassThree {
    public static void main(String[] args) {

        //[1] 객체생성
        Villain v1 = new Villain("좀비", 20, 180, 60, "15001231", 2, 99.5);
        v1.printPerson();
        System.out.print(v1.getName() + "");
        v1.move();

        //[2] 객체생성
        Villain v2 = new Villain("도깨1ㅣ", 30, 175, 70, "11001121", 1, 77.5);
        v2.printPerson();
        System.out.print(v2.getName() + "");
        v2.move();

        //[2] 객체생성
        Villain v3 = new Villain("몽달귀신", 40, 150, 40, "10001010", 3, 27.5);
        v3.printPerson();
        System.out.print(v3.getName() + "");
        v3.move();
    }
}
```

</details>

### ch4 : 객체배열 구현법

객체에 대한 참조값을 요소로 가지는 객체 배열을 생성하는 코드를 구현하시오.<br>
이 문제는 기본형 타입이 아닌 참조형 타입의 객체가 원소인 객체 배열을 구현할 수 있는지를 묻는 문제이다. <br>
아래와 같이 출력하는데 다양한 방식으로 출력해보시오. → 3가지 정도로..<br>
반복문을 사용해서 객체를 생성해보시오.<br>

[ 결과 출력 ] <br>
홍길동		나이 : 20 		
장길동		나이 : 21 <br>	
김길동		나이 : 22 <br>	
영길동		나이 : 23 		
오길동		나이 : 24 <br>

<details markdown="1">

```java
class Person{
    //Field
    private String name;
    private int age;

    //Constructor
    Person(){}
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    //Method
    public void setName(String name){this.name = name;}
    public String getName(){return name;}

    public void setAge(int age){this.age = age;}
    public int getAge(){return age;}
}

public class Java100ClassThree {
    public static void main(String[] args) {
        //[1]:객체 생성
        int[] ar1 = {1,2,3,4,5};
        char[] ar2 = {'A','B','C','D','E'};
        Person[] pa = new Person[5];
        pa[0] = new Person("홍길동", 20);
        pa[1] = new Person("장길동", 21);
        pa[2] = new Person("김길동", 22);
        pa[3] = new Person("영길동", 23);
        pa[4] = new Person("오길동", 24);

        //[2]:출력
        for(int i=0; i<pa.length; i++){
            System.out.println(pa[i].getName()+ "\t\t" +"나이 : "+ pa[i].getAge() + "\t\t");
        }
        System.out.println();
    }
}
```

</details>


### ch3 : 객체배열 반복문사용

반복문(for)을 사용하여 객체 배열을 생성하고 출력해보시오.<br>
이 문제는 객체의 주소를 저장하고 있는 객체 배열을 반복문을 사용하여 만들 수 있는지를 묻는 문제이다.<br>


28살	yeji<br>
54살	hello<br>
20살	jiyong<br>
30살	tamie<br>
40살	leooo<br>



### 해설 


<details markdown="1">

```java
class Person{
    //Field
    private String name;
    private int age;

    //Constructor
    Person(){}
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    //Method
    public void setName(String name){this.name = name;}
    public String getName(){return name;}

    public void setAge(int age){this.age = age;}
    public int getAge(){return age;}
}

public class Java100ClassThree {
    public static void main(String[] args) {

        //[1]:객체생성
        Person[] pa;    //Person타입의 객체 배열 변수 pa 선언
        pa = new Person[] {
                new Person("yeji", 28),
                new Person("hello", 54),
                new Person("jiyong", 20),
                new Person("tamie", 30),
                new Person("leooo", 40),
        };

        //[2]:반복문(foreach)돌면서 Person()객체 생성
        for(Person temp:pa)
        {
            System.out.println(temp.getAge() +"살\t"+ temp.getName());
        }
    }
}
```

</details>

### ch4 : 추상클래스 개념과 사용법

추상 클래스와 추상 메서드란 무엇인지 설명하고 관련된 예제 코드를 구현해보시오.<br>
이 문제는 자바의 추상 클래스, 추상 메서드의 개념과 역할에 대해서 알고 있는지를 묻는 문제이다.<br>


아래의 질문에 답해보시오? ---------------------------------------------------------<br>
1) 추상 클래스란 무엇인가?<br>
2) 추상 클래스와 일반 클래스의 차이점은 무엇인가?<br>
3) 추상 클래스는 객체 생성이 가능한가?<br>
4) 추상 클래스는 어떻게 사용하는가?<br>
5) 추상 클래스의 역할은 무엇이고 왜 필요한 것인가?<br>
6) 추상 클래스는 상속이 가능한가?<br>
7) 추상 클래스의 추상 메서드는 꼭 오버라이딩하여 사용해야만 하는가?<br>
8) 추상 메서드를 포함하고 있다면 추상 클래스여야 하는가?<br>
9) 추상 클래스를 만들려면 abstract를 꼭 써야 하는가?<br>

### 해설
<details markdown="1">

```java
public class Java100ClassFour {
    @DisplayName("추상클래스")
    @Test
    void abstractClass() {

        abstract class Animal {
            //구체적인 내용은 작성하지않고 공통적인 특징을 추상적으로 선언--> 리턴값 조차도 없이 메서드만 선언.
            abstract void cry();

            void eat() {
                System.out.println("먹다.");
            }
        }

        class Dog extends Animal {
            void cry() {
                System.out.println("멍멍~");
            }
        }
        abstract class Cat extends Animal {
            //void cry(){System.out.println("야옹야옹");}
        }

        class Animal2 {
            void fly() {
                System.out.println("날다");
            }
        }

        //[1]: 추상클래스는 구체적인 내용이 없기때문에 객체를 생성할 수 없다.
        //Animal dob = new Animal();        //err
        Animal2 dragonfly = new Animal2();
        dragonfly.fly();

        //[2] : 추상클래스의 사용은? --> 상속을 받아서 사용.
        //즉 추상클래스를 상속받은 자식 클래스에서 해당 메서드를 오버라이딩하여 재정의한후 사용한다.
        Dog dog = new Dog();
        dog.cry();  //멍멍

        //Cat cat = new Cat();
        //cat.cry();  //야옹야옹

        //[3]: Summary
        //추상(부모)클래스는 다른 클래스들의 공통적인 특징을 변수나 메서드로 정의만 해놓은 것을 말한다. --> 추상메서드
        //abstract를 앞에 붙이고 클래스안에 추상메서드를 포함하고있다는 것을 제외하면 일반클래스와 별반차이가없다.
        //Field, Constructor, Method(추상메서드말고 일반 메서드)도 포함할 수 있다.
        //메서드 선언만 있고 구체적인 내용은 없으므로 객체를 생성할 수 없다.
        //따라서 부모클래스로서의 역활은 하지만, 구체적인 사용은 상속받은 자식클래스에서 재정의(오버라이딩)하여 사용해야 한다. -->강제

        //왜쓰지?
        //우선 강제하기 위함이다.
        //부모(추상)클래스가 선언해놓은 메서드를 상속받은 자식 클래스들이 이름 그대로 재정의해서 구현하라고 강제하는 것이다
        //즉, 일반메서드로 구현하면 누군가는 해당 메서드를 구현안 할 수도있다.
        //무조건 상속받은 자식클래스입장에서는 추상 메서드를 재정의해서 구현하도록 강제하기 위함이다.

        //꼭 재정의(override)해야만 하는가?
        //일단 그렇다
        //자식 클래스는 일단은 무조건 부모(추상)클래스로부터 상속받은 추상 메서드는 오버라이딩 해서 재정의해야한다.
        //추상 메서드를 포함하고 있다면 곧 추상 클래스여야 한다.

        //만약 재정의하고싶지 않다면?
        //자식 클래스에서 상속받은 추상 메서드를 구현하지 않는다면 자식 클래스도 abstract를 붙여서 추상으로 만들어준다.
        //class 앞에다가 abstract를 붙인다

        //결론
        //부모클래스에서 구현하지않는이유는 해당 메서드의 구현이 상속받는 클래스에따라서 달라질수있기 때문에 선언만 해둔것이다.
        //분업화된 시스템에서 공통의 프로젝트를 진행할때 많이 사용되어지는 중요한 문법이다.

    }
}
```

</details>

### ch4 : 인터페이스개념, 구현
자바의 인터페이스 문법을 예제 코드로 구현해보시오. <br>
이 문제는 자바 문법중 인터페이스에 대한 개념과 어떻게 사용하는지에 대해서 아는지를 묻는 문제이다. <br>
코드를 작성하기 전에 아래 4개의 관련 질문에 답해보시오 <br>

[1] 인터페이스<br>
[2] 상속<br>
[3] 장점<br>
[4] 우선순위<br>

### 해설

<details markdown="1">

```java
//[i]: 인터페이스란 무엇인가?
    //상호간 통신을 위해서는 규격이중요하다 --> 일본이 110v 가전제품을 한국으로 가지고와도 규격이 맞지 않으므로 사용할 수 없다.
    //즉 인터페이스는 하나의 표준화를 제공하는 것이라 할수있다.

    //추상클래스 vs 인터페이스?
    //추상클래스와 거의 비슷하다 --> 그러나 그 추상화정도가 더 좊다. --> 따라서 일반메서드 멤버필드(변수)를 가질수 없다.
    //이러한점들이 추상클래스와 인터페이스간 가장 큰 차이점중 하나이다. --

    //자바에서의 인터페이스 문법?
    //표준화 및 규격을 인터페이스로 제공.
    //따라서 어떤 클래스가 해당 인터페이스를 사용(상속)한다면 인터페이스에 선언되어져 있는 메서드를 구현해야한다.
    //인터페이스는 class키워드를 사용하지 않고 --> 별도의 interface 키워드를 사용한다
    //class --> extends     interface-->extends(x) , implements(o)
    //추상 클래스와 같이 메서드의 구체적인 내용은 기술되어져있지 않으므로 인터페이스를 상속받은 클래스에서 재정의(오버라이딩)하여 사용해야 한다.

    //상속 vs 구현
    //클래스와 인터페이스 이 둘의 가장 큰 차이점중 하나는 "상속"이다. --> a,b
    //자바에서 클래스는 "단일 상속"만 가능하지만, 인터페이스는 "다중 상속"이 가능하다.
    //그러나 인터페이스에서는 extends 표현을 쓰지않고 "구현"의 의미를 강조하는 implements 키워드를 사용하여 다중 상속을 구현한다.


    //[1] : 인터페이스
    //인터페이스는 interface키워드를 사용.
    
    //[2]: 상속
    //클래스는 "단일상속"만 가능, 인터페이스는 "다중상속"이 가능 --> 가장 큰 차이점.
    //class --> extends,    interface-->implements-->다중상속을 구현-->A,B-->콤마(,)로 분리
    //즉 이를 이용하면 여러개의 인터페이스로부터 메서드를 받아올 수 있게된다. --> 다중상속 구현
    
    //[3]: 장점
    //인터페이스를 이용하면 메서드의 추상적인 "선언"과 그 메서드들을 구체적인 "구현"부분을 분리시킬 수 있다. --> 매우큰 장점
    //하청을 주는 대기업(갑)은 하청업체(을)에 인터페이스만 제공 --> 각 하청업체(을)들이 이를 준수하여(=상속 받아) 개발
    //분업화된 시스템을 구축하여 "갑"과 "을"이 독립적으로 프로젝트 개발을 해나갈 수 있다. -->매우 큰 장점.
    
    //[4]: 우선순위(extends vs implements)
    //상속을 받는 extends키워드와 구현을 하는 implements 키워드가 동시에 쓰일때 --> extends키워드가 항상 먼저 쓰인다.
    //예시) class Student extends Person implementes A,B

class Person{
    //Field
    String name;
    int age;
    int weight;

    //Constructor
    Person(){}
    Person(String name, int age, int weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    //Method
    void wash() {System.out.println("씻다");}
    void study() {System.out.println("놀다");}
}

interface  Allowance {
    //Field
    //변수는 안되나 상수는 되므로 상수로 지정해주면 됨 --> public static final을 붙여주면됨
    //인터페이스내 모든 멤버 필드(변수)는 public static final 이여야한다. --> 생략이가능. -> 그냥 "타입상수면" 지정해서 쓰면됨
    public static final String aaa = "코리아";
    public static final int bbb = 100;
    //Abstract Method
    //인터페이스내 모든 메서드는 public abstract 이어야함 -->  생략이가능.
    public abstract void in(int price, String name);
    void out(int price, String name);
    //void wash() {System.out.println("씻다");} 선언된메소드만사용가능하므로 일반메소드는 x
}

interface Train {
    abstract  void train(int training_pay, String name);
}

class Students extends Person implements Allowance, Train{  //상속을 받으면 반드시 재정의
    //Contructor
    Students(){}
    Students(String name, int age, int weight){
        super(name, age, weight);
    }

    //Method
    @Override
    public void in(int price, String name) {
        System.out.printf("%s에게 %d원 용돈을 받았습니다.%n", name, price);
    }

    @Override
    public void out(int price, String name) {
        System.out.printf("%d원 금액을 지출했습니다. 지출용도 --> %s %n", price, name);
    }

    @Override
    public void train(int training_pay, String name) {
        System.out.printf("[%s --> %d원 입금완료]", name, training_pay);
    }

}

public class Java100ClassFour {
    public static void main(String[] args){
        // [1]: 객체생성
        Students s1 = new Students("홍길동", 20, 85);

        //[2]: 클래스와 인터페이스로부터 상속(Person)과 구현(Allowance, Train)을 한 메서드들 호출하기
        s1.wash();
        s1.study();
        s1.in(10000, "엄마");
        s1.out(40000, "편의점");
        s1.train(50000,"아빠");

        //[3]: 상수 필드 사용하기
        System.out.println(s1.aaa);    //코리아
        System.out.println(Allowance.aaa);
        System.out.println(Allowance.bbb);
    }
}

```

</details>


### ch4 : 다형성 개념
다형성(polymorphism)에 대해서 개념 설명을 해보시오.<br>
이 문제는 자바의 다형성에 대한 개념을 알고 있고 그것을 쉽게 설명할 수 있는지를 묻는 문제이다. <br>



### 해설

<details markdown="1">

```java

/*[1]: 다형성이란?
다형성이란 다양한 형태 또는 특성
자바와 같은 객체 지향 언어에서의 의미는 부모 클래스를 상속받은 자식클래스의 인스턴스가 부모의 객체로도 사용되고,
뿐만아니라, 자식클래스의 객체로도 사용될 수 있는 다양한 상황을 의미한다.

[2]: 예시
부모클래스 People 이있고, 이를 상속받은 자식 클래스 yeji 있다고 가정하자.
이때 "예지가 말을 하네" 사람들이 이렇게 말할 수 있다
그런데 예지는 사람이기때문에 사람이 말을하네 라고 할수도있다.

[3]: 결론
정리하면, 하위클래스의 인스턴스(객체)는 보다 위인 상위클래스의 인스턴스(객체)로도 사용될 수 있다.
그런데, 그 반대는 안된다.
왜냐하면, "예지"는 분명 그 상위인 "사람"이라고 말할 수 있지만, 사람은 종류가 많기때문에 모든 사람이 예지는 아니기때문이다.
따라서, 상위(부모)클래스의 인스턴스(객체)는 하위(자식) 클래스의 인스턴스(객체)로 사용될수없다.*/

```

</details>


### ch4 : 다형성 객체 생성방법
다음중 객체 생성 방법이 틀린 것을 골라보시오. <br>
앞서 다형성(polymorphism)의 개념에 대해서 살펴봤는데 코드를 통해서 실습해보는 문제이다.<br>


### 해설
<details markdown="1">

```java

class Person {
    String str1 = "난 부모 클래스";
    void method1() { System.out.println("에이에이에이"); }
    void ppp() { System.out.println("ppp"); }
}
class Student extends Person{
    String str2 = "난 자식 클래스";
    void method1(){ System.out.println("오버라이딩 - AAA"); }
    void sss(){ System.out.println("sss"); }
    void x(){
        method1();
        super.method1();
    }
}


public class Java100ClassFour {
    public static void main(String[] args){

        //[1] : 객체 생성 --> 부모 + 자식 클래스의 모든 자원을 다 쓸 수 있다.
        System.out.println("=================================");
        Student s1 = new Student();         //지극히 정상 --> 에러날이유가 하나도없다.
        System.out.println(s1.str1);
        System.out.println(s1.str2);
        s1.method1();                       //오버라이딩 - AAA
        s1.sss();                           //sss
        s1.ppp();                           //ppp

        //[!]: 그런데 말이죠.. --> 자식 클래스에서 오버라이딩된 부모 클래스의 원본 메서드를 호출하고 싶다면? --> super 사용.
        System.out.println("---------------------[super사용]");
        s1.x();

        // 범위는 부모의 자원만을 쓸수있다.(?)
        //[2] : 객체 생성 --> 타입은 부모 타입으로 생성
        System.out.println("=================================");
        Person s2 = new Student();          //이것도 정상 --> 하위(자식)클래스로 객체를 만들면서 타입은 상위(부모) 타입을 쓰는 것이 가능 --> 다형성
        System.out.println(s2.str1);
        //System.out.println(s2.str2);      //err --> 자식의 자원은 쓸 수 없다.
        s2.ppp();                           //ppp
        //s2.sss();                         //err --> 자식의 자원은 쓸 수 없다.
        s2.method1();                       //오버라이딩 -- AAA --> 오버라이딩한거는 자식의 메서드로 실행.

        //[!] : 그런데 말이죠. --> 자식의 메서드를 바로 호출하고 싶다면? --> 캐스트 필요.
        System.out.println("---------------------[캐스트사용]");
        ((Student)s2).sss();                //sss
        System.out.println("---------------------[캐스트사용]");


        //[3] : 객체 생성
        Person aaa = new Person();   //지극히 정상
        aaa.method1();               //aaa
        //aaa.sss();                   //err


        //[4] : 객체 생성 --> 상위(부모) 클래스로 객체를 생성하면서 타입은 하위(자식) 타입을 쓰는 경우 --> Err
        //Student bbb = new Person(); //Err
    }
}

```
</details>

### ch4 :  다형성을활용한, 추상클래스 상속사용
추상 클래스와 상속을 사용하여 다형성 예제를 만들어보시오. <br>
이 문제는 추상 클래스와 상속의 개념을 이해하고 이를 활용하여 다형성을 구현할 수 있는지를 묻는 문제이다. <br>

### 해설
<details markdown="1">

```java
abstract class Car{
    abstract void run();
}

class Ambulance extends Car{
    @Override
    void run(){
        System.out.println("앰블런스 지낭가요 ~ 삐뽀삐뽀 ~");
    };
}

class Cultivator extends Car{
    @Override
    void run(){
        System.out.println("경운기 지나가요~덜컹덜컹~");
    }
}

class SportCar extends Car{
    @Override
    void run(){
        System.out.println("스포츠가 지나가요~쌩~");
    }
}


public class Java100ClassFour {
    public static void main(String[] args){

        Car c1 = new Ambulance();   //정상
        Car c2 = new Cultivator();   //정상
        Car c3 = new SportCar();   //정상

        c1.run();
        c2.run();
        c3.run();
    }
}
```
</details>



### ch4 : 다형성을활용한, for문사용
다형성(polymorphism)을 활용한 객체 생성시 배열과 반복문을 사용하여 객체를 생성해보시오.<br>
반복문은 향상된 for문으로도 출력해본다.<br>
다형성을 이용한 객체 생성시 배열과 for문을 통해서 자동으로 객체를 생성할 수 있는지를 묻는 문제이다.<br>

<details markdown="1">

```java
abstract class Car{
    abstract void run();
}

class Ambulance extends Car{
    @Override
    void run(){
        System.out.println("앰블런스 지낭가요 ~ 삐뽀삐뽀 ~");
    };
}

class Cultivator extends Car{
    @Override
    void run(){
        System.out.println("경운기 지나가요~덜컹덜컹~");
    }
}

class SportCar extends Car{
    @Override
    void run(){
        System.out.println("스포츠가 지나가요~쌩~");
    }
}

public class Java100ClassFour {

    public static void main(String[] args) {
        //[1]: 배열길이가 3인 Car 객체 배열 선언
        //Car[] cars = new Car[3];
        //System.out.println(cars[0]);    //null--> 각배열에는 아직 null 값만 존재.
        //cars = new Car[]{new Ambulance(), new Cultivator(), new SportCar()};

        //System.out.println(cars[0]);
        //System.out.println(cars[1]);
        //System.out.println(cars[2]);

        //[2] : 1번방법 말고 --> 자식클래스로 객체 생성 --> 타입은 부모 타입으로 --> 이렇게 생성된 객체들로 바로 배열 초기화 --> 다형성 덕분.
        Car[] cars = {new Ambulance(), new Cultivator(), new SportCar()};

        //[3] : 반복문 돌면서 각 객체의 run() 메서드 호출
        for(int i=0; i<cars.length; i++)
        {
            System.out.println(cars[i]);
            cars[i].run();
        }

        //[4] : 향상된 for문
        System.out.println("----------------------------------");
        for(Car i : cars)
            i.run();
    }public static void main(String[] args) {
        //[1]: 배열길이가 3인 Car 객체 배열 선언
        //Car[] cars = new Car[3];
        //System.out.println(cars[0]);    //null--> 각배열에는 아직 null 값만 존재.
        //cars = new Car[]{new Ambulance(), new Cultivator(), new SportCar()};

        //System.out.println(cars[0]);
        //System.out.println(cars[1]);
        //System.out.println(cars[2]);

        //[2] : 1번방법 말고 --> 자식클래스로 객체 생성 --> 타입은 부모 타입으로 --> 이렇게 생성된 객체들로 바로 배열 초기화 --> 다형성 덕분.
        Car[] cars = {new Ambulance(), new Cultivator(), new SportCar()};

        //[3] : 반복문 돌면서 각 객체의 run() 메서드 호출
        for(int i=0; i<cars.length; i++)
        {
            System.out.println(cars[i]);    //각 객체가 생성된 메모리 공간의 주소 값을 출력.
            cars[i].run();
        }

        //[4] : 향상된 for문
        System.out.println("----------------------------------");
        for(Car i : cars)
        {
            System.out.println(i);
            i.run();
        }
    }
}
```
</details>


### ch4 : 다형성 개념 필요성
다형성을 사용하면 배열이나 매개변수 활용에서 좋다는데 자세히 코드로 설명해보시오. <br>
이 문제는 다형성의 개념과 필요성 그리고 어떤 점에서 활용할 때 좋은지를 알고 있는지를 묻는 문제이다. <br>
아래의 객체 생성중 틀린 것은? <br>

### 해설
<details markdown="1">

```java
class Person {}
class Batman extends Person {}

class Human{}
class Superman extends Human{}

public class Java100ClassFour {

    public static void main(String[] args) {
        //[1] : 배열에서 다형성을 사용할 수 없다면..
        //배열 --> 동일한 타입의 데이터를 하나로 묶어서 관리하는 자료구조 --> 다형성이 없다면 객체별로 관리를 해야한다.
        Person[] persons = new Person[10];  //---이건 Person 전용 --
        persons[0] = new Person();
        persons[1] = new Person();
        persons[2] = new Batman();

        Batman[] batmans = new Batman[10];  //---이건 Batman 전용 --
        batmans[0] = new Batman();
        batmans[1] = new Batman();
        // batmans[2] = new Person();   //---Err

        //[2] : 배열에서 다형성을 사용할 수 있기에..
        Human[] humans = new Human[10];
        humans[0] = new Human();
        humans[1] = new Superman();

        //[3] : 매개변수의 다형성
        //프로그래밍 언어에서 함수나 메서드를 호출할 때는 그에 맞는 적절한 파라미터를 보내줘야 한다.
        //System.out.println()메서드의 경우 어떤타입, 객체를 매개변수로 받더라도 에러없이 해당 객체의 값을 출력 --> 갸우뚱?
        //그것이 가능한 이유 --> 바로 다형성을 활용하고 있기 때문이다.
        //실제 메서드의 API 를 보면 --> public void println(Object x)로 되어있기에 어떤 객체타입이 전달되더라도 에러없이 출력이 되는 것이다.
        //결론적으로 Object는 가장 최상위 조상(단군 할아버지, 창조주)이므로 어떤 객체를 보내도 그 보다 상위 타입이 된다.
        System.out.println(new Person());
        System.out.println(new Batman());
        System.out.println(new Human());
        System.out.println(new Superman());


    }
}
```
</details>


### Ch5 : 제네릭의 필요성
제네릭(Generic)의 개념과 필요성에 대해서 예제 코드로 설명해보시오.<br>
이 문제는 자바 문법중 제네릭에 대한 개념과 필요성에 대해서 알고 있는지를 묻는 문제이다.<br>
모든 타입을 다 받는 클래스를 만들어보시오.


### 해설
<details markdown="1">

```java
import java.sql.SQLOutput;

class Sample{
    //Field
    private Object obj;

    //Constructor
    Sample(Object x) {
        this.obj = x;
    }

    //Method
    public Object getObj(){
        return obj;
    }

    void printInfo(){
        System.out.println(obj.getClass().getName());   //객체가 속하는 클래스의 정보를 출력하는 메서드
    }

}

public class Java100ClassFive {

    public static void main(String[] args){

        // [1] : 객체생성 --> 문자열
        Sample s1 = new Sample("안녕하세요~");
        System.out.println(s1.getObj());
        s1.printInfo();
        System.out.println("-------------------------------");

        //[2]: 객체생성 --> 숫자
        Sample s2 = new Sample(100);    //Err (Sample클래스가 받는 생성자가 String이므로 정수를 받을수없다.)
        System.out.println(s2.getObj());    //100
        s2.printInfo();
        System.out.println("-------------------------------");

        //[3]: 객체생성 --> Object
        Sample s3 = new Sample(new Object());
        System.out.println(s3.getObj());    //100
        s3.printInfo();
        System.out.println("-------------------------------");

        //[4]: 위와같이 사용시 --> 단점
        //s1 -->  문자열
        //String str = (String)s1.getObj();     //리턴시 반환타입이 Object 이다., 직접 형변환을해줘야함
        //int num = (int)s2.getObj();           //동일하게안됨.

        //Object stre = s1.getObj();
        //System.out.println(stre.length());    //Err length는 string에서사용
        String stre = (String)s1.getObj();
        System.out.println(stre.length());      //6

        //s2 --> 숫자
        Object num = s2.getObj();
        System.out.println((int)num + 100);

    }

}
```

</details>

### Ch5 : 제네릭의 필요성 2
 컴파일 단계에서는 에러가 안나고, 실행 단계에서 ClassCast 오류가 발생하는 상황을 만들어보시오. <br>
 이 문제는 제네릭의 필요성을 보여주는 예를 코드로 설명할 수 있는지를 묻는 문제이다.  <br>

### 해설

<details markdown="1">


```java
class Person{
    //Field
    public Object obj;

    //Constructor
    Person(Object obj){ this.obj = obj; }
}

class Student{
    //Field
    public int grade;

    //Constructor
    Student(int grade){ this.grade = grade; }
}

class Teacher{ }


public class Java100ClassFive {
    public static void main(String[] args) {
        //[1]: 객체 생성
        Person p1 = new Person(new Student(3));
        //System.out.println(p1.obj);

        //[2]: 형변환 --> Cast
        Student str = (Student)p1.obj;      //그전에 넣어준 형에맞는 타입으로 형변환해줘야한다.
        System.out.println(str);   //6
    }
```

</details>

### Ch5 : 제네릭 구현방법
 제네릭(Generic) 개념과 사용법을 예제 코드로 구현해보시오. <br>
 이 문제는 자바 문법중 제네릭에 대한 개념과 사용법에 대해서 알고 있는지를 묻는 문제이다. <br>


<details markdown="1">

//제네릭 : 데이터의 타입을 일반화하는것을 의미한다.

```java
class Sample<T>{
    private T obj;
    Sample(T x){ this.obj = x; }
    T getObj(){ return obj; }
    void printInfo(){ System.out.println(obj.getClass().getName()); }
}

public class Java100ClassFive {
    public static void main(String[] args) {
        //[1]: 객체생성 --> String
        Sample<String> s1 = new Sample<String>("안녕하세요!");
        System.out.println(s1.getObj());
        s1.printInfo();
        System.out.println("---------------------------------");

        //[2]: 객체생성 --> Integer
        Sample<Integer> s2 = new Sample<Integer>(2);
        System.out.println(s2.getObj());
        s2.printInfo();

        //[3]: 형변환 없이 사용하기
        String str = s1.getObj();
        System.out.println(str.length());   //6
    }
```
</details>


### Ch5 : 컬렉션 개념
 컬렉션(Collection) 프레임워크란 무엇인지 개념을 설명해보시오. <br>
 이 문제는 자바의 컬렉션에 대한 이해와 개념에 대해서 설명할 수 있는지를 묻는 문제이다. <br>

```text
[0] : 컬렉션 사전학습
 처음 자바 책 사서 컬렉션 파트 훑어 봤을 꽤 어렵네... 라고 느꼈다면? -->  선수학습이 안되어서 그렇다.
 선수학습 --> OOP, 추상클래스, 상속, 인터페이스, 제네릭
 공부할 양이 제법 많다. 그래서 어지간한 기본서에서는 아예 컬렉션 파트를 다루지 않고, 두꺼운 기본서 정도 되어야 개념과 여러 클래스를 다룬다.
 본과정에서도 컬렉션에 대한 개념과 ArrayList 클래스 위주로 진행.

[1] : Collection Framework 란?
수집품이라는 사전적의미에서 유추할 수 있듯이 "데이터 값들을 담는 여러 그릇"정도로 이해하면 된다.
집 부엌 천장을 열어보면 종류별로 용도별로 많이 있듯이 어떤 자료구조 데이터를 저장하고 관리할 것인지에 따라서 맞는 그릇을 써야한다.
내가 만들 프로그램의 데이터 처리를 어떻게 할지 그 특징을 잘 파악하여 컬렉션내 맞는 그릇(클래스)를 잘 골라써야한다.
컬렉션 프레임워크는 크게 봤을 때 --> Collection과 Map으로 나뉘고 --> 이 둘은 모두 인터페이스(Interface)로 되어있다.
Collection은 또 List와 Set으로 나뉘고 --> 이들도 인터페이스 --> 이들을 상속받아 다양한 형태의 배열(그릇, 클래스)로 사용된다.


[2]: Collection
Collection(인터페이스) --> 상속 --> List와 Set으로 구분(인터페이스) --> 상속 --> List계열 구현클래스 vs Set계열 구현클래스
List 계열 구현 클래스 --> ArrayList , LinkecList, Vector, Stack
Set 계열 구현 클래스 --> HashSet, SortedSet, TreeSet

[3] List vs Set
컬렉션 프레임워크의 핵심 인터페이스들.
List 인터페이스를 상속하는 클래스들 특징 --> (1)인덱스가 있고, (2)그래스 저장 순서가 유지되고, (3) 데이터 중복이 허용.
Set 인터페이스를 상속하는 클래스들 특징 --> (1)데이터 중복이 허용 안됨.
```

### Ch5 : ArrayList 정의, 활용

```text
먼저, 자바의 배열은 크기를 미리 지정하고 사용했다. --> 그러다보니 넉넉하게 크기를 지정해놓고 사용하곤 한다.  
반면, ArrayList는 필요시 언제든지 추가, 삭제가 가능하다.  
List 인터페이스를 상속하므로 인덱스가 있고, 저장 순서가 유지되고, 데이터 중복이 가능하다.  
또한, 제네릭 문법을 사용할 수 있다. --> 만약, 제네릭을 사용하지 않는다면 내부적으로 Object 타입으로 처리된다.  
사용을 위해서는 상단에 임포트가 필요하다. --> import java.util.ArrayList; 또는 import java.util.*; 
```


<details markdown="1">

```java
import java.util.ArrayList;

public class Java100ClassFive {
    public static void main(String[] args) {
        //[1]: ArrayList를 제네릭이 아닌 Object 타입으로 사용하는 경우.
        ArrayList list1 = new ArrayList();

        //[2]: 데이터 추가하기 -->add()
        list1.add("홍길동");           //문자열 자료형 저장
        list1.add(20);              //정수자료형 저장
        list1.add("이순신");
        list1.add(20);              //데이터 중복이 가능
        list1.add(new Person());

        //[3]:데이터 가져오기 -->get() -->이때, 해당 데이터 자료형으로 형변환하여 사용한다.
        System.out.println(list1.get(0));   //홍길동
        String str = (String)list1.get(0);
        System.out.println(str.length());   //3

        int num = (int)list1.get(1);    //3
        System.out.println(num + 100);  //120

        //[!] :결론
        //이상으로 봤을 때, 제네릭 문법을 사용하지 않으면 ArrayList는 내부적으로 Object타입으로 처리됨을 알수있다.
        //이렇게 get() 메서드를 사용할 때는 형변환을 주의해야한다.
        //제네릭을 사용하면 된다.

        //[4]:출력-->반복문-->배열의 크기(size)-->객체명.size()
        System.out.println(list1.size());
        for(int i=0; i<list1.size(); i++){
            System.out.println(list1.get(i) +"");
        }
    }
}
```
</details>