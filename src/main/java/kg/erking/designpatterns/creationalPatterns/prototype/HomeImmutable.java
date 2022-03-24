package kg.erking.designpatterns.creationalPatterns.prototype;

import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

@AllArgsConstructor
public class HomeImmutable{
    private Integer number;
    private String address;
    private CityMutable cityMutable;
    private List<String> offices;
    private List<FlatMutable> flatMutableList;

    public Integer getNumber() {
        return number;
    }

    public String getAddress() {
        return address;
    }

    public CityMutable getCityMutable() {
        if(Objects.isNull(cityMutable)) return null;
        return cityMutable.clone();
    }

    public List<String> getOffices() {
        if(Objects.isNull(offices)) return null;
//        List<String> officesCloneList = new ArrayList<>();
//        officesCloneList.addAll(offices);
//        return officesCloneList;
        return Collections.unmodifiableList(offices);
    }

    public List<FlatMutable> getFlatMutableList() {
        if(Objects.isNull(flatMutableList)) return null;
        List<FlatMutable> flatMutableListWithClones = new ArrayList<>();
        flatMutableList.forEach(flatMutable -> {
            flatMutableListWithClones.add(flatMutable.clone());
        });
        return Collections.unmodifiableList(flatMutableListWithClones);
    }
}
