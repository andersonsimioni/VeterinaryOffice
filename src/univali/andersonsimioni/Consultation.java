package univali.andersonsimioni;

import java.time.LocalDate;
import java.util.ArrayList;

public class Consultation {
    private ArrayList<Exam> Exams = new ArrayList<Exam>();
    private final Treatment treatment;
    private final LocalDate CreateDate;
    private final LocalDate SchedulingDate;

    public Consultation(Treatment treatment, LocalDate createDate, LocalDate schedulingDate) {
        this.treatment = treatment;
        CreateDate = createDate;
        SchedulingDate = schedulingDate;
    }

    public void AddExam(Exam exam) {
        this.Exams.add(exam);
    }

    public ArrayList<Exam> getExams() {
        return Exams;
    }

    public Treatment getTreatment() {
        return treatment;
    }

    public LocalDate getCreateDate() {
        return CreateDate;
    }

    public LocalDate getSchedulingDate() {
        return SchedulingDate;
    }
}
