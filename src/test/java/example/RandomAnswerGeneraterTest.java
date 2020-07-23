package example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @ProjectName: unit-test-comprehensive
 * @Package: example
 * @ClassName: RandomAnswerGeneraterTest
 * @Author: carrymaniac
 * @Description:
 * @Date: 2020/7/23 7:20 下午
 * @Version:
 */
public class RandomAnswerGeneraterTest {
    @Test
    void should_return_number_when_RandomAnswerGenerater_generate_given_nothing() {
        //given
        AnswerGenerater randomAnswerGenerater = new RandomAnswerGenerater();
        //when
        String actual = randomAnswerGenerater.generate();
        //then
        assertDoesNotThrow(()->{
            Integer.valueOf(actual);
        });
    }

    @Test
    void should_return_4_length_and_unduplicated_number_when_RandomAnswerGenerater_generate_given_nothing() {
        //given
        AnswerGenerater randomAnswerGenerater = new RandomAnswerGenerater();
        //when
        String actual = randomAnswerGenerater.generate();
        //then
        assertEquals(4,new HashSet<String>(Arrays.asList(actual.split(""))).size());
    }
}
