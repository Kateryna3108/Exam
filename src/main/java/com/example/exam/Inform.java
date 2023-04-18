package com.example.exam;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Table
@Entity
public class Inform {
    @Id
    @GeneratedValue
    private Long id;

    private String type;
    private int x;
    private int y;
    private int result;


    public Inform() {}
    public Inform(String type, int x, int y, int result) {
        this.type = type;
        this.x = x;
        this.y = y;
        this.result = result;
    }
}
