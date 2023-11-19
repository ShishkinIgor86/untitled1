package org.example;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.io.*;
public class ToyStore {
    private List<Toy> toys;

    public ToyStore(List<Toy> toys) {
        this.toys = toys;
    }

    public void addToy(Toy toy) {
        toys.add(toy);
    }

    public Toy getToyForPrice() {
        Raffle random = new Raffle();
        Toy toy = random.raffleToy(toys);
        return toy;
    }

    public void saveToyForLottery() {
        Toy toy = getToyForPrice();
        String text = toy.toString();
        try(FileWriter writer = new FileWriter("Toys.txt", true))
        {
            writer.write(text);
            writer.append('\n');
            writer.flush();
        }
        catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
        toys.remove(toy);
    }
    public void loadToysFromFile(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                int id = Integer.parseInt(parts[0]);
                String title = parts[1];
                int quantity = Integer.parseInt(parts[2]);
                double weight = Double.parseDouble(parts[3]);

                Toy toy = new Toy(id, title, quantity, weight);
                addToy(toy);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Toy> getAllToys() {
        return toys;
    }
}

