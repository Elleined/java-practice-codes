package solid.liskovsubstitution.manager;

public class TechnicalManager extends Manager {
    // All Manager methods are available here
    public TechnicalManager(String name) {
        super(name);
    }

    public TechnicalManager() {}

    public void maintainProduction() {
        System.out.println(this.getClass().getSimpleName() + " maintaining production");
    }

    public void constructSet() {
        System.out.println(this.getClass().getSimpleName() + " constructing set");
    }
}
