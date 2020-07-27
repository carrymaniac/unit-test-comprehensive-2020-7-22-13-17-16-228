package example;

import java.util.HashSet;
import java.util.Set;

/**
 * @ProjectName: unit-test-comprehensive
 * @Package: example
 * @ClassName: RandomAnswerGenerater
 * @Author: carrymaniac
 * @Description:
 * @Date: 2020/7/23 7:25 下午
 * @Version:
 */
public class RandomAnswerGenerator implements AnswerGenerator {

    private static final int ANSWER_LENGTH = 4;

    @Override
    public String generate() {
        Set<Integer> answerSet = new HashSet<>();
        StringBuilder answerStringBuilder = new StringBuilder();
        while (answerSet.size() < ANSWER_LENGTH) {
            Integer randomNumber = (int) (Math.random() * 10);
            if (!answerSet.contains(randomNumber)) {
                answerStringBuilder.append(randomNumber);
            }
            answerSet.add(randomNumber);
        }
        return answerStringBuilder.toString();
    }
}
