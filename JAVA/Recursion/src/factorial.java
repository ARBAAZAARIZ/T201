public class factorial {

    int printfac(int n){

        if(n==1){
            return 1;
        }
        return n* printfac(n-1);
    }

    public static void main(String[] args) {
        factorial factorial=new factorial();
        System.out.println(factorial.printfac(5));
    }
}
