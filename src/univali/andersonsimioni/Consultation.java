package univali.andersonsimioni;

import jdk.jfr.Timespan;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class Consultation {
    private final ArrayList<Exam> Exams = new ArrayList<Exam>();
    private final Treatment treatment;
    private final LocalDate CreateDate;
    private final LocalDate SchedulingDate;

    /**
     * validate constructor params
     * @param treatment
     * @param schedulingDate
     */
    private void validateParams(Treatment treatment, LocalDate schedulingDate){
        if(treatment == null)
            throw new IllegalArgumentException("treatment is null");
        if(schedulingDate == null)
            throw new IllegalArgumentException("schedulingDate is null");

        Period duration = Period.between(LocalDate.now(), schedulingDate);
        if(duration.getDays() <= 0)
            throw new IllegalArgumentException("schedulingDate is smaller than date now");
    }

    public Consultation(Treatment treatment, LocalDate schedulingDate) {
        validateParams(treatment, schedulingDate);
        this.treatment = treatment;
        this.CreateDate = LocalDate.now();
        this.SchedulingDate = schedulingDate;
    }

    /**
     * return a string list of all consultation exams
     * @return
     */
    private String getExamsStringList(){
        String doc = "";
        for(Exam e:Exams)
            doc += e.toString() + ",\n";

        return doc;
    }

    @Override
    public String toString() {
        return "Consultation{" +
                "Exams={" + getExamsStringList() + "}" +
                ", treatment=" + treatment +
                ", CreateDate=" + CreateDate +
                ", SchedulingDate=" + SchedulingDate +
                '}';
    }

    /**
     * Register exam to consultation
     * @param exam
     */
    public void addExam(Exam exam) {
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
