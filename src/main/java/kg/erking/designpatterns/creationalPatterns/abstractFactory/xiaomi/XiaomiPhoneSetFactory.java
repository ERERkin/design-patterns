package kg.erking.designpatterns.creationalPatterns.abstractFactory.xiaomi;

import kg.erking.designpatterns.creationalPatterns.abstractFactory.Earphones;
import kg.erking.designpatterns.creationalPatterns.abstractFactory.Phone;
import kg.erking.designpatterns.creationalPatterns.abstractFactory.PhoneSetFactory;
import kg.erking.designpatterns.creationalPatterns.abstractFactory.SmartWatch;

public class XiaomiPhoneSetFactory implements PhoneSetFactory {
    @Override
    public Phone getPhone() {
        return new XiaomiPhone();
    }

    @Override
    public Earphones getEarphones() {
        return new XiaomiEarphones();
    }

    @Override
    public SmartWatch getSmartWatch() {
        return new XiaomiWatch();
    }
}
