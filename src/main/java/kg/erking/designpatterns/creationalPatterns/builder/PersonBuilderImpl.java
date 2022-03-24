package kg.erking.designpatterns.creationalPatterns.builder;

public class PersonBuilderImpl implements PersonBuilder{
    private Person person = new Person();

    @Override
    public PersonBuilder fistName(String firstName) {
        person.setFistName(firstName);
        return this;
    }

    @Override
    public PersonBuilder lastName(String lastName) {
        person.setLastName(lastName);
        return this;
    }

    @Override
    public PersonBuilder age(Integer age) {
        person.setAge(age);
        return this;
    }

    @Override
    public PersonBuilder address(String address) {
        person.setAddress(address);
        return this;
    }

    @Override
    public PersonBuilder gender(Gender gender) {
        person.setGender(gender);
        return this;
    }

    @Override
    public Person build() {
        return person;
    }
}
