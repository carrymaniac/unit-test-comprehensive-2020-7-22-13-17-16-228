package example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @ProjectName: unit-test-comprehensive
 * @Package: example
 * @ClassName: NumberValidationTest
 * @Author: carrymaniac
 * @Description:
 * @Date: 2020/7/23 7:53 下午
 * @Version:
 */
public class NumberValidationTest {

    @Test
    void should_return_false_when_NumberValidation_validate_given_abcd() {
        String number = "abcd";
        Validation numberValidation = new NumberValidation();
        boolean actual = numberValidation.validate(number);
        assertFalse(actual);
    }

    @Test
    void should_return_false_when_NumberValidation_validate_given_12() {
        String number = "12";
        Validation numberValidation = new NumberValidation();
        boolean actual = numberValidation.validate(number);
        assertFalse(actual);
    }
    @Test
    void should_return_false_when_NumberValidation_validate_given_1111() {
        String number = "1111";
        Validation numberValidation = new NumberValidation();
        boolean actual = numberValidation.validate(number);
        assertFalse(actual);
    }

    @Test
    void should_return_true_when_NumberValidation_validate_given_1234() {
        String number = "1234";
        Validation numberValidation = new NumberValidation();
        boolean actual = numberValidation.validate(number);
        assertTrue(actual);
    }

}
