import javax.sound.midi.SoundbankResource;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparaterInterface
{
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(21,52,14,23);
        System.out.println(numbers);
        Collections.sort(numbers);
        System.out.println(numbers);

        Comparator<Integer> comparator=new Comparator<Integer>() {
            @Override
            public int compare(Integer n1, Integer n2) {
                return n1%10 > n2%10 ? 1:-1;
            }
        };

        Collections.sort(numbers,comparator);
        System.out.println(numbers);



    }

}
