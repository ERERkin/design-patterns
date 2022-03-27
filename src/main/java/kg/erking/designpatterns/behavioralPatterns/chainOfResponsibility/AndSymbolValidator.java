package kg.erking.designpatterns.behavioralPatterns.chainOfResponsibility;

//Has & symbol
public class AndSymbolValidator extends Validator{
    @Override
    boolean checkText(String text) {
        return text.contains("&");
    }
}
