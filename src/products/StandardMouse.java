package products;

public class StandardMouse implements Mouse {
    @Override
    public void connect() {
        System.out.println("Standard office mouse connected (800 DPI).");
    }
}