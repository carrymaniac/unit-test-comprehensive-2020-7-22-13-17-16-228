package example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
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
        Set<Integer> answer = new HashSet<>();
        StringBuilder stringBuilder = new StringBuilder();
        while (answer.size() < ANSWER_LENGTH) {
            Integer ans = (int) (Math.random() * 10);
            if (!answer.contains(ans)) {
                stringBuilder.append(ans);
            }
            answer.add(ans);
        }
        return stringBuilder.toString();
    }
}
