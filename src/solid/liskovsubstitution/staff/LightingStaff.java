package solid.liskovsubstitution.staff;

public class LightingStaff extends Staff {
    // All Staff methods are available here
    public LightingStaff(String name) {
        super(name);
    }

    public LightingStaff() {

    }

    public void light() {
        System.out.println(this.getClass().getSimpleName() + " lighting workplace");
    }

    public void setupLighting() {
        System.out.println(this.getClass().getSimpleName() + " setting up lights");
    }
}
