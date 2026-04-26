package HH.LIST;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args){
        String[] words = {"apple", "banana", "apple", "orange", "banana"};
        Map<String,Integer> freq = new HashMap<>();
        for(String word : words){
            freq.merge(word,1,Integer::sum);
        }
        for(Integer value : freq.values()){

        }
        System.out.println(freq);
    }
}
