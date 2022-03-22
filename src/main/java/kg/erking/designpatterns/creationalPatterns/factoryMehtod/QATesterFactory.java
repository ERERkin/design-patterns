package kg.erking.designpatterns.creationalPatterns.factoryMehtod;

public class QATesterFactory implements EmployeeFactory{
    @Override
    public Employee createEmployee() {
        return new QATester();
    }
}
