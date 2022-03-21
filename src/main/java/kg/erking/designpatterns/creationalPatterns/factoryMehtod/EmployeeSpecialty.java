package kg.erking.designpatterns.creationalPatterns.factoryMehtod;

public enum EmployeeSpecialty {
    DEVELOPER(1), QA_Engineer(2), ANY_ANOTHER_EMPLOYEE(3);

    private final int value;

    EmployeeSpecialty(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
