package kg.erking.designpatterns.behavioralPatterns.chainOfResponsibility;

import java.util.Objects;

abstract public class Validator {
    Validator nextValidator;

    public void setNextValidator(Validator nextValidator) {
        this.nextValidator = nextValidator;
    }

    public boolean check(String text){
        if(Objects.isNull(nextValidator)){
            return checkText(text);
        }
        return checkText(text) && nextValidator.check(text);
    }

    abstract boolean checkText(String text);
}
