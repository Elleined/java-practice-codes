package solid.liskovsubstitution.manager;

import solid.liskovsubstitution.Employee;

public interface ManagerDoing {
    void commandStaff(Employee staff);
    void createReport();
    void goMeeting();
}
