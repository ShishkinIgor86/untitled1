package org.example;

public class Toy {
    private int id;
    private String title;
    private int quantity;
    private double weight;

    public Toy(int id, String title, int quantity, double weight){
        this.id = id;
        this.title = title;
        this.quantity = quantity;
        this.weight = weight;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void decreaseQuantity() {
        if (quantity > 0) {
            quantity--;
        }
    }

    @Override
    public String toString() {
        return id + "," + title + "," + quantity + "," + weight;
    }
}
