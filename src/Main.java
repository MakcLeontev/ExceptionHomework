import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Integer[]arr = {1,2,null,4,null};
        checkArray(arr);
    }
    public static  void checkArray(Integer[] arr){
        List<Integer>place = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null){
                place.add(i);
                System.out.println("элемент массива равен null");
            }
        }
        if (place.size()>1){
            System.out.println("Номера элементов в массиве содержащих null");
            System.out.println(place);
        }
    }
}