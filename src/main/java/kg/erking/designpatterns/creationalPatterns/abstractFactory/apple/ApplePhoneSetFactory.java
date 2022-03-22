package kg.erking.designpatterns.creationalPatterns.abstractFactory.apple;

import kg.erking.designpatterns.creationalPatterns.abstractFactory.Earphones;
import kg.erking.designpatterns.creationalPatterns.abstractFactory.Phone;
import kg.erking.designpatterns.creationalPatterns.abstractFactory.PhoneSetFactory;
import kg.erking.designpatterns.creationalPatterns.abstractFactory.SmartWatch;
import kg.erking.designpatterns.creationalPatterns.abstractFactory.xiaomi.XiaomiPhone;

public class ApplePhoneSetFactory implements PhoneSetFactory {
    @Override
    public Phone getPhone() {
        return new Iphone();
    }

    @Override
    public Earphones getEarphones() {
        return new Airpods();
    }

    @Override
    public SmartWatch getSmartWatch() {
        return new AppleWatch();
    }
}
