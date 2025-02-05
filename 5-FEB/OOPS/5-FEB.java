import java.util.*;

class Train {
    private String route;
    private int availableSeats;

    public Train(String route, int availableSeats) {
        this.route = route;
        this.availableSeats = availableSeats;
    }

    public String getRoute() {
        return route;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public boolean bookSeat() {
        if (availableSeats > 0) {
            availableSeats--;
            return true;
        }
        return false;
    }

    public void cancelSeat() {
        availableSeats++;
    }
}

class Customer {
    private String name;
    private int age;
    private String gender;
    private long contactNumber;

    public Customer(String name, int age, String gender, long contactNumber) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.contactNumber = contactNumber;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public long getContactNumber() {
        return contactNumber;
    }
}

class Ticket {
    private static int nextPNR = 1000;
    private int pnr;
    private String seatKey;
    private Customer customer;

    public Ticket(String seatKey, Customer customer) {
        this.pnr = nextPNR++;
        this.seatKey = seatKey;
        this.customer = customer;
    }

    public int getPnr() {
        return pnr;
    }

    public String getSeatKey() {
        return seatKey;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void cancel() {
        nextPNR--;
    }
}

class RailwaySystem {
    private List<Train> trains;
    private Set<Long> registeredNumbers;
    private Set<String> bookedSeats;
    private Scanner scanner;

    public RailwaySystem() {
        trains = new ArrayList<>();
        registeredNumbers = new HashSet<>();
        bookedSeats = new HashSet<>();
        scanner = new Scanner(System.in);
        initializeTrains();
    }

    private void initializeTrains() {
        trains.add(new Train("Delhi -> Mumbai", 240));
        trains.add(new Train("Delhi -> Kolkata", 240));
        trains.add(new Train("Ghaziabad -> Kathgodam", 240));
        trains.add(new Train("Manipur -> Assam", 240));
        trains.add(new Train("UP -> Ghazipur", 240));
        trains.add(new Train("Maharashtra -> Chandigarh", 240));
    }

    public void displayTrains() {
        System.out.println("\nAvailable Trains:");
        for (int i = 0; i < trains.size(); i++) {
            System.out.println(i + ". " + trains.get(i).getRoute() + " - Seats Available: " + trains.get(i).getAvailableSeats());
        }
    }

    public void bookTicket() {
        displayTrains();
        System.out.println("Please enter the train's number:");
        int trainNumber = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        if (trainNumber < 0 || trainNumber >= trains.size()) {
            System.out.println("Invalid train number.");
            return;
        }

        Train selectedTrain = trains.get(trainNumber);
        if (!selectedTrain.bookSeat()) {
            System.out.println("No seats available on this train.");
            return;
        }

        System.out.println("Please Enter Coach:");
        String coach = scanner.nextLine();

        System.out.println("Please Enter Coach Number:");
        int coachNumber = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.println("Please Enter Seat Number:");
        String seatNumber = scanner.nextLine();

        String seatKey = coach + "," + coachNumber + "," + seatNumber;
        if (bookedSeats.contains(seatKey)) {
            System.out.println("The coach and seat have already been booked.");
            selectedTrain.cancelSeat();
            return;
        }

        bookedSeats.add(seatKey);

        System.out.println("Please Enter your Name:");
        String name = scanner.nextLine();

        System.out.println("Please Enter your Age:");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.println("Please Enter your Gender:");
        String gender = scanner.nextLine();

        System.out.println("Please Enter your Contact Number:");
        long contactNumber = scanner.nextLong();
        scanner.nextLine(); // Consume newline

        if (registeredNumbers.contains(contactNumber)) {
            System.out.println("The user already exists.");
        } else {
            registeredNumbers.add(contactNumber);
        }

        Customer customer = new Customer(name, age, gender, contactNumber);
        Ticket ticket = new Ticket(seatKey, customer);

        showTicketDetails(ticket);

        System.out.println("If you wish to cancel the ticket, type 0. If you wish to continue, type 1.");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        if (choice == 0) {
            ticket.cancel();
            selectedTrain.cancelSeat();
            bookedSeats.remove(seatKey);
            System.out.println("Ticket has been canceled. Amount has been refunded.");
        }
    }

    private void showTicketDetails(Ticket ticket) {
        System.out.println("\nYour Ticket Details:");
        System.out.println("Name: " + ticket.getCustomer().getName());
        System.out.println("Age: " + ticket.getCustomer().getAge());
        System.out.println("Gender: " + ticket.getCustomer().getGender());
        System.out.println("Contact Number: " + ticket.getCustomer().getContactNumber());
        System.out.println("Seat Number: " + ticket.getSeatKey());
        System.out.println("PNR Number: " + ticket.getPnr());
    }

    public void start() {
        System.out.println("WELCOME TO RAILWAY TICKET BOOKING");
        boolean running = true;
        while (running) {
            bookTicket();
            System.out.println("Please type 'exit' if it's the last user, or press Enter to continue.");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                running = false;
            }
        }
        scanner.close();
    }
}

public class Main {
    public static void main(String[] args) {
        RailwaySystem railwaySystem = new RailwaySystem();
        railwaySystem.start();
    }
}