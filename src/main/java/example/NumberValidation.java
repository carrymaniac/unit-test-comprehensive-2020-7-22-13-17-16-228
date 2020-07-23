package example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

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
    @Override
    public boolean validate(String string) {
        try{
            Integer.parseInt(string);
            if(string.length()!=4){
                return false;
            }
            if(new HashSet(Arrays.asList(string.split(""))).size()<4){
                return false;
            }
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
