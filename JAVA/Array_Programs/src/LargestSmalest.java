import java.util.Arrays;

public class LargestSmalest {
    public static void main(String[] args) {
        int[] a ={3, -1, 4, -2, -8, 6, -7, 2, -5, 9};
        int temp;
        System.out.println("Our array  ");
        System.out.println(Arrays.toString(a));
        System.out.println();
//          to sort the array in ascending order
        for (int i = 0; i < a.length ; i++) {
            for (int j = i+1; j <a.length ; j++) {
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }

        }

        System.out.println("largest number in an array : "+ a[a.length-1]);
//        code for second-largest number
//        int[] a ={3, -1, 4, -2, -8, 6, -7, 2, -5, 9};

//                    the counter is for to check weather all numbers are same or not as if
//                    the numbers are same then there
//                    will be no second largest or smallest number
//                    so if count == array.length then it means
//                    that all numbers are same hence no smallest no largest number

            int count=0;
        for (int i = a.length-1; i >0 ; i--) {
            if(a[i-1]!=a[i]){
                System.out.println("Second largest number in an array : "+ a[i-1]);
                break;
            }
            count++;
        }
        if(count==a.length-1){
            System.out.println("There is no largest number");
        }
//        code for smallest number
//        int[] a ={3, -1, 4, -2, -8, 6, -7, 2, -5, 9};
        count=1;
        System.out.println("Smallest number in an array : " + a[0]);
        for(int i=0;i<a.length-2;i++){
            if(a[i+1]!=a[i]){
                System.out.println("Second smallest number : " + a[i+1]);
                break;
            }
            count++;
        }
        if(count==a.length-1){
            System.out.println("There is no smallest number");
        }


    }
}
