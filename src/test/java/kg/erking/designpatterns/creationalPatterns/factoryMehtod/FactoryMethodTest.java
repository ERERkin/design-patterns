package kg.erking.designpatterns.creationalPatterns.factoryMehtod;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FactoryMethodTest {

    @Test
    void factoryMethodTestNo1() {
        EmployeeFactory employeeFactory = FactoryMethod.createEmployeeBySpecialty(EmployeeSpecialty.DEVELOPER);
        Employee employee = employeeFactory.createEmployee();
        String actual = employee.work();
        Assertions.assertEquals("Create application" , actual);
    }

    @Test
    void factoryMethodTestNo2() {
        EmployeeFactory employeeFactory = FactoryMethod.createEmployeeBySpecialty(EmployeeSpecialty.QA_Engineer);
        Employee employee = employeeFactory.createEmployee();
        String actual = employee.work();
        Assertions.assertEquals("Test application" , actual);
    }

    @Test
    void factoryMethodTestNo3() {
        Exception exception = assertThrows(RuntimeException.class, () ->
                FactoryMethod.createEmployeeBySpecialty(EmployeeSpecialty.ANY_ANOTHER_EMPLOYEE));
        assertEquals(EmployeeSpecialty.ANY_ANOTHER_EMPLOYEE.name() + " is unknown specialty", exception.getMessage());
    }
}