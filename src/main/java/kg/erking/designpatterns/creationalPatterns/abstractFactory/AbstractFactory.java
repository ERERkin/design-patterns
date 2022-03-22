package kg.erking.designpatterns.creationalPatterns.abstractFactory;

import java.util.ArrayList;
import java.util.List;

public class AbstractFactory {
    static List<String> getAnswer(PhoneSetFactory phoneSetFactory){
        List<String> list = new ArrayList<>();
        list.add(phoneSetFactory.getPhone().call());
        list.add(phoneSetFactory.getEarphones().listenToMusic());
        list.add(phoneSetFactory.getSmartWatch().lookAtWatch());
        return list;
    }
}
