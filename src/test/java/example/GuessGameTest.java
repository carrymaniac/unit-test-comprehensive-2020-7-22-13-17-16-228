package example;

import org.junit.jupiter.api.BeforeAll;
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
    @BeforeEach
    void initAnswerGenerater(){
        answerGenerater = Mockito.mock(AnswerGenerater.class);
        when(answerGenerater.generate()).thenReturn("1234");
    }

    @Test
    void should_return_4A0B_when_guessGame_given_answer_1234_and_guess_number_1234() {
        //given
        String guessNumber = "1234";
        //when
        GuessGame guessGame = new GuessGame(answerGenerater);
        String actual = guessGame.guess(guessNumber);
        //then
        String expected = "4A0B";
        assertEquals(expected,actual);
    }

    @Test
    void should_return_2A2B_when_guessGame_given_answer_1234_and_guess_number_1324() {
        //given
        String guessNumber = "1324";
        GuessGame guessGame = new GuessGame(answerGenerater);
        //when
        String actual = guessGame.guess(guessNumber);
        //then
        assertEquals("2A2B",actual);
    }

    @Test
    void should_return_1A1B_when_guessGame_given_answer_1234_and_guess_number_1526() {
        //given
        String guessNumber = "1526";
        GuessGame guessGame = new GuessGame(answerGenerater);
        //when
        String actual = guessGame.guess(guessNumber);
        //then
        assertEquals("1A1B",actual);
    }

    @Test
    void should_return_0A4B_when_guessGame_given_answer_1234_and_guess_number_2143() {
        //given
        String guessNumber = "2143";
        GuessGame guessGame = new GuessGame(answerGenerater);
        //when
        String actual = guessGame.guess(guessNumber);
        //then
        assertEquals("0A4B",actual);
    }

    @Test
    void should_return_0A2B_when_guessGame_given_answer_1234_and_guess_number_2849() {
        //given
        String guessNumber = "2143";
        GuessGame guessGame = new GuessGame(answerGenerater);
        //when
        String actual = guessGame.guess(guessNumber);
        //then
        assertEquals("0A4B",actual);
    }
}
