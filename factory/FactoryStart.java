package factory;

public class FactoryStart {
    public static void main(String[] args) {


        String system = "windows";
        Factory factory;
        if ("windows".equals(system)) {
            factory = new WindowsFactory();
        } else {
            factory = new MacFactory();
        }
        factory.createButton().paint();
    }
}
