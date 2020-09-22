package univali.andersonsimioni.unitTests;

import univali.andersonsimioni.Veterinary;

public class TestVeterinary {
    private Veterinary veterinary;

    public void run() {
        veterinary = new Veterinary(
                "Willian Souza",
                "Test Address",
                "99999999",
                "5548999999999",
                "123456789"
        );

        System.out.println("Running test on Veterinary Class");
        System.out.println("Veterinary name: " + this.veterinary.getName());
        System.out.println("Veterinary address: " + this.veterinary.getAddress());
        System.out.println("Veterinary document: " + this.veterinary.getDocument());
        System.out.println("Veterinary phone: " + this.veterinary.getPhone());
        System.out.println("Veterinary license: " + this.veterinary.getLicence());
    }
}
