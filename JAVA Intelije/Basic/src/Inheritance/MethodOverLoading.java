package Inheritance;

public class MethodOverLoading {
    void add(int x, int y){
        System.out.println(x+y);
    }

    void add(float x, float y){
        System.out.println(x+y);
    }
    void add(int x, int y , int z){
        System.out.println(x+y);
    }

    public static void main(String[] args) {
        MethodOverLoading a=new MethodOverLoading();
        a.add(2,4);
        a.add(2.4f,5);
        a.add(1,5,10);
    }
}
