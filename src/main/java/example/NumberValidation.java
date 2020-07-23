package example;

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
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
