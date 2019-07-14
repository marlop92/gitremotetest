package pl.mlopatka;

import pl.mlopatka.service.AnimalService;
import pl.mlopatka.service.WildAnimalService;

public class Main {

    private static AnimalService animalService = new WildAnimalService();

    public static void main(String[] args) {
        animalService.hearAllAnimalsNoises();
    }
}
