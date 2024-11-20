import Model.Routes;
import Model.Train;

import java.util.HashMap;
import java.util.Map;

public class wasteClass {
    public static void main(String[] args) {
        HashMap<Integer, Train> trainHashMap = new HashMap<>();
        trainHashMap.put(12101, new Train(12101,
                "JANANESWARI EXP",             //train 1 down
                Routes.lokmanyatilak,Routes.kolkata,
                72));


        trainHashMap.put(12102, new Train(12102,
                "JANANESWARI EXP",              // train 1 up
                Routes.kolkata,Routes.lokmanyatilak,
                72));

        for(Map.Entry<Integer,Train> entry:trainHashMap.entrySet()){
            System.out.println();
        }

    }
}
