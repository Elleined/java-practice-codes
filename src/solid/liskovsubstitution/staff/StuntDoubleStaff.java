package solid.liskovsubstitution.staff;

public class StuntDoubleStaff extends Staff {
    // All Staff methods are available here
    public StuntDoubleStaff(String name) {
        super(name);
    }

    public StuntDoubleStaff() {

    }

    public void replaceActor() {
        System.out.println(this.getClass().getSimpleName() + " replacing actor");
    }

    public void jumpToBuilding() {
        System.out.println(this.getClass().getSimpleName() + " jump building");
    }
}
