package kg.erking.designpatterns.structuralPatterns.adapter;

public class OfficeWorker implements Worker{
    public static final String OFFICE_WORKER_WORKS = "Office worker works";

    @Override
    public String work() {
        return OFFICE_WORKER_WORKS;
    }
}
