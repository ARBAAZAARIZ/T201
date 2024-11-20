package Methods;

//parameters
//     values required for the methof
//        while defining a methd
//Arguments
//        values passed to the method
//        while calling a method
//Return type
//        When method the going to return some values, we have to declare return typr
//        while declaring a method
//if method is not returning then return type is void

//return keyword
//when output of one methoid act as input to another method we use return
//when we return any value from a method it goes to the method call



public class ParametersArguments {

    void add(int x,int y){
        int result=x+y;
        System.out.println(result);
    }
     int sub(int x,int y){
        int result=x-y;
        return result;
    }

    void multi(){
        int n1=6,n2=8;
        System.out.println(n1*n2);
    }

    public static void main(String[] args) {
        ParametersArguments pa=new ParametersArguments();
        pa.add(10,2);
        System.out.println(pa.sub(10,4));

        int output=pa.sub(10,4);
        System.out.println(output);

        pa.multi();
    }
}
