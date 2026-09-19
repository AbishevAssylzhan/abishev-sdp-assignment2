package factories;

import products.*;

public class BootcampSetupFactory implements GamingSetupFactory {
    private static final String VIP_SWITCHES = "Cherry MX Red";
    private static final int VIP_MOUSE_DPI = 800;
    private static final int VIP_MONITOR_HZ = 144;

    @Override
    public Keyboard createKeyboard() {
        return new MechanicalKeyboard(VIP_SWITCHES);
    }

    @Override
    public Mouse createMouse() {
        return new EsportsMouse(VIP_MOUSE_DPI);
    }

    @Override
    public Monitor createMonitor() {
        return new Monitor144Hz(VIP_MONITOR_HZ);
    }
}