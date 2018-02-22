public class Flight {

    private String source;
    private String destination;
    private Airplane plane;

    public Flight(String source, String destination, Airplane plane) {
        this.source = source;
        this.destination = destination;
        this.plane = plane;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

    public Airplane getPlane() {
        return plane;
    }

    @Override
    public String toString() {
        return plane.toString() + " (" + getSource() + "-" + getDestination() + ")";
    }
}