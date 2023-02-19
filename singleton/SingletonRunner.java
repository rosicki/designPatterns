package singleton;

public class SingletonRunner {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance("COS");
        Singleton singleton2 = Singleton.getInstance("COS2");
        //
        System.out.println(singleton.value);
        System.out.println(singleton2.value);

    }
}
