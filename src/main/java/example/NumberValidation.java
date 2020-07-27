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
            if (string.length() != NUMBER_LENGTH) {
                return false;
            }
            if (new HashSet(Arrays.asList(string.split(""))).size() < NUMBER_LENGTH) {
                return false;
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
