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
}

