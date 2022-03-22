package kg.erking.designpatterns.creationalPatterns.abstractFactory;

import kg.erking.designpatterns.creationalPatterns.abstractFactory.apple.ApplePhoneSetFactory;
import kg.erking.designpatterns.creationalPatterns.abstractFactory.xiaomi.XiaomiPhoneSetFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AbstractFactoryTest {

    @Test
    void getAnswerNo1() {
        List<String> actual = AbstractFactory.getAnswer(new ApplePhoneSetFactory());
        List<String> expected = new ArrayList<>(
                Arrays.asList("Call by iphone", "Listening to music with Airpods", "Look at apple watch"));

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getAnswerNo2() {
        List<String> actual = AbstractFactory.getAnswer(new XiaomiPhoneSetFactory());
        List<String> expected = new ArrayList<>(
                Arrays.asList("Call by xiaomi phone", "Listening to music with xiaomi earphones", "Look at xiaomi watch"));

        Assertions.assertEquals(expected, actual);
    }
}