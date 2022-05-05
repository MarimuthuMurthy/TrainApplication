import javax.swing.text.TabableView;
import java.util.*;
class train{
    String trainName;
    int trainCapacity;
    List<String> stations;
    List<Seat> seats;
    train(String trainName , int capacity , List<String> stations){
        this.trainName = trainName;
        this.trainCapacity = capacity;
        this.stations = stations;
        seats = new ArrayList<>(capacity);
    }
}
