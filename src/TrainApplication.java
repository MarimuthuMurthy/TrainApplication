import java.util.*;

public class TrainApplication {
    static train train1 = new train("train1" , 8 , Stations.train1Stations);
    static train train2 = new train("train2" , 8 , Stations.train2Stations);
    public static String trainName(String from,String to)
    {
        if(train1.stations.contains(from) && train1.stations.contains(to)){
            return train1.trainName;
        }
        if(train2.stations.contains(from) && train2.stations.contains(to)){
            return train2.trainName;
        }
        return null;
    }
    public static int Allocations(String from , String to) {
        if (Booking.confirmedTickets.isEmpty()) {
            return 1;
        } else {
            
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("press 1 : BookTicket" + "\n" +
                "press 2 : CancelTicket" + "\n" +
                "press 3 : Print Occupancy Chart" + "\n" +
                "press 4 : exit");
        int choice = sc.nextInt();
        switch (choice)
        {
            case 1:
                System.out.print("Enter from station : ");
                String fromStation = sc.next();
                System.out.print("Enter to Station : ");
                String toStation = sc.next();
                if(Allocations(fromStation , toStation)==1) {
                    String trainName = trainName(fromStation , toStation);
                    System.out.print("Number of passengers : ");
                    int numberOfPassengers = sc.nextInt();
                    List<Passenger> passengers = new ArrayList<>();
                    if (numberOfPassengers > 8) {
                        System.out.println("Sorry!!!!you cant ");
                    } else {
                        for (int i = 0; i < numberOfPassengers; i++) {
                            System.out.print("Enter the name : ");
                            String passengerName = sc.next();
                            System.out.println("Enter the age : ");
                            int age = sc.nextInt();
                            passengers.add(new Passenger(passengerName, age));
                        }
                        Ticket ticket = new Ticket(12345, fromStation, toStation , trainName);
                        ticket.setPassengers(passengers);
                        break;
                    }
                }
                else{

                }
        }
    }
}
