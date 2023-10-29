package com.fruitApi.SpringFruitRestApi.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.antlr.v4.runtime.misc.NotNull;

@Data
@NoArgsConstructor
@Entity
@Table(name="fruit", schema="fsweb")
public class Fruit extends Plant{

    @Column(name="fruit_type")
    @Enumerated(EnumType.STRING)
    @NotNull
    private FruitType fruitType;

}
