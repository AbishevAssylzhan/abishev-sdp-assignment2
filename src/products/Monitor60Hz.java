package products;

public class Monitor60Hz implements Monitor {
    @Override
    public void turnOn() {
        System.out.println("Standard monitor turned on (60Hz).");
    }
}