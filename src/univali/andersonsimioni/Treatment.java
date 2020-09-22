package univali.andersonsimioni;

import com.sun.jdi.request.InvalidRequestStateException;

import java.util.ArrayList;

public class Treatment {
    private boolean Ended = false;
    private ArrayList<Consultation> consultations = new ArrayList<Consultation>();
    private final Animal animal;
    private final Client client;

    public Treatment(Animal animal, Client client) {
        this.animal = animal;
        this.client = client;
    }

    public void end() {
        if(!this.Ended) {
            this.Ended = true;
        } else {
            throw new InvalidRequestStateException("Treatment already ended");
        }
    }

    public void  addConsultation(Consultation consultation) {
        this.consultations.add(consultation);
    }

    public boolean isEnded() {
        return Ended;
    }

    public ArrayList<Consultation> getConsultations() {
        return consultations;
    }

    public Animal getAnimal() {
        return animal;
    }

    public Client getClient() {
        return client;
    }
}
