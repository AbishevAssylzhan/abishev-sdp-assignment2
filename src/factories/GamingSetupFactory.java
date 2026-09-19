package factories;

import products.Keyboard;
import products.Monitor;
import products.Mouse;

public interface GamingSetupFactory {
    Keyboard createKeyboard();
    Mouse createMouse();
    Monitor createMonitor();
}