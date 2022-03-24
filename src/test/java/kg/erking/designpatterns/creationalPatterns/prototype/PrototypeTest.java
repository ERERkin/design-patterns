package kg.erking.designpatterns.creationalPatterns.prototype;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PrototypeTest {
    @Test
    void compareCityMutableField() {
        HomeImmutable homeImmutable = createHomeImmutable();

        CityMutable cityMutableOne = homeImmutable.getCityMutable();
        CityMutable cityMutableTwo = homeImmutable.getCityMutable();

        Assertions.assertEquals(cityMutableOne.getName(), cityMutableTwo.getName());
        System.out.println(cityMutableOne.hashCode());
        System.out.println(cityMutableTwo.hashCode());
        Assertions.assertNotEquals(cityMutableOne.hashCode(), cityMutableTwo.hashCode());
    }

    @Test
    void compareOfficesField() {
        HomeImmutable homeImmutable = createHomeImmutable();

        List<String> listOfficesOne = homeImmutable.getOffices();
        List<String> listOfficesTwo = homeImmutable.getOffices();

        Assertions.assertEquals(listOfficesOne.size(), listOfficesTwo.size());
        if(listOfficesOne.size() == listOfficesTwo.size()) {
            for(int i = 0; i < listOfficesOne.size(); i++){
                Assertions.assertEquals(listOfficesOne.get(i), listOfficesTwo.get(i));
            }
        }
    }

    @Test
    void compareFlatMutableListField() {
        HomeImmutable homeImmutable = createHomeImmutable();

        List<FlatMutable> flatMutableListOne = homeImmutable.getFlatMutableList();
        List<FlatMutable> flatMutableListTwo = homeImmutable.getFlatMutableList();

        Assertions.assertEquals(flatMutableListOne.size(), flatMutableListTwo.size());
        if(flatMutableListOne.size() == flatMutableListTwo.size()) {
            for(int i = 0; i < flatMutableListOne.size(); i++){
                FlatMutable flatMutableOne = flatMutableListOne.get(i);
                FlatMutable flatMutableTwo = flatMutableListTwo.get(i);

                Assertions.assertEquals(flatMutableOne.getNumber(), flatMutableTwo.getNumber());
                Assertions.assertNotEquals(flatMutableOne.hashCode(), flatMutableTwo.hashCode());
            }
        }
    }

    private HomeImmutable createHomeImmutable() {
        return new HomeImmutable(1, "st. Java", createCityMutable(), createStringOfficesList(), createFlatMutableList());
    }

    private CityMutable createCityMutable() {
        return new CityMutable("Bishkek");
    }

    private List<String> createStringOfficesList(){
        List<String> answer = new ArrayList<>();
        answer.add("First office");
        answer.add("Second office");
        answer.add("Third office");
        return answer;
    }

    private List<FlatMutable> createFlatMutableList(){
        List<FlatMutable> answer = new ArrayList<>();
        answer.add(new FlatMutable(1));
        answer.add(new FlatMutable(2));
        answer.add(new FlatMutable(3));
        return answer;
    }
}