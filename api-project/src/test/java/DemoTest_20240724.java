
import com.demo.test.ApiProjectApplication;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {ApiProjectApplication.class})
class DemoTest_20240724 {

    @Test
    public void test() {
        Set<String> set1 = new HashSet<>(Arrays.asList("111", "222", "333"));

        Set<String> set2 = new HashSet<>(Arrays.asList("444", "555", "666"));

        Set<String> set3 = new HashSet<>(Arrays.asList("444", "777", "888"));

        Set<String> set4= new HashSet<>(Arrays.asList("444", "777", "888"));

        boolean a = Collections.disjoint(set1, set2);
        System.out.println("set1 与 set2 无相同元素时，Collections.disjoint结果：" + a);

        boolean b = Collections.disjoint(set2, set3);
        System.out.println("set2 与 set3 有相同元素时，Collections.disjoint结果：" + b);

        Assert.assertEquals(!Collections.disjoint(set2, set3), true);

        Assert.assertEquals(set3.containsAll(set4), true);

    }

}
