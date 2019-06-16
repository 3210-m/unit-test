package tw.core;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import tw.core.exception.OutOfRangeAnswerException;
import tw.core.model.Record;

import java.util.Arrays;


/**
 * 在AnswerTest文件中完成Answer中对应的单元测试
 */
public class AnswerTest {
    Answer answer;

    @Before
    public void init() {
        answer = Answer.createAnswer("1 2 3 4");
    }

    @Test
    public void validate() {
        try {
            answer.validate();
        } catch (OutOfRangeAnswerException e) {
            Assert.fail();
        }
    }

    @Test
    public void check() {
        Answer excepeted = new Answer();
        excepeted.setNumList(Arrays.asList("1", "2", "3", "4"));
        Record check = answer.check(excepeted);
        Assert.assertEquals(check.getValue(), "4A0B");
    }

}