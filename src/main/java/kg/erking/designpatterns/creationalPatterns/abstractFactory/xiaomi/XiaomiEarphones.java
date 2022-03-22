package kg.erking.designpatterns.creationalPatterns.abstractFactory.xiaomi;

import kg.erking.designpatterns.creationalPatterns.abstractFactory.Earphones;

public class XiaomiEarphones implements Earphones {
    @Override
    public String listenToMusic() {
        return "Listening to music with xiaomi earphones";
    }
}
