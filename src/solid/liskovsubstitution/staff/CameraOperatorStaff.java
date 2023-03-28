package solid.liskovsubstitution.staff;

public class CameraOperatorStaff extends Staff {
    // All Staff methods are available here

    public CameraOperatorStaff(String name) {
        super(name);
    }

    public CameraOperatorStaff() {

    }

    public void operateCamera() {
        System.out.println(this.getClass().getSimpleName() + " operating camera");
    }

    public void shoot() {
        System.out.println(this.getClass().getSimpleName() + " shooting camera");
    }
}
