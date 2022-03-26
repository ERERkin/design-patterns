package kg.erking.designpatterns.structuralPatterns.adapter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AdapterTest {
    @Test
    void jobOfOfficeWorker() {
        OfficeWorker officeWorker = new OfficeWorker();
        String actual = new Job().doJob(officeWorker);

        Assertions.assertEquals(OfficeWorker.OFFICE_WORKER_WORKS, actual);
    }

    @Test
    void jobOfJavaDeveloper() {
        JavaDeveloper javaDeveloper = new JavaDeveloper();
        DeveloperWrap developerWrap = new DeveloperWrap(javaDeveloper);
        String actual = new Job().doJob(developerWrap);

        Assertions.assertEquals(JavaDeveloper.JAVA_DEVELOPER_DEVELOPS_APPLICATION, actual);
    }
}