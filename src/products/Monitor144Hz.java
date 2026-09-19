package products;

public class Monitor144Hz implements Monitor {
    private final int refreshRate;

    public Monitor144Hz(int refreshRate) {
        // Clean Code principle: Validated construction & No magic numbers
        if (refreshRate < 144) {
            throw new IllegalArgumentException("VIP monitor must have at least 144Hz refresh rate.");
        }
        this.refreshRate = refreshRate;
    }

    @Override
    public void turnOn() {
        System.out.println("Gaming monitor turned on (" + refreshRate + "Hz).");
    }
}