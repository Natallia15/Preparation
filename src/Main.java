import java.util.*;

public class Main {
    public static void main(String[] args) {

        Horse horse = new Horse(5, "black", 100, "jump");

        Dog dog = new Dog();
        dog.move();
        dog.voice();

        try {
            throw new MyExeption("неправильный тип данных");
        } catch (MyExeption M) {
            System.out.println(M.getMessage());
        } finally {
            System.out.println("на ноль делить нельзя");
        }
        Random r = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int a = 1; a < 10; a++) {
            list.add(r.nextInt(10));
        }
        list.forEach(item -> {
            System.out.print(item + " ");
        });


        Map<String, String> map = new HashMap<>();
       map.put("dog","Lucky");
        map.put("cat","Mikky");
        System.out.println(map);
        System.out.println(map.keySet());
        System.out.println(map.values());

        HashSet<String> h = new HashSet<String>();
        h.add("India");
        h.add("Australia");
        h.add("South Africa");
        h.add("India");// пытаемся добавить еще один такой же элемент
        System.out.println(h);
        System.out.println("List contains India or not:" +
                h.contains("India"));
}



}

