package products;

public class MembraneKeyboard implements Keyboard {
    @Override
    public void connect() {
        System.out.println("Standard membrane keyboard connected (quiet typing).");
    }
}