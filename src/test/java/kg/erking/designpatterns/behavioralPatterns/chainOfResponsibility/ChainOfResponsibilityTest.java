package kg.erking.designpatterns.behavioralPatterns.chainOfResponsibility;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChainOfResponsibilityTest {
    @Test
    void not_has_numeric() {
        String text = "&asdf";

        Validator aLetterValidator = new ALetterValidator();
        Validator andSymbolValidator = new AndSymbolValidator();
        aLetterValidator.setNextValidator(andSymbolValidator);
        Validator numericValidator = new NumericValidator();
        andSymbolValidator.setNextValidator(numericValidator);

        Assertions.assertFalse(aLetterValidator.check(text));

    }

    @Test
    void valid_all() {
        String text = "&asdf5";

        Validator aLetterValidator = new ALetterValidator();
        Validator andSymbolValidator = new AndSymbolValidator();
        aLetterValidator.setNextValidator(andSymbolValidator);
        Validator numericValidator = new NumericValidator();
        andSymbolValidator.setNextValidator(numericValidator);

        Assertions.assertTrue(aLetterValidator.check(text));
    }
}