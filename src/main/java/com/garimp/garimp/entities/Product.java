package com.garimp.garimp.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class Product {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    @Column
    public String name;

    @Column
    public String size;

    @Column
    public int value;

    @Column
    public String color;

    @Column
    public String type;

    @ManyToOne
    public Collection collection;

    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getSize() {
        return size;
    }
    public int getValue() {
        return value;
    }
    public String getColor() {
        return color;
    }
    public String getType() {
        return type;
    }
    public Collection getCollection() {
        return collection;
    }
}


