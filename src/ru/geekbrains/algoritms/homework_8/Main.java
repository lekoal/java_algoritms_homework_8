package ru.geekbrains.algoritms.homework_8;


import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        int x =  Integer.MIN_VALUE;
//        System.out.println(x);
//        System.out.println(Math.abs(x));
//        int x = 0x7FFFFFFF;
//        System.out.println(x);

        ChainingHashMap<Integer, String> map = new ChainingHashMap<>(5);
//        map.put(2, "two");
//        System.out.println(map.contains(2));
//        System.out.println(map.get(2));
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            map.put(random.nextInt(100), " ");
        }

        map.put(12, "must be deleted");
        map.put(22, "must be deleted");
        map.put(47, "must be deleted");
        System.out.println(map);

        map.delete(12);
        System.out.println(map);

        map.delete(22);
        System.out.println(map);

        map.delete(47);
        System.out.println(map);

        map.delete(100); // Попытка удаления несуществующего ключа
    }
}