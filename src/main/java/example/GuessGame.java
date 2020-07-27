package example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @ProjectName: unit-test-comprehensive
 * @Package: example
 * @ClassName: GuessGame
 * @Author: carrymaniac
 * @Description:
 * @Date: 2020/7/23 6:01 下午
 * @Version:
 */
public class GuessGame {
    private static final String CORRECT_RESULT = "4A0B";
    private static final String WRONG_MESSAGE = "Wrong Input，Input again";
    private static final int CHANGE_NUM = 6;
    private final String answer;
    private final Validation validation;

    public GuessGame(AnswerGenerator answerGenerator, Validation validation) {
        this.answer = answerGenerator.generate();
        this.validation = validation;
    }

    public String guess(String guessNumber) {
        if (guessNumber.equals(answer)) {
            return CORRECT_RESULT;
        }
        String[] guessArray = guessNumber.split("");
        String[] answerArray = answer.split("");
        Integer numberOfCorrectNumber = calculateNumberOfCorrectNumber(guessArray, answerArray);
        Integer numberOfCorrectPosition = 0;
        for (int i = 0; i < answerArray.length; i++) {
            if (guessArray[i].equals(answerArray[i])) {
                numberOfCorrectPosition++;
                numberOfCorrectNumber--;
            }
        }
        return String.format("%sA%sB", numberOfCorrectPosition, numberOfCorrectNumber);
    }

    private Integer calculateNumberOfCorrectNumber(String[] guessArray, String[] answerArray) {
        Set answerSet = new HashSet<>(Arrays.asList(answerArray));
        Integer numberOfCorrectNumber = 0;
        for (String s : guessArray) {
            if (answerSet.contains(s)) {
                numberOfCorrectNumber++;
            }
        }
        return numberOfCorrectNumber;
    }

    public void play() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int guessTime = 0; guessTime < CHANGE_NUM; guessTime++) {
            System.out.print("Please enter your answer:");
            String guess = br.readLine();
            String thisGuessResult = guess(guess);
            if (validation.validate(guess)) {
                System.out.println(thisGuessResult);
            } else {
                System.out.println(WRONG_MESSAGE);
            }
            if (CORRECT_RESULT.equals(thisGuessResult)) {
                System.out.print("You win!\r\n");
                return;
            }
        }
        System.out.println("You lose!");
    }
}
