package Methods;

public class ArrayAsArguments {
    public void arraySum(int []prices){
        int sum=0;
            for(int price:prices){
                sum=sum+price;
            }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        int price[]={99,199,299};
        ArrayAsArguments aa=new ArrayAsArguments();
                aa.arraySum(price);
    }
}
