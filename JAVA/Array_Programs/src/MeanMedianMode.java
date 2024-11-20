import java.util.Arrays;

public class MeanMedianMode {
    public double mean(double a[]){
        //        Mean of an array
        System.out.print("Mean of array : ");
        double sum=0;
        double mean;
        for(double num : a){
            sum+=num;
        }
        mean=sum/a.length;
        return mean;
    }

    public double median(double a[]){
        double temp;
        for (int i = 0; i <a.length ; i++) {
            for (int j = i+1; j <a.length ; j++) {
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));


        System.out.print("Median of array : ");
        double median=0;
        int length=a.length;
        int mid=length/2;
        if(length%2 !=0){
            median=a[mid-1];
        }
        else{
            median=((a[mid-1]+a[mid])/2);
        }


        return median;
    }

    public void mode(double a[]){
//        this temp array is to make copies of the original array and do operations
//        on duplicate array so by running operation on duplicate array it will not effect the
//        original array
        double temp[]=new double[a.length];
        for (int k = 0; k <a.length ; k++) {
            temp[k]=a[k];
        }
        double temp2[][]=new double [2][temp.length];



//        frequency counter
        int counter;
//        assuming that there in no 0 present all element are at least >=1
//        this loop is for to take out each element and check from other element
        for (int i = 0; i <temp.length ; i++) {
            if(temp[i]!=0) {
                counter = 0;
                for (int j = 0; j < temp.length; j++) {
                    if (a[i] == temp[j]) {
                        temp[j] = 0;
                        counter++;
                    }
                }
                temp2[0][i] = a[i];
                temp2[1][i] = counter;
            }
        }

        for (int i = 0; i <temp2.length ; i++) {
            for (int j = 0; j <temp2[i].length ; j++) {
                System.out.print(temp2[i][j] + "   ");
            }
            System.out.println();
        }


        double temp3[]=new double[temp2[1].length];
        for (int i = 0; i <temp3.length ; i++) {
            temp3[i]=temp2[1][i];
        }


        Arrays.sort(temp3);
        double highestFrequency=temp3[temp3.length-1];


        System.out.print("Mode of this array : ");

        for (int i = 0; i <temp2[1].length; i++) {
            if(highestFrequency==temp2[1][i]){
                System.out.print(temp2[0][i] + " ,");
            }
        }


    }

    public static void main(String[] args) {
        double[] a ={11, 16, 12, 23, -16, 14, 12, 13, 11, 14, 15, -16, 17, 16};
        MeanMedianMode m=new MeanMedianMode();
        System.out.println(m.mean(a));
        System.out.println(m.median(a));
        m.mode(a);
    }
}
