package kg.erking.designpatterns.creationalPatterns.abstractFactory;

public interface PhoneSetFactory {
    Phone getPhone();

    Earphones getEarphones();

    SmartWatch getSmartWatch();
}
