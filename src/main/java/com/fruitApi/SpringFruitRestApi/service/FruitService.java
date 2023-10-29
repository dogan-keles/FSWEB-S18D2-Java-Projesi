package com.fruitApi.SpringFruitRestApi.service;

import com.fruitApi.SpringFruitRestApi.entity.Fruit;

import java.util.List;

public interface FruitService {
    List<Fruit> getByPriceAsc();
    Fruit getById(long id);
    List<Fruit> getByPriceDesc();
    Fruit save(Fruit fruit);
    Fruit delete(long id);
    List<Fruit> searchByName(String name);
}
