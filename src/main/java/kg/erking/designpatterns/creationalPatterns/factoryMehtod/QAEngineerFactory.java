package kg.erking.designpatterns.creationalPatterns.factoryMehtod;

public class QAEngineerFactory implements EmployeeFactory{
    @Override
    public Employee createEmployee() {
        return new QAEngineer();
    }
}
