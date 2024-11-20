package ArrayListCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListProgram {
    public static void main(String[] args) {
        ArrayList<Integer> marks=new ArrayList<Integer>();
        System.out.println("size of empty array list : "+ marks.size());
        marks.add(98);
        marks.add(74);
        marks.add(50);
        System.out.println();
        System.out.println("size of arraylist after adding elements : "+marks.size());
        System.out.println();
        System.out.println( "Elements of array list displayed in single line : -->" + marks);

        System.out.println();
        marks.add(0, 88); // at a particular index
        marks.set(1, 0);// to modify the particular element in arraylist
        System.out.println("after modifying the array list "+marks);

//        if we want to add another collection into a collection

        ArrayList<Integer> new_marks=new ArrayList<Integer>();
        new_marks.add(58);
        new_marks.add(64);
        new_marks.add(1);
        marks.addAll( new_marks);
        System.out.println("After adding another collection to an existing array list "+marks);
//        accesing elemnts from list
        System.out.println(marks.get(0));
//        checking elements present inside a list
        System.out.println("checking weather 11 element is presend or not --> "+marks.contains(11));
        System.out.println("checking weather 1 element is presend or not --> "+marks.contains(1));
        System.out.println("checking weather entire collection is presend or not --> "+marks.containsAll(new_marks));
//        removing elements
//        marks.remove(2);
        System.out.println("removing element at index 2  "+marks.remove(2));
        System.out.println(marks);
//        to remove elemst from a list if those elemsts are present in another list
        marks.removeAll(new_marks);
        System.out.println("removed entire collection "+marks);
//        to clear an arraylist
        marks.clear();
        System.out.println("cleared an arraylist  "+marks);
//        convert list into array
        Integer[] marks_array=new Integer[marks.size()];
        marks.add(98);
        marks.add(74);
        marks.add(50);
        marks.toArray(marks_array);
        System.out.println(Arrays.toString(marks_array));

        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add( 11);
        numbers.add( 22);
        numbers.add( 33);

        for(int number: numbers){
            System.out.println(number);
        }

//        by using iterator class
        System.out.println("using iterator");
        Iterator<Integer> number_iterator=numbers.iterator();
        while(number_iterator.hasNext()){
            System.out.println(number_iterator.next());
        }
        List<Integer> p=new ArrayList<>();
    }
}
