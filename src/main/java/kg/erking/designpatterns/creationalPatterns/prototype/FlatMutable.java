package kg.erking.designpatterns.creationalPatterns.prototype;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class FlatMutable implements Cloneable{
    private Integer number;

    @Override
    public FlatMutable clone() {
        try {
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return (FlatMutable) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
