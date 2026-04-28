package Generic.task4.task;

import java.util.*;

public class Recommendations {

    public static void main(String[] args) {
        Map<String, Set<String>> purchases = new HashMap<>();
        purchases.put("Иван", new HashSet<>(Set.of("монитор","телефон","планшет","мышка")));
        purchases.put("Анна", new HashSet<>(Set.of("видеокарта","телефон","монитор","мышка")));
        purchases.put("Вадим", new HashSet<>(Set.of("наушнки","планшет","колонка","клавиатура")));
        purchases.put("Антон", new HashSet<>(Set.of("клавиатура","колонка","мышка","телефон")));
        Set<String> recommendation = new LinkedHashSet<>();
        String targetUser = "Анна";
        Set<String> targetItems = purchases.get(targetUser);
        for(Map.Entry<String,Set<String>> entry : purchases.entrySet() ){
            if(entry.getKey().equals(targetUser)){
                continue;
            }

            Set<String> common = new HashSet<>(targetItems);
            common.retainAll(entry.getValue());

            if(common.size()>=2){
                Set<String> newItems = new HashSet<>(entry.getValue());
                newItems.removeAll(targetItems);
                recommendation.addAll(newItems);
            }

        }
        System.out.println("рекомендации для " + targetUser + " "+ recommendation);
    }

}

