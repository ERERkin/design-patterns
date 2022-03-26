package kg.erking.designpatterns.structuralPatterns.adapter;

public class DeveloperWrap implements Worker{
    Developer developer;

    public DeveloperWrap(Developer developer) {
        this.developer = developer;
    }

    @Override
    public String work() {
        return developer.develop();
    }
}
