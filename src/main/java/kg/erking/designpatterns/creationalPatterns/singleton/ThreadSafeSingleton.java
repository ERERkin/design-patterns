package kg.erking.designpatterns.creationalPatterns.singleton;

public class ThreadSafeSingleton {
    //add volatile
    private volatile static ThreadSafeSingleton instance;

    private ThreadSafeSingleton(){}

    //double check
    public static ThreadSafeSingleton getInstanceUsingDoubleLocking(){
        if(instance == null){
            synchronized (ThreadSafeSingleton.class) {
                if(instance == null){
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }
}
