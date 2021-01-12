/**
 * Represents a passenger boarding a plane
 */
public class Passenger {
    public String name;
    public Bag [] bags;
    private int bagCount;

    /**
     * Generates a passenger with a name who will end up boarding a plane
     * @param name passenger boarding a plane
     */
    public Passenger(String name) {
        this.name = name;
        bags = new Bag[5];
        bagCount = 0;
    }

    /**
     * Add a bag to the passengers possessions
     * @param bag Bag object
     */
    public void addBag(Bag bag) {
        bags[bagCount] = bag;
        bagCount++;
    }
}
