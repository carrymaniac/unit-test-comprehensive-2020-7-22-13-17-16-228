package example;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @ProjectName: unit-test-comprehensive
 * @Package: example
 * @ClassName: NumberValidation
 * @Author: carrymaniac
 * @Description:
 * @Date: 2020/7/23 7:58 下午
 * @Version:
 */
public class NumberValidation implements Validation {

    private static final int NUMBER_LENGTH = 4;

    @Override
    public boolean validate(String string) {
        try {
            Integer.parseInt(string);
            return !isLengthEqual4(string) && !isUnduplicated(string);
        } catch (Exception e) {
            return false;
        }
    }

    private boolean isUnduplicated(String string) {
        return new HashSet<>(Arrays.asList(string.split(""))).size() < NUMBER_LENGTH;
    }

    private boolean isLengthEqual4(String string) {
        return string.length() != NUMBER_LENGTH;
    }
}
