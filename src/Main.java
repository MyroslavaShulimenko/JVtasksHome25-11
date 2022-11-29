import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

       // First level: Есть лист  целых чисел. Написать метод, который вернет список без элементов, больше числа n.
       // public List withoutElementsMoreThanN(List ints, int n)

List<Integer>arr=new ArrayList<>();
       arr.add(22);
       arr.add(18);
       arr.add(1);
       arr.add(9);
       arr.add(36);
       arr.add(17);
       arr.add(29);
      int n =20;
        System.out.println(Arrays.toString(new List[]{arr}));
        System.out.println(n);
        System.out.println(withoutElementsMoreThanN(arr,n));

    }
    public static List<Integer> withoutElementsMoreThanN(List<Integer> ints, int n){
        List<Integer>list=new ArrayList<>();
        for (int i = 0; i <ints.size() ; i++) {

            if (ints.get(i)<n){
                list.add(ints.get(i));
            }
        }
        return list;
    }
}