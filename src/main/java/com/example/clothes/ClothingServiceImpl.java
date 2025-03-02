package com.example.clothes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Primary
@Service
public class ClothingServiceImpl implements ClothingService {
    private final ClothingRepository repository;

    @Autowired
    public ClothingServiceImpl(ClothingRepository repository) {
        this.repository = repository;
    }

    @Override
    public void addItem(Clothes item) {
        repository.addItem(item);
    }

    @Override
    public List<Clothes> getAllItems() {
        return repository.getAllItems();
    }
}