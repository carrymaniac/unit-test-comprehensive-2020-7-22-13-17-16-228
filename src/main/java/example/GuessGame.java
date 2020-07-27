package example;

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
    private String answer;

    public GuessGame(AnswerGenerator answerGenerator) {
        this.answer = answerGenerator.generate();
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
        Set answerSet = new HashSet(Arrays.asList(answerArray));
        Integer numberOfCorrectNumber = 0;
        for (int i = 0; i < guessArray.length; i++) {
            if (answerSet.contains(guessArray[i])) {
                numberOfCorrectNumber++;
            }
        }
        return numberOfCorrectNumber;
    }
}
