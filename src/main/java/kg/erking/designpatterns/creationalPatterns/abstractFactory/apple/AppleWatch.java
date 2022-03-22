package kg.erking.designpatterns.creationalPatterns.abstractFactory.apple;

import kg.erking.designpatterns.creationalPatterns.abstractFactory.SmartWatch;

public class AppleWatch implements SmartWatch {
    @Override
    public String lookAtWatch() {
        return "Look at apple watch";
    }
}
