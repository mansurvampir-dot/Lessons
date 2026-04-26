package HH.LIST;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class REMOVE {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7));
       /* Iterator<Integer> it = list.iterator();
        while (it.hasNext()){
            if(it.next() % 2 ==0){
                it.remove();
            }*/
        list.removeIf(name -> name % 2 == 0);
        System.out.println(list);
    }
}
