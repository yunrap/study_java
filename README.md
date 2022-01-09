
# 자바 1000제

## 변수
문제1 <br>
자바의 기본적인 코드를 작성한 것인데 에러가 많이 나온다. 에러를 모두 찾아서 수정하시오.
이 문제는 자바의 기본적인 코드 작성 규칙을 알고 있는지와 그에 따라 작성할 수 있는지를 묻는 문제이다.
```
public class java100_variable_HelloWorld {

	public static void main(string[] args) 
	{ 
		system.out.println( 'Hello World~' )
	}
}
```


해설
```
public class Java100ClassOne {	//클래스는 대문자 
	public static void main(String[] args) {	//String 
		System.out.println("Hello world");		//System , 세미콜론 사용 ,문자열은 " "
	}
}	//자바는 클래스명이 첫시작은 대문자로 설정한다 
```



문제2 <br>
자바의 기본적인 코드 구성에서 각 키워드를 간략히 설명해보시오.
이 문제는 자바 코드의 주요 키워드들에 대해서 각각의 의미와 쓰임새(용도)에 대해서 아는지를 묻는 문제이다. 
 지금 단계에서는 간략한 개념 정도만 알면 된다. 더 알 수도 없다.
 ```
 public class Java100ClassOne {
	public static void main(String[] args) {
		System.out.println("Hello world");
	}
}
 ```


해설

접근제한자 클래스선언 클래스이름 {
	접근제한자 static 반환타입 메서드이름(파라미터) {
		//구현할 코드 작성 
	}
}


(1) 접근제한자 --> public, private, protected, default 
--> 클래스나 매서드에 접근할수있는 범위를 지정 --> 접근제한자, 접근제어자
--> private > protected > public
(2) 클래스선언 --> class
--> 객체를 생성하는 공장 
(3) 클래스이름 --> 카멜케이스(단어와 단어사이의 구분 --> 대문자 )
(4) 메서드이름 --> 메서드란? 함수 --> 어떤 특정한 동작이나 작업, 행위등을 수행하는 것.



문제3
자바의 메인 메서드를 작성한 코드에서 틀린 곳을 찾아서 모두 수정하시오.
이 문제는 자바의 기본 코드 구성에서 메인 메서드의 특징과 주의할 점에 대해서 아는지를 묻는 문제이다.


```
public class Java100ClassOne {

	public void main_method(String[] gaddonge) 
		{ 
			System.out.println( "Hello World~" );
		}

}
```

해설

```
public class Java100ClassOne {		//반드시 파일명과 클래스명과 동일하게할

	public void main(String[] gaddonge) 	//반드시 메인메소드는 메인으로 해줘야함 , 매개변수는 args가 아니여도 각자의미에맞게..
		{ 
			System.out.println( "Hello World~" );
		}

}
```























