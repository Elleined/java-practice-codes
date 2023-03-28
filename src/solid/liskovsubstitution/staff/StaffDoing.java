package solid.liskovsubstitution.staff;

import solid.liskovsubstitution.Employee;

public interface StaffDoing {
    void obeyManager(Employee manager);
    void report();
}
