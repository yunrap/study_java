package study_java.src.com.yunrap.algorithm;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME) //컴파일 이후에도 JVM 에 의해서 계속 참조
@Target(ElementType.TYPE_USE) //타입 선언 시 사용한다는 의미
@Repeatable(ColorContainer.class)
public @interface Color {
    String value();
}
