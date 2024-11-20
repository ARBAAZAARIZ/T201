package Static_Modifier;

public class AbstractClass {
    public static void main(String[] args) {
        Car honda =new Car();
        honda.wheels();
    }


}
//        bellow class consist of abstract class so this make bellow class abstract
// object cant be created of abstract class
//if there is one abstract method in a class then that class must be declared as abstract class
abstract class Vehical{
//    belo class is partially implemented so its a called abstract method
//    its child class's responsibility to provid body to abstractmethod present into parent abstract class method
    abstract void wheels();
}
//bellow class extends abstract class so all methods present in abstract class must be implemented into class class
class Car extends Vehical{
    void wheels(){
        System.out.println("This car has 4 wheels");
    }
}