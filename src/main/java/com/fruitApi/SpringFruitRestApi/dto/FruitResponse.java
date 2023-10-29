package com.fruitApi.SpringFruitRestApi.dto;

import com.fruitApi.SpringFruitRestApi.entity.Fruit;

public record FruitResponse(String message, Fruit fruit) {
}
