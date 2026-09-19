package factories;

import products.*;

public class StandardSetupFactory implements GamingSetupFactory {
    @Override
    public Keyboard createKeyboard() {
        return new MembraneKeyboard();
    }

    @Override
    public Mouse createMouse() {
        return new StandardMouse();
    }

    @Override
    public Monitor createMonitor() {
        return new Monitor60Hz();
    }
}