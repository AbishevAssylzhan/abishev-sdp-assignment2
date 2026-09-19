package products;

public class MechanicalKeyboard implements Keyboard {
    private final String switchType;

    public MechanicalKeyboard(String switchType) {
        if (switchType == null || switchType.trim().isEmpty()) {
            throw new IllegalArgumentException("Switch type cannot be null or empty.");
        }
        this.switchType = switchType;
    }

    @Override
    public void connect() {
        System.out.println("Mechanical keyboard connected with switches: " + switchType);
    }
}