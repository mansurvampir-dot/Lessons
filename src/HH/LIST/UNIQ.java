package HH.LIST;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UNIQ {
    public static void main(String[] args){
        Set<String> uniqe = new HashSet<>(List.of("Миша", "Аня", "Миша", "Петя", "Аня"));
        System.out.println(uniqe);
    }
}
