package STRING.classWork;

import java.util.Scanner;

public class Task2 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        StringBuilder s =new StringBuilder();
        char[] chars = str.toCharArray();
        int left = 0;
        int right = chars.length-1;
        while (left<right){
            char temp= chars[left];
            chars[left]=chars[right];
            chars[right]=temp;
            left++;
            right--;

        }
        System.out.println(new String(chars));

    }
    /*
        {H, e, l, l, o } ->
     */
}
