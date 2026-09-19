import factories.GamingSetupFactory;
import products.Keyboard;
import products.Monitor;
import products.Mouse;

public class ComputerClubManager {
    private final Keyboard keyboard;
    private final Mouse mouse;
    private final Monitor monitor;

    public ComputerClubManager(GamingSetupFactory factory) {
        this.keyboard = factory.createKeyboard();
        this.mouse = factory.createMouse();
        this.monitor = factory.createMonitor();
    }

    public void prepareSetup() {
        System.out.println("Preparing Gaming Setup");
        monitor.turnOn();
        keyboard.connect();
        mouse.connect();
        System.out.println("---\n");
    }
}