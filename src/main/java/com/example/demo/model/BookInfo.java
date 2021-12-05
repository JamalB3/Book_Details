package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "BookInfo")
public class BookInfo {
    private int isbn;
    private String name;
    private String author;
    private int genre;
    private int rating;
    private String comments;
    private int price;
    private String publisher;
    private int year;
    private int copies;


    public BookInfo() {
    }

    public BookInfo(int isbn, String name, String author, int genre, int rating, String comments,
                    int price, String publisher)
    {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.genre = genre;
        this.rating = rating;
        this.comments= comments;
        this.price = price;
        this.publisher = publisher;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getGenre() {
        return genre;
    }

    public void setGenre(int genre) {
        this.genre = genre;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getCopies() {
        return copies;
    }

    public void setCopies(int copies) {
        this.copies = copies;
    }
}
