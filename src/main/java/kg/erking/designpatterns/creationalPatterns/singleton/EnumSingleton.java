package kg.erking.designpatterns.creationalPatterns.singleton;

public enum EnumSingleton {
    INSTANCE;

    public static void doSomething(){
        System.out.println("Create singleton " + INSTANCE);
    }
}
