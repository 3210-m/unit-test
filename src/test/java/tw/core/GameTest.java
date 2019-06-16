package tw.core;

import com.google.inject.Injector;
import org.junit.Assert;
import org.junit.Test;
import tw.GuessNumberModule;

import java.util.Arrays;

import static com.google.inject.Guice.createInjector;

/**
 * 在GameTest文件中完成Game中对应的单元测试
 */


public class GameTest {


    private Injector injector = createInjector(new GuessNumberModule());
    Game game = injector.getInstance(Game.class);

    @Test
    public void guess() {
        Answer answer = new Answer();
        answer.setNumList(Arrays.asList("1", "2", "3", "4"));
        Assert.assertNotNull(game.guess(answer));
    }

    @Test
    public void checkStatus() {
        System.out.println(game.checkStatus());
    }
}
