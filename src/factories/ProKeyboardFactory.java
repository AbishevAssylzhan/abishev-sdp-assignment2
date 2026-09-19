package factories;

import products.Keyboard;
import products.MechanicalKeyboard;

public class ProKeyboardFactory extends KeyboardFactory {
    private static final String DEFAULT_PRO_SWITCHES = "Cherry MX Red";

    @Override
    public Keyboard createKeyboard() {
        return new MechanicalKeyboard(DEFAULT_PRO_SWITCHES);
    }
}