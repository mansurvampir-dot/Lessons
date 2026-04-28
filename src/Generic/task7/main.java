package Generic.task7;

import java.util.*;

public class main {
    public static List<String> pathMetro(Map<String,List<String>> graf,String start,String stop) {
        Map<String,String> path = new HashMap<>(100);
        Set<String> visited = new HashSet<>(100);
        Queue<String> queue = new ArrayDeque<>(100);
        queue.add(start);
        visited.add(start);
        while (!queue.isEmpty()){
            String current = queue.poll();
            if(current.equals(stop)){
                break;
            }
            for(String station : graf.getOrDefault(current, List.of())){
                if(!visited.contains(station)){
                    visited.add(station);
                    path.put(station,current);
                    queue.add(station);
                }
            }
        }
        List<String>paths = new ArrayList<>();
        String cur = stop;
        while (cur != null) {
            paths.add(cur);
            cur = path.get(cur);
        }
        Collections.reverse(paths);
        return paths;
    }
    public static void main(String[] args) {
        Map<String, List<String>> graf = new HashMap<>();

        graf.put("A", List.of("B"));
        graf.put("B", List.of("A", "C", "D"));
        graf.put("C", List.of("B"));
        graf.put("D", List.of("B", "E"));
        graf.put("E", List.of("D"));

        List<String> result = pathMetro(graf, "A", "E");
        System.out.println("Кратчайший путь:");
        System.out.println(String.join(" -> ", result));
        System.out.println("Количество станций: " + result.size());
        }
}
