package waste;

import java.util.ArrayList;
import java.util.List;

public class Waste1 {
    public static void main(String[] args) {
        int a=2;
        int b=2;
        int n=6;
        double currsum=a;

        for (int i = 0; i <=n ; i++) {
            currsum=currsum+((Math.pow(2, i))*b);
            System.out.print(currsum + "  ,  ");
        }
    }
}
