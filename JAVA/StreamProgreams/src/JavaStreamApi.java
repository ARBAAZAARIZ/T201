import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class JavaStreamApi {
    public static void main(String[] args) {
//        convering list to array
//        List<Integer> marks=new ArrayList<Integer>();
//        marks.toArray();

//        converting array to list
        List<Integer> numbers= Arrays.asList(5,2,7,9,4);
        System.out.println( " Numbers "+ numbers);
        System.out.println();

//        displaying list by using for each loop
        numbers.forEach(System.out::println);   //method 1
        numbers.forEach((n)-> System.out.println(n));
        System.out.println();

//       converting list to stream
        Stream<Integer> numbers_stream=numbers.stream();

//          Displaying elemnts from a stream
//        numbers_stream.forEach((n)-> System.out.println(n));

        System.out.println();

//
//        Stream<Integer> new_streeam_with_add_two=numbers_stream.map(n -> n+2);
//        new_streeam_with_add_two.forEach((n) -> System.out.println(n));

//        above code in short cut way
//        numbers_stream.map(n -> n+2).forEach(n -> System.out.println(n));

//        find even numbers from stram and square it
//        numbers_stream
//                .filter(n->n%2==0)
//                .map(n -> n*n)
//                .forEach(n -> System.out.println(n));

        System.out.println();

//        add all numbers from given numbers
        int result=numbers_stream.reduce(0, (first,next) -> first+next);
        System.out.println(result);

        System.out.println();
        System.out.println();
//        find marks greater then 90 and give them 10% grace marks
        List<Integer> marks=Arrays.asList(92,89,95,91,90);
        Stream<Integer> marks_stream=marks.stream();

        marks_stream.filter(n -> n<90)
                .map(n -> n+((10*n)/100))
                .forEach((n) -> System.out.println(n));







    }
}
