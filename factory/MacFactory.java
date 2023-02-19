package factory;

public class MacFactory implements Factory{
    @Override
    public Button createButton() {
        return new MacOsButton();
    }
}
