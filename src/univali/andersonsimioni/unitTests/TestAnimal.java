package univali.andersonsimioni.unitTests;

import univali.andersonsimioni.Animal;
import univali.andersonsimioni.Genre;
import univali.andersonsimioni.Specie;

import java.time.LocalDate;

public class TestAnimal {
    private Animal animal;

    public void run() {
        Specie specie = new Specie("pardal", "Passer is a genus in the family Passeridae, also known as sparrow. The genus includes P. domesticus and P. montanus, some of the most common birds in the world.");

        this.animal = new Animal(
                "Ana",
                specie,
                Genre.FEMALE,
                LocalDate.of(2019, 01,01),
                "99999999999"
        );

        System.out.println("Running test on Animal Class");
        System.out.println("Animal name: " + this.animal.getName());
        System.out.println("Animal specie: " + this.animal.getSpecie().getName());
        System.out.println("Animal genre: " + this.animal.getGenre());
        System.out.println("Animal age: " + this.animal.getAge());
        System.out.println("Animal owner document: " + this.animal.getOwnerDocument());

    }
}
