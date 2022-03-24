package kg.erking.designpatterns.creationalPatterns.prototype;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class CityMutable implements Cloneable{
    @Getter
    private String name;

    @Override
    public CityMutable clone() {
        try {
            return (CityMutable) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
