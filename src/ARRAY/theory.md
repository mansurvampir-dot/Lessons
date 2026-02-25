```Java

public class Test{
    int grade1 = 1;
    int grade2 = 1;
    int grade3 = 1;
    int grade4 = 1;
    int grade5 = 1;


    static void main() {
        //              0  1  2  3  4  5  6 
        int[] grades = {3, 4, 2, 1, 5, 3, 2};
        
        String[] names = new String[3]; // [null, null, null]
        names[0] = "Ann";
        names[1] = "Petr";
        names[2] = "Vasay";
        names[3] = "Unknown";

        int sum = 0;
        for(int grade : grades){
            sum += grade;
        }

        double average = (double) sum/ grades.length;
        
        
        
        
    }
    
}



```