package Generic.task3;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Counter {
    public static void count(String text){
        System.out.println("=====  Линк ======");
        text = text.toLowerCase().replaceAll("[^а-яa-z ]","");
        String[] words = text.split("\\s+");
        Map<String,Integer> map = new LinkedHashMap<>();
        for(String word : words){
            map.put(word, map.getOrDefault(word,0)+1);
        }
         for (Map.Entry<String, Integer> entry : map.entrySet()) {
             System.out.println("ключ" + "  "+  entry.getKey() + "значение" + "  "+  entry.getValue());
         }
    }
    public static void countAlphabet(String text) {
        System.out.println("====== Алфавит =======");
        text = text.toLowerCase().replaceAll("[^а-яa-z ]", "");
        String[] words = text.split("\\s+");
        Map<String, Integer> map = new TreeMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("ключ" +" " + entry.getKey() +" "+"значение" + "  " + entry.getValue());
        }

    }
}
