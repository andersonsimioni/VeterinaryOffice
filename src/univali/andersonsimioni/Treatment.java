package univali.andersonsimioni;

import com.sun.jdi.request.InvalidRequestStateException;

import java.time.LocalDate;
import java.util.ArrayList;

public class Treatment {
    private LocalDate EndDate;
    private boolean Ended = false;

    private final Animal Animal;
    private final Client Client;
    private final Veterinary Veterinary;
    private final ArrayList<Consultation> Consultations = new ArrayList<Consultation>();

    /**
     * Validate constructor params
     * @param animal
     * @param client
     * @param veterinary
     */
    private void validateParams(Animal animal, Client client, Veterinary veterinary){
        if(animal == null)
            throw new IllegalArgumentException("animal is null");
        if(client == null)
            throw new IllegalArgumentException("client is null");
        if(veterinary == null)
            throw new IllegalArgumentException("veterinary is null");
    }

    public Treatment(Animal animal, Client client, Veterinary veterinary) {
        validateParams(animal, client, veterinary);

        this.Animal = animal;
        this.Client = client;
        this.Veterinary = veterinary;
    }

    @Override
    public String toString() {
        return "Treatment{" +
                " \nEndDate=" + EndDate +
                ", \nEnded=" + Ended +
                ", \nAnimal=" + Animal +
                ", \nClient=" + Client +
                ", \nConsultations=" + Consultations +
                '}';
    }

    /**
     * Set treatment status to end
     * and end date to LocalDate now
     */
    public void end() {
        if(!this.Ended) {
            this.Ended = true;
            this.EndDate = LocalDate.now();
        } else {
            throw new InvalidRequestStateException("Treatment already ended");
        }
    }

    /**
     * Check if date have other consultations,
     * without hour filter
     * @param date
     * @return
     */
    private boolean dayHaveConsultations(LocalDate date){
        for(Consultation c:Consultations)
            if(c.getSchedulingDate() == date)
                return true;

        return false;
    }

    /**
     * Register consultation to treatment if date is available
     * @param consultation
     */
    public void  addConsultation(Consultation consultation) {
        if(dayHaveConsultations(consultation.getSchedulingDate()))
            throw new IllegalArgumentException("Day already have consultation");

        this.Consultations.add(consultation);
    }

    public univali.andersonsimioni.Veterinary getVeterinary() {
        return Veterinary;
    }

    public LocalDate getEndDate() {
        return EndDate;
    }

    public boolean isEnded() {
        return Ended;
    }

    public ArrayList<Consultation> getConsultations() {
        return Consultations;
    }

    public Animal getAnimal() {
        return Animal;
    }

    public Client getClient() {
        return Client;
    }
}
