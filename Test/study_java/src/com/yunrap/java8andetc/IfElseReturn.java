package study_java.src.com.yunrap.java8andetc;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class IfElseReturn {

    @DisplayName("if Else Return")
    @Test
    String test(){
        var  rfidVo = "!";
        if (rfidVo == null) {
            return "존재하지 않는 값.";
        } else if (rfidVo == "!") {
            return "느낌표입니다.";
        } else {
            return "아무것도 아닙니다.";
        }

    }

}
