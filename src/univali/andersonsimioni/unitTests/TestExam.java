package univali.andersonsimioni.unitTests;

import univali.andersonsimioni.Exam;

public class TestExam {
    private Exam exam;

    public void run() {
        this.exam = new Exam("Blod Test", "tests the blood for abnormalities");

        System.out.println("Running test on Exam Class");
        System.out.println("Exam name: " + this.exam.getName());
        System.out.println("Exam description: " + this.exam.getDescription());
    }
}
