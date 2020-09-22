package univali.andersonsimioni.unitTests;

import univali.andersonsimioni.*;

import java.time.LocalDate;

public class TestTreatment {
    Treatment treatment;
    public void run() {
        Animal animal = new Animal(
                "Bilu",
                new Specie("Dog", "Test dog specie"),
                Genre.FEMALE,
                LocalDate.of(2018,01,01),
                "000000000"
        );

        Client client = new Client(
                "Willian de Souza",
                "00000000000",
                "Test Address",
                "123456789"
        );

        Veterinary veterinary = new Veterinary(
                "Anderson Simioni",
                "Anderson`s Address",
                "99999999999",
                "5548999999999",
                "123456789"
        );

        Consultation consultation = new Consultation(
                treatment,
                LocalDate.of(2020,10,18));

        treatment = new Treatment(animal, client, veterinary);

        treatment.addConsultation(consultation);

        System.out.println("Running test on Treatment Class");
        System.out.println("Animal Name: " + this.treatment.getAnimal().getName());
        System.out.println("Client Name: " + this.treatment.getClient().getName());
    }
}
