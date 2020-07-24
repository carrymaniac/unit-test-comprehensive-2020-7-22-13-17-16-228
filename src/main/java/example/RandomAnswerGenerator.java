package example;

import java.util.ArrayList;
import java.util.Random;

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
    @Override
    public String generate() {
        Integer[] array = {0,1,2,3,4,5,6,7,8,9};
        ArrayList<Integer> list = new ArrayList<>();
        for(int i:array){
            list.add(i);
        }
        String result = "";
        for(int i = 0;i<4;i++){
            Random random = new Random(System.currentTimeMillis());
            Integer integer = list.get(random.nextInt(list.size() - 1));
            result +=integer;
            list.remove(integer);
        }
        return result;
    }
}
