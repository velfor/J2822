package by.itstep.boot.model;


import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "book")
@Data
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int price;
    private String title;

    @Transient
    private String people;

    public Book(int price, String title) {
        this.price = price;
        this.title = title;
    }

    public Book() {
    }

    public int getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
