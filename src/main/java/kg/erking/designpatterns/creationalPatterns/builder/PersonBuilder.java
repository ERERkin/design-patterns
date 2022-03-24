package kg.erking.designpatterns.creationalPatterns.builder;

public interface PersonBuilder {
    PersonBuilder fistName(String firstName);
    PersonBuilder lastName(String lastName);
    PersonBuilder age(Integer age);
    PersonBuilder address(String address);
    PersonBuilder gender(Gender gender);
    Person build();
}
