package com.example.clothes;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        ClothingService clothingService = context.getBean(ClothingService.class);
        ClothingService discountService = context.getBean("discount", ClothingService.class);

        Clothes item1 = new Clothes(1, "Shirt", "S", 12000.0);
        Clothes item2 = new Clothes(2, "Dress", "XS", 51400.0);
        Clothes item3 = new Clothes(3, "Suit", "S", 26700.0);

        clothingService.addItem(item1);
        discountService.addItem(item2);
        clothingService.addItem(item3);

        System.out.println("All items:");
        clothingService.getAllItems().forEach(System.out::println);

        LazySingleton lazySingleton = context.getBean(LazySingleton.class);
        lazySingleton.lazyInit();

        context.close();
    }
}