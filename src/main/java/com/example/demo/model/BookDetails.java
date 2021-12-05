package com.example.demo.model;
import javax.persistence.*;

public class BookDetails {
    public String title;

    public String author;

    public int year;

    public String publisher;

    public double cost;

    public BookDetails(String title,String author,int year,String publisher,double cost)
    {   this.title=title;
        this.author=author;
        this.year=year;
        this.publisher=publisher;
        this.cost=cost;
    }

    public String getTitle()
    {
        return title;
    }

    public String getAuthor()
    {
        return author;
    }
    public int getYear()
    {
        return year;
    }
    public String getPublisher()
    {
        return publisher;
    }
    public double getCost()
    {
        return cost;
    }

    public void setTitle(String title)
    {
        this.title=title;
    }

    public void setAuthor(String author)
    {
        this.author=author;
    }
    public void setYear(int year)
    {
        this.year=year;
    }
    public void setPublisher(String publisher)
    {
        this.publisher=publisher;
    }
    public void setCost(double cost)
    {
        this.cost=cost;
    }

    public String toString()
    {
        return "The details of the book are: " + title + ", " + author + ", " + year + ", " + publisher + ", " + cost;
    }


}
