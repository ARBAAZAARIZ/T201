import java.util.Arrays;

public class PrimeNos {
    public static void main(String[] args) {

        int n=8;
        int count=0;
        for (int i = 2; i <n ; i++) {
            if(n%2==0){
                count++;
                break;
            }
        }
        if(count>0){
            System.out.println(n + " is not a prime number");
        }
        else{
            System.out.println(n + " is a prime number");
        }

        int[] a ={10, -5, 12, 3, -1, 4, 6, -2, 8, 2};
        int temp;
        int [] tempArr=new int[a.length];
        int tempIdx=-1;
        for (int i = 0; i < a.length ; i++) {
            temp=a[i];
            count=0;
            for (int j = 2; j <temp ; j++) {
                if(temp % j==0){
                    count++;
                }
            }
            if(count==0){
                tempIdx++;
                tempArr[tempIdx]=temp;
            }

        }
        System.out.println(Arrays.toString(tempArr));

    }
}
