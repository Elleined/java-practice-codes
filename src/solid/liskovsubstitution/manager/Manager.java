package solid.liskovsubstitution.manager;

import solid.liskovsubstitution.Employee;

public abstract class Manager extends Employee implements ManagerDoing {

    public Manager(String name) {
        super(name);
    }

    public Manager() {

    }

    @Override
    public void goWork() {
        System.out.println(this.getClass().getSimpleName() + " going work");
    }

    @Override
    public void commandStaff(Employee staff) {
        System.out.println(this.getClass().getSimpleName() + " commanding staff " + staff.getName());
    }

    @Override
    public void createReport() {
        System.out.println(this.getClass().getSimpleName() + " creating report");
    }

    @Override
    public void goMeeting() {
        System.out.println(this.getClass().getSimpleName() + " going meeting");
    }
}
