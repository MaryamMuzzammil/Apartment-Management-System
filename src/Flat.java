
public class Flat {
    private int flatNumber;
    private int numberOfRooms;
    private int floor;
    private double rent;
    private boolean available;

    public Flat(int flatNumber, int numberOfRooms, int floor, double rent, boolean available) {
        this.flatNumber = flatNumber;
        this.numberOfRooms = numberOfRooms;
        this.floor = floor;
        this.rent = rent;
        this.available = available;
    }

    public int getFlatNumber() {
        return flatNumber;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public int getFloor() {
        return floor;
    }

    public double getRent() {
        return rent;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}

