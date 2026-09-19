package products;

public class EsportsMouse implements Mouse {
    private final int dpi;

    public EsportsMouse(int dpi) {
        if (dpi < 400 || dpi > 32000) {
            throw new IllegalArgumentException("Invalid DPI value for an esports mouse.");
        }
        this.dpi = dpi;
    }

    @Override
    public void connect() {
        System.out.println("Esports mouse connected (DPI: " + dpi + ").");
    }
}