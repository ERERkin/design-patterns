package kg.erking.designpatterns.creationalPatterns.factoryMehtod;

public class FactoryMethod {
    static EmployeeFactory createEmployeeBySpecialty (EmployeeSpecialty specialty){
        if(specialty.getValue() == 1) return new DeveloperFactory();
        else if(specialty.getValue() == 2) return new QAEngineerFactory();
        throw new RuntimeException(specialty.name() + " is unknown specialty");
    }
}
