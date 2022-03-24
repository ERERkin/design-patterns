package kg.erking.designpatterns.creationalPatterns.builder;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BuilderTest {
    @Test
    void test() {
        Person personActual = new PersonBuilderImpl()
                .fistName("Test")
                .lastName("Test")
                .age(18)
                .gender(Gender.MALE)
                .build();

        Person personExpected = new Person("Test", "Test", 18, null, Gender.MALE);

        Assertions.assertEquals(personExpected, personActual);
    }
}