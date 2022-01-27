# java 정리집

## java

## java 8




ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

### Optional 클래스

Optional<T> 클래스는 Integer나 Double 클래스처럼 T 타입의 객체를 포장해주는 래퍼 클래스

#### Optional 객체의 생성
of() 메소드나 ofNullable()메서드를 사용하여 Optional 객체를 생성
ofNullable() 메서드를 사용하면 null 값이라면 비어있는 Optional 객체를 반환


#### Optional 객체에 접근
get() 메소드를 사용하여 접근
더 안전하게 isPresent를 사용하여 null인지 아닌지 체크한다


