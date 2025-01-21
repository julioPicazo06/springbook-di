package com.example.jpicazo.springbook_di.models;

public class Products implements Cloneable {
    private long id;
    private String name;
    private long price;

    public Products() {
    }

    public Products(long id, String name, long price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    @Override
    public Object clone() {
        // esto es para que si no se puede clonar la
        try {
            return super.clone();

        } catch (CloneNotSupportedException e) {
            return new Products(this.id, this.name, this.price);
        }
    }

}
