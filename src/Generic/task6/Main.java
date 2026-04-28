package Generic.task6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Product> products = new ArrayList<>();
        products.add(new Product("Iphone",500,4.5));
        products.add(new Product("Ipod",750,4));
        products.add(new Product("Mcbook",1500,5));

        products.sort(Comparator.comparingInt(Product::getPrice));
        System.out.println("Цена о возростанию");
        products.forEach(System.out::println);
        System.out.println();

        products.sort(Comparator.comparingInt(Product::getPrice).reversed());
        System.out.println("Цена по убыванию");
        products.forEach(System.out::println);
        System.out.println();

        products.sort(Comparator.comparing(Product::getName));
        System.out.println("По названию");
        products.forEach(System.out::println);
        System.out.println();

        products.sort(Comparator.comparing(Product::getRaiting));
        System.out.println("По рейтингу");
        products.forEach(System.out::println);
        System.out.println();
    }
}
