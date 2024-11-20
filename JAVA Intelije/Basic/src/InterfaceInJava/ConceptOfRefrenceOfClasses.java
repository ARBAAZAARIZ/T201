package InterfaceInJava;

class Animal {
    public void eat() {
        System.out.println("This animal eats food.");
    }
}

class Mammal extends Animal {
    public void breathe() {
        System.out.println("This mammal breathes air.");
    }
}

class Dog extends Mammal {
    public void bark() {
        System.out.println("The dog barks.");
    }
}




public class ConceptOfRefrenceOfClasses {
    public static void main(String[] args) {
        Animal a1=new Dog();
//        a1.breath(); this throws error as a1 is reffreed to animal so
//        we can used only method of animal and dog

        System.out.println(a1 instanceof Mammal);
    }

}
