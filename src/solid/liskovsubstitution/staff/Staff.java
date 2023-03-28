package solid.liskovsubstitution.staff;
import solid.liskovsubstitution.Employee;

public abstract class Staff extends Employee implements StaffDoing {

    public Staff(String name) {
        super(name);
    }

    public Staff() {
    }

    @Override
    public void goWork() {
        System.out.println(this.getClass().getSimpleName() + " going work");
    }

    @Override
    public void obeyManager(Employee manager) {
        System.out.println(this.getClass().getSimpleName() + " obeying manager " + manager.getName());
    }

    @Override
    public void report() {
        System.out.println(this.getClass().getSimpleName() + " reporting");
    }
}
