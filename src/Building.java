public class Building {
    private String userName = "admin";
    private String password;
    private int booking;
    private boolean available;
    private String flatNumber;

    void login(String username) {
        if (username.equalsIgnoreCase(userName)) {
            System.out.println("Login successful");
        } else {
            System.out.println("wrong email / password");
        }
    }
   


    private class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node<Flat> flatsHead;
    private Node<Tenant> residentsHead;

    void rent() {
        addFlat(new Flat(1, 3, 1, 20000, false));
        addFlat(new Flat(2, 2, 1, 20000, true));
        addFlat(new Flat(3, 3, 1, 28000, false));
        addFlat(new Flat(4, 3, 1, 25000, true));
        addFlat(new Flat(5, 2, 1, 20000, false));

        displayFlats();
    }

    void showResidents() {
    	
        addResident(new Tenant("Ali", 30, true , true , true , "20-11-2023" , "21-11-2023" ));
       
        addResident(new Tenant("Chacha Raheem", 45, true ,  true , false , "11-11-2023" , "-"));
     
        addResident(new Tenant("Tution wali baaji", 35, true ,  false , true , "-" , "2-11-2023"));

        displayResidents();
        Tenant.tempTenant();
       
    }

    private void addFlat(Flat flat) {
        Node<Flat> newNode = new Node<>(flat);

        if (flatsHead == null) {
            flatsHead = newNode;
        } else {
            Node<Flat> current = flatsHead;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    void displayFlats() {
        System.out.println(" ~~~~ Flats Information ~~~~\n");
        Node<Flat> current = flatsHead;
        while (current != null) {
            System.out.println("Flat Number: " + current.data.getFlatNumber());
            System.out.println("Number of Rooms: " + current.data.getNumberOfRooms());
            System.out.println("Floor: " + current.data.getFloor());
            System.out.println("Rent: " + current.data.getRent());
            System.out.println("Availability: " + (current.data.isAvailable() ? "Available" : "Not Available"));
            System.out.println("---------------------------------------");
            current = current.next;
        }
    }

    private void addResident(Tenant resident) {
        Node<Tenant> newNode = new Node<>(resident);
        if (residentsHead == null) {
            residentsHead = newNode;
        } else {
            Node<Tenant> current = residentsHead;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    private void displayResidents() {
        System.out.println(" ~~~~ Residents Information ~~~~\n");
        Node<Tenant> current = residentsHead;
        int index = 0;
        while (current != null) {
            if (current.data != null) {
                System.out.println("Resident " + (index + 1) + ":");
                current.data.tanentInfo();
                System.out.println("---------------------------------------");
            }
            current = current.next;
            index++;
        }
    }
}
