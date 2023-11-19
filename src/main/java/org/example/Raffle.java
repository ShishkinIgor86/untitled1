package org.example;
import java.util.List;
class Raffle {
    public Toy raffleToy(List<Toy> toys) {
        double completeWeight = 0.0;
        for (Toy toy : toys)
            completeWeight += toy.getWeight();
        double r = Math.random() * completeWeight;
        double countWeight = 0.0;
        for (Toy toy : toys) {
            countWeight += toy.getWeight();
            if (countWeight >= r){
                Toy raffleToy = new Toy(toy.getId(), toy.getTitle(), 1, toy.getWeight());
                toy.decreaseQuantity();
                return toy;
            }
        }
        throw new RuntimeException("Should never be shown.");
    }
}
