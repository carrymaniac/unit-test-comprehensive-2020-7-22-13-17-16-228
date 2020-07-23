package example;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

/**
 * @ProjectName: unit-test-comprehensive
 * @Package: example
 * @ClassName: GuessGameTest
 * @Author: carrymaniac
 * @Description: GuessGameTest
 * @Date: 2020/7/23 5:53 下午
 * @Version:
 */
public class GuessGameTest {
    @Test
    void should_return_4A0B_when_guessGame_given_answer_1234_and_guess_number_1234() {

        //given
        String guessNumber = "1234";
        String answer = "1234";
        AnswerGenerater answerGenerater = Mockito.mock(AnswerGenerater.class);
        when(answerGenerater.generate()).thenReturn("1234");
        //when
        GuessGame guessGame = new GuessGame(answerGenerater);
        String actual = guessGame.guess(guessNumber);
        //then
        String expected = "4A0B";
        assertEquals(expected,actual);
    }
}
