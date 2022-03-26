package kg.erking.designpatterns.structuralPatterns.adapter;

public class Job {
    String doJob(Worker worker){
        return worker.work();
    }
}
