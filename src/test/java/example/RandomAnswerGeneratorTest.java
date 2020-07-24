package example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @ProjectName: unit-test-comprehensive
 * @Package: example
 * @ClassName: RandomAnswerGeneratorTest
 * @Author: carrymaniac
 * @Description:
 * @Date: 2020/7/23 7:20 下午
 * @Version:
 */
public class RandomAnswerGeneratorTest {
    @Test
    void should_return_number_when_RandomAnswerGenerator_generate_given_nothing() {
        //given
        AnswerGenerator randomAnswerGenerator = new RandomAnswerGenerator();
        //when
        String actual = randomAnswerGenerator.generate();
        //then
        assertDoesNotThrow(()->{
            Integer.valueOf(actual);
        });
    }

    @Test
    void should_return_4_length_and_unduplicated_number_when_RandomAnswerGenerator_generate_given_nothing() {
        //given
        AnswerGenerator randomAnswerGenerator = new RandomAnswerGenerator();
        //when
        String actual = randomAnswerGenerator.generate();
        //then
        assertEquals(4,new HashSet<>(Arrays.asList(actual.split(""))).size());
    }
}
