package pl.mlopatka.service;

import pl.mlopatka.model.Animal;
import pl.mlopatka.model.Elephant;

import java.util.List;

public class WildAnimalService implements AnimalService {

    private List<Animal> animals;

    public WildAnimalService() {
        animals = List.of(new Elephant(), new Elephant());
    }

    @Override
    public void hearAllAnimalsNoises() {
        animals.forEach(a -> a.say());
    }
}
