public class SumOfArray {
    public static void main(String[] args) {
//        find sum of arrays

        int []a={10, -5, 12, 3, -1, 4, 6, -2, 8, 2};
        int sum=0;
        for(int num:a){
            sum=sum+num;
        }
        System.out.println("sum of array elements : " + sum);
        System.out.println("average of all elements : " + sum/(a.length-1));
    }
}
