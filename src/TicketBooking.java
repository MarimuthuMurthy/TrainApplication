import java.util.*;
 class Ticket {
    String trainName;
    int pnrNumber;
    String fromStation;
    String toStation;
    int seatNumber;
    List<Passenger> passengers;
    public Ticket(int pnrNumber , String fromStation , String toStation , String trainName){
        this.pnrNumber = pnrNumber;
        this.fromStation = fromStation;
        this.toStation = toStation;
        this.trainName = trainName;
    }
    public void setPassengers(List<Passenger> passengers){
        this.passengers = passengers;
    }
}
class Booking{
     static List<Ticket> confirmedTickets = new ArrayList<>();
}