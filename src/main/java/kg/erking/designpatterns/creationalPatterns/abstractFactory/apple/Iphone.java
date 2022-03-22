package kg.erking.designpatterns.creationalPatterns.abstractFactory.apple;

import kg.erking.designpatterns.creationalPatterns.abstractFactory.Phone;

public class Iphone implements Phone {
    @Override
    public String call() {
        return "Call by iphone";
    }
}
