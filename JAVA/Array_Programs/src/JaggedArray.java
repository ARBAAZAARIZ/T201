import java.util.Arrays;

public class JaggedArray {
    public static void main(String[] args) {
        int data[][]=new int[2][];
        data[0]=new int[3];
        data[1]=new int[5];

        data[0][0]= 10;
        data[0][1]= 20;
        data[0][2]= 30;

        data[1][0]=11;
        data[1][1]=21;
        data[1][2]=31;
        data[1][3]=41;
        data[1][4]=51;

//        to print 2d array using command
        System.out.println(Arrays.deepToString(data));

        for (int i = 0; i <data.length ; i++) {
            for (int j = 0; j <data[i].length ; j++) {
                System.out.print(data[i][j] + "   ");
            }
            System.out.println();
        }

    }
}
