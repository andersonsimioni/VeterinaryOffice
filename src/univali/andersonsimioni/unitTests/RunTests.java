package univali.andersonsimioni.unitTests;

import univali.andersonsimioni.Consultation;

public class RunTests {

    public static void testExam() {
        TestExam testExam = new TestExam();
        testExam.run();
    }

    public static void testSpecie() {
        TestSpecie testSpecie = new TestSpecie();
        testSpecie.run();
    }

    public static void testClient() {
        TestClient testClient = new TestClient();
        testClient.run();
    }

    public static void testAnimal() {
        TestAnimal testAnimal = new TestAnimal();
        testAnimal.run();
    }

    public static void testConsultation() {
        TestConsultation testConsultation = new TestConsultation();
        testConsultation.run();
    }

    public static void testTreatment() {
        TestTreatment testTreatment = new TestTreatment();
        testTreatment.run();
    }

    public static void testVeterinary() {
        TestVeterinary testVeterinary = new TestVeterinary();
        testVeterinary.run();
    }

    public static void testVeterinaryOffice(){
        TestVeterinaryOffice testVeterinaryOffice = new TestVeterinaryOffice();
        testVeterinaryOffice.run();
    }
}
