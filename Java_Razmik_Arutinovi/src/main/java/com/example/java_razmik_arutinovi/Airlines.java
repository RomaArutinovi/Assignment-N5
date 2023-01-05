package com.example.java_razmik_arutinovi;

public class Airlines {

    private Long id;
    private String direction;
    private String date;
    private Integer places;
    private Integer price;

    public Airlines() {
    }

    public Airlines(Long id, String direction, String date, Integer places) {
        this.id = id;
        this.direction = direction;
        this.date = date;
        this.places = places;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getPlaces() {
        return places;
    }

    public void setPlaces(Integer places) {
        this.places = places;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Airlines{" +
                "id=" + id +
                ", direction='" + direction + '\'' +
                ", date='" + date + '\'' +
                ", places=" + places +
                ", price=" + price +
                '}';
    }
}

