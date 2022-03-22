package kg.erking.designpatterns.creationalPatterns.abstractFactory.xiaomi;

import kg.erking.designpatterns.creationalPatterns.abstractFactory.SmartWatch;

public class XiaomiWatch implements SmartWatch {
    @Override
    public String lookAtWatch() {
        return "Look at xiaomi watch";
    }
}
