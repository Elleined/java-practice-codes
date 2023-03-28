package solid;
import solid.liskovsubstitution.Employee;
import solid.liskovsubstitution.manager.*;
import solid.liskovsubstitution.staff.*;

public class Main {
    public static void main(String[] args) {
        Manager manager = new RoadManager();
        Staff staff = new CameraOperatorStaff();
        ManagerDoing managerDoing = new TechnicalManager();
        StaffDoing staffDoing = new StuntDoubleStaff();
        System.out.println("------Manager accessing via interface reference variable-----");
        managerDoing.commandStaff(staff);
        managerDoing.createReport();
        managerDoing.goMeeting();
        System.out.println("------Staff accessing via interface reference variable-----");
        staffDoing.obeyManager(manager);
        staffDoing.report();
        System.out.println("------Manager accessing via class reference variable-----");
        manager.goWork();
        manager.commandStaff(staff);
        manager.createReport();
        manager.goMeeting();
        System.out.println("------Staff accessing via class reference variable-----");
        staff.goWork();
        staff.obeyManager(manager);
        staff.report();
        System.out.println("------End of Sample------");
    }
}
