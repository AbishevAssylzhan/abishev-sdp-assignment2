package factories;

import products.Keyboard;

public abstract class KeyboardFactory {
    public abstract Keyboard createKeyboard();

    public void testKeyboard() {
        Keyboard keyboard = createKeyboard();
        System.out.println("Testing the device before providing it to the client...");
        keyboard.connect();
    }
}