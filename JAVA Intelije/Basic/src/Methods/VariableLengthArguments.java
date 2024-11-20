package Methods;

public class VariableLengthArguments {

    void addn(int... n){
        int sum=0;
        for(int num:n){
            sum+=num;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        VariableLengthArguments a=new VariableLengthArguments();
       a.addn(2,5,6,4);

    }
}
