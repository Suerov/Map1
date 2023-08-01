import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<Car,CarData> carHashMap = new HashMap<>();
        carHashMap.put(new Car(1,"EW324"),new CarData("2007","aAMG GTR",5000000,"Black."));
        for (Map.Entry<Car,CarData> entry : carHashMap.entrySet()) {
            Car key = entry.getKey();
            CarData value = entry.getValue();
            System.out.println("Ключ: " + key + ", Значение: " + value);
        }
    }
}