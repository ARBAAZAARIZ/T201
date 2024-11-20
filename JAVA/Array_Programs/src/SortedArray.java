import java.util.Arrays;

public class SortedArray {

    public static void main(String[] args) {
        int[] a ={2, 3, -2, 4, -1, 0, 1, -3, 5, -6};
        int temp;
        System.out.println("original array  ");
        System.out.println(Arrays.toString(a));



        for (int i = 0; i < a.length ; i++) {
            for (int j = i+1; j <a.length ; j++) {
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println();
        System.out.println("Sorted array in ascending order");
        System.out.println(Arrays.toString(a));


//        Sorting for descending
        int l=a.length;
        for (int i = 1; i <= a.length/2; i++) {
            temp=a[i-1];
            a[i-1]=a[l-i];
            a[l-i]=temp;

        }
        System.out.println();
        System.out.println("Sorted array in descending order");
        System.out.println(Arrays.toString(a));

        System.out.println("---------------------------------------------------------------");
        System.out.println("reversing an array ");
        int[] arr2 ={2, 3, -2, 4, -1, 0, 1, -3, 5, -6};
        System.out.println(" Original array " + Arrays.toString(arr2));
        for (int i = 0; i <arr2.length/2 ; i++) {
            temp=arr2[i];
            arr2[i]=arr2[arr2.length-1-i];
            arr2[arr2.length-1-i]=temp;
        }
        System.out.println(" Reversed array " + Arrays.toString(arr2));
    }
}
