package tw.core;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import tw.core.generator.RandomIntGenerator;

/**
 * 在RandomIntGeneratorTest文件中完成RandomIntGenerator中对应的单元测试
 */
public class RandomIntGeneratorTest {

    RandomIntGenerator randomIntGenerator;

    @Before
    public void setUp() {
        randomIntGenerator = new RandomIntGenerator();
    }

    /**
     * 测试用例
     * digitmax  numbersOfNeed
     * 9              4
     * 3              3
     * 3              5
     * 0              1
     * 1              0
     */
    @Test
    public void generateNumsTest() {
        try {
            randomIntGenerator.generateNums(3, 5);
            Assert.fail();
        } catch (Exception e) {
        }
    }

}