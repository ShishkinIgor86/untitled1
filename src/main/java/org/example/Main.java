package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        Toy toy1 = new Toy(0, "Конструктор Лего", 5, 15);
        Toy toy2 = new Toy(1, "Hot Wheels", 4, 20);
        Toy toy3 = new Toy(2, "Робот", 3, 45);
        Toy toy4 = new Toy(3, "Матрёшка", 15, 65);

        List<Toy> toys = new ArrayList<Toy>();
        toys.add(toy4);
        toys.add(toy3);
        toys.add(toy2);
        toys.add(toy1);

        ToyStore toyStore = new ToyStore(toys);
            toyStore.saveToyForLottery();
            toyStore.saveToyForLottery();
            toyStore.saveToyForLottery();
            toyStore.saveToyForLottery();

        toyStore.loadToysFromFile("Toys.txt");
            System.out.println("Розыгрыш игрушек:");
            System.out.println("id.  Название игрушки");
            List<Toy> allToys = toyStore.getAllToys();
            for (Toy toy : allToys) {
                System.out.println(toy.getId() + ". " + toy.getTitle());
        }
    }
}