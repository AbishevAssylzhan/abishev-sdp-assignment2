package factories;

import products.Keyboard;
import products.MembraneKeyboard;

public class StandardKeyboardFactory extends KeyboardFactory {
    @Override
    public Keyboard createKeyboard() {
        return new MembraneKeyboard();
    }
}