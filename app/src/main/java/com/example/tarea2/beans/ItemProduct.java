package com.example.tarea2.beans;

public class ItemProduct {
    private String name;
    private String store;
    private String phone;
    private String title;
    private String location;
    private int image;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public ItemProduct() {
        this.name = "";
        this.store = "";
        this.phone = "";
        this.title = "";
        this.location = "";
        this.image = 0;
    }

    public ItemProduct(String name, String store, String phone, String title, String location, int image) {
        this.name = name;
        this.store = store;
        this.phone = phone;
        this.title = title;
        this.location = location;
        this.image = image;
    }

    @Override
    public String toString() {
        return "ItemProduct{" +
                "name='" + name + '\'' +
                ", store='" + store + '\'' +
                ", phone='" + phone + '\'' +
                ", title='" + title + '\'' +
                ", location='" + location + '\'' +
                ", image=" + image +
                '}';
    }
}
