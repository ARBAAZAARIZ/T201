package CursorsPrograms;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationCursorProgram {
    public static void main(String[] args) {
        Vector v=new Vector();
        for (int i = 0; i <= 10; i++) {
            v.addElement(i);
        }
        v.addElement("arbaaz");
        System.out.println(v);
        System.out.println("----------------------------------------");
        System.out.println("getting output by using enumerator of even numbers");
        Enumeration e=v.elements();
            try {
                while (e.hasMoreElements()) {
                    Integer i = (Integer) e.nextElement();
                    if (i % 2 == 0) {
                        System.out.print(i + " ");
                    }
                }
            }catch(ClassCastException c){
                System.out.println();
                System.out.println("String cannot converted into Integer");
            }
    }
}
