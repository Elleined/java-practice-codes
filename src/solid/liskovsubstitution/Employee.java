package solid.liskovsubstitution;

public abstract class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public Employee() {

    }

    public String getName() {
        return name;
    }

    protected abstract void goWork();
}
