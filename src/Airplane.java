import java.util.HashMap;

public class Airplane {

    private String id;
    private int capacity;
    private HashMap<String, String> trasa;

    //nove letadlo s novym zaznamem letu
    public Airplane(String id, int capacity) {
        this.id = id;
        this.capacity = capacity;
        trasa = new HashMap<String, String>() {
        };
    }

    //pridani letu pro letadlo
    //unikatni klic je cely let odkud-kam
    // hodnota pak ID letadla (muze byt duplicitni)
    public void addFlight( String odkud, String kam) {

        String formatString = odkud + "-" + kam;
        trasa.put(formatString, getId());
    }

    public String getId() {
        return id;
    }

    public int getCapacity() {
        return capacity;
    }


    public String getFlights(){

//        for (String value : trasa.values())
            return "";
    }

    public void printFlights() {
        for (String value : trasa.keySet()) {
            System.out.println(trasa.get(value) + " (" + getCapacity() + " ppl) (" + value + ")");
        }


    }

    @Override
    public String toString() {
        return getId() + " (" + getCapacity() + " ppl) ";
    }
}
