package univali.andersonsimioni.unitTests;

import univali.andersonsimioni.*;

import java.time.LocalDate;

public class TestConsultation {
    Consultation consultation;
    public void run() {
        Animal animal = new Animal(
                "Bilu",
                new Specie("Dog", "Simple dos"),
                Genre.FEMALE,
                LocalDate.of(2018,01,01),
                "123123123"
        );

        Client client = new Client(
                "Willian Souza",
                "123123213",
                "Test address",
                "12312312"
        );

        Veterinary veterinary = new Veterinary(
                "Anderson simioni",
                "Rua joaquim vaz",
                "65419819",
                "48656554851",
                "1165164616");

        Treatment treatment = new Treatment(animal, client, veterinary);

        Exam exam1 = new Exam("Exam 1", "Exam 1 description");
        Exam exam2 = new Exam("Exam 2", "Exam 2 description");

        this.consultation = new Consultation(
                treatment,
                LocalDate.of(2020,02,01)
        );

        consultation.addExam(exam1);
        consultation.addExam(exam2);

        System.out.println("Running test on Consultation Class");
        System.out.println("Consultation Create Date: " + this.consultation.getCreateDate());
        System.out.println("Consultation Scheduling Date: " + this.consultation.getSchedulingDate());
        for(Exam exam : this.consultation.getExams()){
            System.out.println("Exam name: " + exam.getName());
            System.out.println("Exam description: " + exam.getDescription());
            System.out.println("----------------");
        }
    }
}
