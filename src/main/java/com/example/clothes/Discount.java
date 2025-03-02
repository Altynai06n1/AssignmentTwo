package com.example.clothes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("discount")
public class Discount implements ClothingService {
    private final ClothingRepository repository;

    @Autowired
    public Discount(ClothingRepository repository) {
        this.repository = repository;
    }

    @Override
    public void addItem(Clothes item) {
        item.setPrice(item.getPrice() * 0.9);
        repository.addItem(item);
    }

    @Override
    public List<Clothes> getAllItems() {
        return repository.getAllItems();
    }
}
