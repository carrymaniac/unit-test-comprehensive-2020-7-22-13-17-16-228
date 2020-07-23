package example;

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
    private String answer;
    public GuessGame(AnswerGenerater answerGenerater) {
        this.answer = answerGenerater.generate();
    }

    public String guess(String guessNumber) {
        if(guessNumber.equals(answer)){
            return "4A0B";
        }
        return null;
    }
}
