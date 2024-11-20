public class EvenAndOdd {
    public static void main(String[] args) {
        int []numbers={5,10,4,2,7,9};

        for(int num:numbers){
            if(num%2==0){
                System.out.println(num + "  is even");
            }
            else{
                System.out.println(num + "  is odd");
            }
        }

    }
}
