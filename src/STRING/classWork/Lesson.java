package STRING.classWork;

public class Lesson {

    public static void main() {

        String str = "Hi";

        String str2 = new String("Hi");

        char[] chars = {'H', 'i'};
        String str3 = new String(chars);

      System.out.println("Привет, Вася! Как дела?");
       System.out.println("Привет, Вася!\n Как дела?");



        String json = """
                {
                    "name": "Миша"
                }
                """;

        str = str.toUpperCase();
        System.out.println(str);
        System.out.println(json);

        StringBuilder sb = new StringBuilder();
        sb.append("Hi");
        if(true){
            sb.append(", Ann");
        }
        sb.append("!");
        System.out.println(sb);


        String hello1 = "Hello";
        String hello2 = "Hello";

        System.out.println(hello2 == hello1);


        String hello3 = new String("Hello");

        System.out.println(hello1 == hello3);
        System.out.println(hello1.equals(hello3));


        if("Hello".equals(hello1)){

        }
//        if(hello1.equals("Hello")){ ПЛОХО!!
//
//        }


        System.out.printf("Имя %s, возраст: %s", "Вася", 20);

        String info = String.format("Имя %s, возраст: %s", "Вася", 20);
        System.out.println(info);
    }

}
