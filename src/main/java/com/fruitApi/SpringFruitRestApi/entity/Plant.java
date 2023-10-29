package com.fruitApi.SpringFruitRestApi.entity;



import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.antlr.v4.runtime.misc.NotNull;
import org.hibernate.annotations.BatchSize;


@Data
@NoArgsConstructor
@MappedSuperclass
public class Plant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

@Column(name="name")
@NotNull
    private String name;

@Column(name ="price")
    private double price;


}
