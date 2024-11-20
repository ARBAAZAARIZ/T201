public class FirstrepeatedNos {
    public static void main(String[] args) {
        double[] a ={16, 12, 23, 14, 12, 13, 11, 14, 15, 17,};
        int counter=0;

        for (int i = 0; i <a.length ; i++) {

            for (int j = 0; j <a.length-1 ; j++) {
                if(a[i]==a[j]){
                    counter++;
                }
                if(counter>1){
                    System.out.println(a[i] + "  is first repeated element in this array");
                    break;
                }

            }
            if(counter>1){
                break;
            }

        }

    }
}
