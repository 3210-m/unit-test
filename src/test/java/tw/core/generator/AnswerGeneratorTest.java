package tw.core.generator;

import com.google.inject.Injector;
import org.junit.Assert;
import org.junit.Test;
import tw.GuessNumberModule;
import tw.core.Answer;
import tw.core.exception.OutOfRangeAnswerException;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static com.google.inject.Guice.createInjector;

/**
 * 在AnswerGeneratorTest文件中完成AnswerGenerator中对应的单元测试
 */
public class AnswerGeneratorTest {

    private Injector injector = createInjector(new GuessNumberModule());
    private AnswerGenerator answerGenerator = injector.getInstance(AnswerGenerator.class);

    /**
     * 本测试用例是测试是生成答案的是否正确
     * <p>1.如果抛出异常则测试不通过</>
     * <p>2.如果生成的结果List不等于4则测试不通过</>
     */
    @Test
    public void generate() {
        Answer generate = null;
        try {
            generate = answerGenerator.generate();
        } catch (OutOfRangeAnswerException e) {
            Assert.fail();
        }
        Assert.assertNotNull(generate);
        List<String> result = Arrays.stream(generate.toString()
                .split(" "))
                .collect(Collectors.toList());
        Assert.assertEquals(result.size(), 4);
    }
}

