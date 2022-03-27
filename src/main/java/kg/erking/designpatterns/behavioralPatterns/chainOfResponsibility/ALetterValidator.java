package kg.erking.designpatterns.behavioralPatterns.chainOfResponsibility;

//Has A or a letter
public class ALetterValidator extends Validator{
    @Override
    boolean checkText(String text) {
        return text.toUpperCase().contains("A");
    }
}
