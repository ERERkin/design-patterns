package kg.erking.designpatterns.behavioralPatterns.chainOfResponsibility;

public class NumericValidator extends Validator{
    @Override
    boolean checkText(String text) {
        char[] chars = text.toCharArray();
        for(char c : chars){
            if(Character.isDigit(c)){
                return true;
            }
        }
        return false;
    }
}
