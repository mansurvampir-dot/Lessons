package STRING.classWork;

import java.util.Scanner;

public class Task3 {
    static void main() {
        System.out.println("введите преложение: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String copctr = str;
        copctr = copctr.toLowerCase();
        copctr = copctr.replace(" ","");
        char[] chars = copctr.toCharArray();
        int left = 0;
        int right =chars.length-1;
        boolean r = true;
        while (left<right){
            int temp = chars[left];
            if(chars[left]==chars[right]){
                left=left+1;
                right=right-1;

            }
            else{
                r=false;
                break;
            }


        }
        if (r==true){
            System.out.println("палидром: " + str);
        }
        else {
        System.out.println("не палидром");}
    }
}
