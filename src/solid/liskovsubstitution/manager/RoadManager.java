package solid.liskovsubstitution.manager;

public class RoadManager extends Manager {
    // All Manager methods are available here
    public RoadManager(String name) {
        super(name);
    }

    public RoadManager() {

    }

    public void makeContract() {
        System.out.println(this.getClass().getSimpleName() + " making contract");
    }

    public void promoteArtist() {
        System.out.println(this.getClass().getSimpleName() + " promoting artist");
    }
}
