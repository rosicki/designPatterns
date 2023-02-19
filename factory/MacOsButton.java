package factory;

public class MacOsButton implements Button{
    @Override
    public void paint() {
        System.out.println("Mac");
    }
}
