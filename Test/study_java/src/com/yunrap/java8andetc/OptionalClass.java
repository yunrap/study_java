package study_java.src.com.yunrap.java8andetc;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Optional;

public class OptionalClass {


    @DisplayName("Optional")
    @Test
    void optionalTest(){
        Optional<String> opt = Optional.ofNullable("자바 Optional 객체");
        System.out.println(opt.get());
    }

    @DisplayName("isPresent, orElse, orElseGet, orElseThrow 메소드")
    @Test
    void isPresent(){
        Optional<String> opt = Optional.ofNullable("자바 Optional 객체");

        if(opt.isPresent())
        {
            System.out.println(opt.get());
        }

        Optional<String> optnull = Optional.empty();
        System.out.println(optnull.orElse("빈 Optional 객체"));
        System.out.println(optnull.orElseGet(String::new));
        System.out.println(optnull.orElseThrow());

    }
}
