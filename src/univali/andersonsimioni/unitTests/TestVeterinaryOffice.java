package univali.andersonsimioni.unitTests;

import univali.andersonsimioni.*;

import java.time.LocalDate;

public class TestVeterinaryOffice {
    private VeterinaryOffice veterinaryOffice;
    public void run() {
        this.veterinaryOffice = new VeterinaryOffice();

        Veterinary veterinary = new Veterinary(
                "Anderson Simioni",
                "Anderson`s Address",
                "99999999999",
                "5548999999999",
                "123456789"
        );

        Client client = new Client(
                "Willian Souza",
                "00000000000",
                "Willian`s Address",
                "5548988888888"
        );

        Specie specie = new Specie(
                "dog",
                "dog`s description"
        );

        Animal animal = new Animal(
                "Bilu",
                new Specie("dog", "Dog`s Description"),
                Genre.MALE,
                LocalDate.of(2010,01,01),
                "00000000000"
        );

        Exam exam = new Exam("Blood test", "test blood");
        Treatment treatment = new Treatment(animal,client);
        Consultation consultation = new Consultation(
                treatment,
                LocalDate.of(2020,01,01),
                LocalDate.of(2020,10,20));

        this.veterinaryOffice.registerVeterinary(veterinary);
        this.veterinaryOffice.registerClient(client);
        this.veterinaryOffice.registerSpecies(specie);
        this.veterinaryOffice.registerAnimal(animal);
        this.veterinaryOffice.registerTreatment(treatment);

        System.out.println("Running test on VeterinaryOffice Class");
    }
}
