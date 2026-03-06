package STRING.classWork;

public class Task1 {
    static void main() {
        String str = "фыаваыфафафыа";
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)== 'а' || str.charAt(i) == 'А'){
                result ++;

            }

        }
        System.out.println(result);


//        for(char c : str.toLowerCase().toCharArray()){
//            if (c == 'а'){
//                result ++;
//            }
//        }
    }
}
