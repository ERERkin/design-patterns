package kg.erking.designpatterns.creationalPatterns.abstractFactory.apple;

import kg.erking.designpatterns.creationalPatterns.abstractFactory.Earphones;

public class Airpods implements Earphones {
    @Override
    public String listenToMusic() {
        return "Listening to music with Airpods";
    }
}
