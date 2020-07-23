package example;

import org.junit.jupiter.api.BeforeEach;
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
public class GuessGameTest  {
    AnswerGenerater answerGenerater;
    GuessGame guessGame;

    @BeforeEach
    void initAnswerGenerater(){
        answerGenerater = Mockito.mock(AnswerGenerater.class);
        when(answerGenerater.generate()).thenReturn("1234");
        guessGame = new GuessGame(answerGenerater);
    }

    @Test
    void should_return_4A0B_when_guessGame_given_answer_1234_and_guess_number_1234() {
        //given
        String guessNumber = "1234";
        //when
        String actual = guessGame.guess(guessNumber);
        //then
        assertEquals("4A0B",actual);
    }

    @Test
    void should_return_2A2B_when_guessGame_given_answer_1234_and_guess_number_1324() {
        //given
        String guessNumber = "1324";
        //when
        String actual = guessGame.guess(guessNumber);
        //then
        assertEquals("2A2B",actual);
    }

    @Test
    void should_return_1A1B_when_guessGame_given_answer_1234_and_guess_number_1526() {
        //given
        String guessNumber = "1526";
        //when
        String actual = guessGame.guess(guessNumber);
        //then
        assertEquals("1A1B",actual);
    }

    @Test
    void should_return_0A4B_when_guessGame_given_answer_1234_and_guess_number_2143() {
        //given
        String guessNumber = "2143";
        //when
        String actual = guessGame.guess(guessNumber);
        //then
        assertEquals("0A4B",actual);
    }

    @Test
    void should_return_0A2B_when_guessGame_given_answer_1234_and_guess_number_2849() {
        //given
        String guessNumber = "2143";
        //when
        String actual = guessGame.guess(guessNumber);
        //then
        assertEquals("0A4B",actual);
    }

    @Test
    void should_return_0A0B_when_guessGame_given_answer_1234_and_guess_number_5678() {
        //given
        String guessNumber = "5678";
        //when
        String actual = guessGame.guess(guessNumber);
        //then
        assertEquals("0A0B",actual);
    }
}
