public class OccuranceOfNum {
    public static void main(String[] args) {
        int[] a ={10,10,2,3,10,4,5,6,2,3,2,2,10,5,6,8};

       int temp[]=new int[a.length];

        for (int i = 0; i <temp.length ; i++) {
            temp[i]=a[i];
        }

            int count;
        for (int i = 0; i <temp.length ; i++) {
            if (temp[i] != 0) {
                count = 0;
                for (int j = 0; j < temp.length; j++) {

                    if (a[i] == temp[j]) {
                        temp[j] = 0;
                        count++;
                    }

                }
                System.out.println("Occurance of " + a[i] + " is " + count);
                temp[i] = 0;
            }
        }

    }
}
