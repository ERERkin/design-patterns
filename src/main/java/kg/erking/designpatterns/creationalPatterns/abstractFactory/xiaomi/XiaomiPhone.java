package kg.erking.designpatterns.creationalPatterns.abstractFactory.xiaomi;

import kg.erking.designpatterns.creationalPatterns.abstractFactory.Phone;

public class XiaomiPhone implements Phone {
    @Override
    public String call() {
        return "Call by xiaomi phone";
    }
}
