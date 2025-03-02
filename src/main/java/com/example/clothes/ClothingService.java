package com.example.clothes;

import java.util.List;

public interface ClothingService {
    void addItem(Clothes item);
    List<Clothes> getAllItems();
}
