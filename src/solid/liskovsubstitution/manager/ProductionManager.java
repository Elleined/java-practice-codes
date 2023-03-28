package solid.liskovsubstitution.manager;

public class ProductionManager extends Manager {
    // All Manager methods are available here
    public ProductionManager(String name) {
        super(name);
    }

    public ProductionManager() {}


    public void makeTour() {
        System.out.println(this.getClass().getSimpleName() + " making tour");
    }

    public void hireCrew() {
        System.out.println(this.getClass().getSimpleName() + " hiring crew");
    }

    public void setupWorkPlace() {
        System.out.println(this.getClass().getSimpleName() + " setting up workplace");
    }
}
