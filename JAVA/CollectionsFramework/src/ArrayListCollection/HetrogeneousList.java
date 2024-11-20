package ArrayListCollection;

import java.util.ArrayList;

public class HetrogeneousList {
    public static void main(String[] args) {
        ArrayList ele=new ArrayList();
        ele.add("hello");
        ele.add(20);
        ele.add('a');
        ele.add(30.45);
        ele.add(true);
        System.out.println(ele);
        System.out.println(ele.hashCode());
        System.out.println(ele.getClass());
    }
}
