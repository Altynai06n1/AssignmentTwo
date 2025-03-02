package com.example.clothes;

import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ClothingRepository {
    private final List<Clothes> items = new ArrayList<>();

    public void addItem(Clothes item) {
        items.add(item);
    }

    public List<Clothes> getAllItems() {
        return items;
    }
}