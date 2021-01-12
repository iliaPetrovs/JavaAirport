/**
 * Represents an Airport with a name, containing planes, gates and terminals
 */
public class Airport {
    String airportName;
    Plane planes[];
    int planeCounter;
    int gates;
    int terminals;

    /**
     * Generates an airport with a name
     * @param name as an airport code
     */

    public Airport(String name) {
       this.airportName = name;
        planes = new Plane[5];
    }

    /**
     * Add a plane to the airport
     * @param plane Plane object
     */
    public void addPlane(Plane plane) {
        planes[planeCounter] = plane;
        planeCounter++;
    }

}
