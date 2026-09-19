# Software Design Patterns - Assignment #2

Student: Abishev Assylzhan  
Group: SE-2512  
Topic: Computer Club Equipment Management System 

---

## Project Structure & Architecture
The project is strictly structured into packages following the Single Responsibility Principle:
* `products` — Contains core interfaces (`Keyboard`, `Mouse`, `Monitor`) and their concrete implementations (`MembraneKeyboard`, `MechanicalKeyboard`, `StandardMouse`, `EsportsMouse`, `Monitor60Hz`, `Monitor144Hz`).
* `factories` — Contains the **Factory Method** implementations (`KeyboardFactory` hierarchy) and **Abstract Factory** implementations (`GamingSetupFactory`, `StandardSetupFactory`, `BootcampSetupFactory`).

## Clean Code Principles Applied
1. **Meaningful, intention-revealing names:** Classes and methods use descriptive names that reveal their intent (`BootcampSetupFactory`, `EsportsMouse`, `createKeyboard`).
2. **Validated construction:** Defensive programming is used inside constructors, throwing `IllegalArgumentException` for invalid parameters (refresh rate below 144Hz for VIP monitors or empty switch types).
3. **No magic numbers/strings:** Hardcoded values are extracted into clear, named constants (`VIP_MONITOR_HZ = 144`, `DEFAULT_PRO_SWITCHES = "Cherry MX Red"`).
4. **Small methods, each doing one thing:** Methods are compact and focused. Dependency injection via constructors is used in `ComputerClubManager`.
5. **Consistent formatting and small, focused classes:** Clear separation of concerns between product creation logic and business workflows across dedicated packages.
