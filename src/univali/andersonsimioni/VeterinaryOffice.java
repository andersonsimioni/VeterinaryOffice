package univali.andersonsimioni;

import javax.management.InvalidAttributeValueException;
import java.util.ArrayList;

public class VeterinaryOffice {
    private final ArrayList<Veterinary> veterinaries;
    private final ArrayList<Treatment> treatments;
    private final ArrayList<Animal> animals;
    private final ArrayList<Client> clients;
    private final ArrayList<Specie> species;

    public VeterinaryOffice() {
        this.veterinaries = new ArrayList<Veterinary>();
        this.treatments = new ArrayList<Treatment>();
        this.animals = new ArrayList<Animal>();
        this.clients = new ArrayList<Client>();
        this.species = new ArrayList<Specie>();
    }

    public void registerVeterinary(Veterinary veterinary) {
        this.veterinaries.add(veterinary);
    }

    public void registerClient(Client client) {
        this.clients.add(client);
    }

    public void registerSpecies(Specie specie) {
        this.species.add(specie);
    }

    public void registerAnimal(Animal animal) {
        if(!this.checkCustomerExist(animal.getOwnerDocument())){
            throw new IllegalArgumentException("Client not found, client document: " + animal.getOwnerDocument());
        }

        if(!this.checkSpecieExist(animal.getSpecie().getName())){
            throw new IllegalArgumentException("Specie not found, specie name: " + animal.getSpecie().getName());
        }

        this.animals.add(animal);
    }

    public void registerTreatment(Treatment treatment) {
        this.treatments.add(treatment);
    }

    public boolean checkCustomerExist(String document) {
        for (Client client :
                this.getClients()) {
            if(client.getDocument().equals(document)) {
                return true;
            }
        }
        return false;
    }

    public boolean checkSpecieExist(String specieName) {
        for (Specie specie :
                this.getSpecies()) {
            if(specie.getName().equals(specieName)) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<Veterinary> getVeterinaries() {
        return veterinaries;
    }

    public ArrayList<Treatment> getTreatments() {
        return treatments;
    }

    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    public ArrayList<Client> getClients() {
        return clients;
    }

    public ArrayList<Specie> getSpecies() {
        return species;
    }
}
