package org.example.model;

public class Movie {

    private int id;
    private String title;
    private int yearRelease;
    private String description;
    private float price;

    public Movie() {}

    // 3. Getters y Setters (Los "grifos" para leer y escribir datos)
    // Estos son los que el Repository necesita para funcionar

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public int getYearRelease() { return yearRelease; }
    public void setYearRelease(int yearRelease) { this.yearRelease = yearRelease; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public float getPrice() { return price; }
    public void setPrice(float price) { this.price = price; }
}