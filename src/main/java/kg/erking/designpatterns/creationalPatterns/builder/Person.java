package kg.erking.designpatterns.creationalPatterns.builder;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Person {
    private String fistName;
    private String lastName;
    private Integer age;
    private String address;
    private Gender gender;
}
