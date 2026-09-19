import factories.BootcampSetupFactory;
import factories.StandardSetupFactory;
import factories.GamingSetupFactory;
import factories.KeyboardFactory;
import factories.StandardKeyboardFactory;

public class Main {
    public static void main(String[] args) {
        //A
        System.out.println("pA");
        KeyboardFactory standardKbFactory = new StandardKeyboardFactory();
        standardKbFactory.testKeyboard();
        System.out.println();

        //B
        System.out.println("pB");

        System.out.println("Client booked a Standard Room:");
        GamingSetupFactory standardFactory = new StandardSetupFactory();
        ComputerClubManager standardRoom = new ComputerClubManager(standardFactory);
        standardRoom.prepareSetup();

        System.out.println("Client booked a VIP Bootcamp Room:");
        GamingSetupFactory bootcampFactory = new BootcampSetupFactory();
        ComputerClubManager vipRoom = new ComputerClubManager(bootcampFactory);
        vipRoom.prepareSetup();
    }
}