package com.fruitApi.SpringFruitRestApi.controller;

import com.fruitApi.SpringFruitRestApi.dto.FruitResponse;
import com.fruitApi.SpringFruitRestApi.entity.Fruit;
import com.fruitApi.SpringFruitRestApi.service.FruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fruit")
public class FruitController {
    private FruitService fruitService;


    @Autowired
    public FruitController(FruitService fruitService) {
        this.fruitService = fruitService;
    }

    @GetMapping("/")
    public List<Fruit> get(){


        return fruitService.getByPriceAsc();
    }

    @GetMapping("/{id}")
    public FruitResponse get( @PathVariable long id){
        return new FruitResponse("Success", fruitService.getById(id));
    }

    @GetMapping("/desc")
    public List<Fruit> getByPriceDesc(){
        return fruitService.getByPriceDesc();
    }

    @PostMapping("/")
    public Fruit save(@Validated @RequestBody Fruit fruit){
        return fruitService.save(fruit);
    }

    @PostMapping("/{name}")
    public List<Fruit> searchByName( @PathVariable String name){
        return fruitService.searchByName(name);
    }

    @DeleteMapping("/{id}")
    public Fruit delete(@PathVariable long id){
        return fruitService.delete(id);
    }

}
