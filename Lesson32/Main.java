package Lesson32;

import java.util.*;

public class Main {
    //работа с HashSet
    public static void sortProducts(List<Product> products, int choice, boolean revers){
        switch (choice){
            case 1:
                //компаратор по названию (алфавитный порядок)
                Comparator<Product> compByName = (o1, o2) -> o1.getName().compareTo(o2.getName());
                //сортировка по названию
                Collections.sort(products, compByName);
                break;
            case 2:
                //компаратор по цене по возрастанию
                Comparator<Product> compByPrice = (o1, o2) -> Double.compare(o1.getPrice(), o2.getPrice());
                if (!revers){
                    //сортировка по цене по возрастанию
                    Collections.sort(products, compByPrice);
                }
                else{
                    //сортировка по цене по убыванию
                    Collections.sort(products, Collections.reverseOrder(compByPrice));
                }
                break;
        }
    }
    public static void main(String[] args) {
        /*Set<String> set = new HashSet<>();
        //add
        set.add("Яблоко");
        set.add("Мама");
        set.add("мыла");
        set.add("раму");
        set.add("мыла");
        set.add("мылом");
        set.add("Я");
        for(String s : set){
            System.out.println(s);
        }
        //remove
        set.remove("мыла");
        System.out.println("После удаления \"мыла\"");
        for(String s : set){
            System.out.println(s);
        }
        //contains
        System.out.println(set.contains("Я"));
        //size
        System.out.println("Размер множества " + set.size());
        //clear
        set.clear();
        //isEmpty
        System.out.println(set.isEmpty());*/

        //работа с TreeSet
        /*Set<HeavyBox> heavyBoxSet = new TreeSet<>();
        Random gen = new Random();
        for(int i = 1; i <= 10; i++){
            heavyBoxSet.add(new HeavyBox(gen.nextInt(20) + 1));
        }

        for(HeavyBox box : heavyBoxSet){
            System.out.println(box);
        }*/

        //Сортировка товаром по разным полям
        Product[] productArray = {
                new Product("Fork",1.25,5),
                new Product("Spoon",1.05,4),
                new Product("Pan",10.99,3),
                new Product("Knife",1.43,2),
                new Product("Knife",5.12,5),
                new Product("Spatula",2.12,4),
                new Product("Plate",3.70,4)
        };
        List<Product> products = Arrays.asList(productArray);
        System.out.println("Сортировка по имени");
        /*Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });*/
        //компаратор по названию (алфавитный порядок)
        Comparator<Product> compByName = (o1, o2) -> o1.getName().compareTo(o2.getName());
        //компаратор по цене по возрастанию
        Comparator<Product> compByPrice = (o1, o2) -> Double.compare(o1.getPrice(), o2.getPrice());
        //сортировка по названию
        Collections.sort(products, compByName);
        System.out.println(products);
        /*
        //сортировка по цене по возрастанию
        Collections.sort(products, compByPrice);
        //сортировка по цене по убыванию
        Collections.sort(products, Collections.reverseOrder(compByPrice));
        */
        sortProducts(products,2,false);
        System.out.println(products);
        sortProducts(products,2,true);
        System.out.println(products);
}

}
