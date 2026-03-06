import java.util.Scanner;

public class Taskk5 {
    static void main(){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine().trim();
        if (str.isEmpty()) {
            System.out.println("Строка пуста");
        }
        String[] words = str.split("\\s+");
        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        System.out.println("Самое длинное слово: " + longestWord);
        System.out.println("Длина: " + longestWord.length());
    }
}
