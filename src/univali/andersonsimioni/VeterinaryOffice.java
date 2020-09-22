package univali.andersonsimioni;

import java.util.ArrayList;

public class VeterinaryOffice {
    private final ArrayList<Veterinary> Veterinaries;
    private final ArrayList<Treatment> Treatments;
    private final ArrayList<Animal> Animals;
    private final ArrayList<Client> Clients;
    private final ArrayList<Specie> Species;

    public VeterinaryOffice() {
        this.Veterinaries = new ArrayList<Veterinary>();
        this.Treatments = new ArrayList<Treatment>();
        this.Animals = new ArrayList<Animal>();
        this.Clients = new ArrayList<Client>();
        this.Species = new ArrayList<Specie>();
    }

    public void registerVeterinary(Veterinary veterinary) {
        this.Veterinaries.add(veterinary);
    }

    public void registerClient(Client client) {
        if(customerExist(client.getDocument()))
            throw new IllegalArgumentException("Already exist client with this document");

        this.Clients.add(client);
    }

    /**
     * Check if already exist specie with same name
     * @param specieName
     * @return
     */
    private boolean specieExist(String specieName){
        for(Specie s: Species)
            if(s.getName().equals(specieName))
                return true;

        return false;
    }

    /**
     * Register new specie if not exist
     * other specie with same name
     * @param specie
     */
    public void registerSpecies(Specie specie) {
        if(specieExist(specie.getName()))
            throw new IllegalArgumentException("Already exist other specie with this name");

        this.Species.add(specie);
    }

    /**
     * Register new animal if exist client and specie,
     * if not exist this items throw new IllegalArgumentException
     * @param animal
     */
    public void registerAnimal(Animal animal) {
        if(this.customerExist(animal.getOwnerDocument()) == false)
            throw new IllegalArgumentException("Client not found, client document: " + animal.getOwnerDocument());

        if(this.specieExist(animal.getSpecie().getName()) == false)
            throw new IllegalArgumentException("Specie not found, specie name: " + animal.getSpecie().getName());

        this.Animals.add(animal);
    }

    /**
     * Register new treatment if client, veterinary and
     * animal/specie exist, if not throw new IllegalArgumentException
     * @param treatment
     */
    public void registerTreatment(Treatment treatment) {
        if(customerExist(treatment.getClient().getDocument()) == false)
            throw new IllegalArgumentException("Client not registered");
        if(veterinaryExist(treatment.getVeterinary().getLicence()) == false)
            throw new IllegalArgumentException("Veterinary not registered");
        if(animalExist(treatment.getAnimal().getOwnerDocument(), treatment.getAnimal().getName()) == false)
            throw new IllegalArgumentException("Animal not registered");

        this.Treatments.add(treatment);
    }

    /**
     * Check if customer exist by document,
     * if exist return true, if not return false
     * @param document
     * @return
     */
    public boolean customerExist(String document) {
        for (Client client : this.getClients())
            if(client.getDocument().equals(document))
                return true;

        return false;
    }

    /**
     * Check if veterinary exist by license,
     * if exist return true, if not return false
     * @param license
     * @return
     */
    public boolean veterinaryExist(String license){
        for(Veterinary v : Veterinaries)
            if(v.getLicence().equals((license)))
                return true;

        return false;
    }

    /**
     * Check if animal exist by OwnerDocument and animal name,
     * if exist return true, if not return false
     * @param ownerDocument
     * @param name
     * @return
     */
    public boolean animalExist(String ownerDocument, String name){
        for(Animal a:Animals)
            if(a.getName().equals((name)) && a.getOwnerDocument().equals(ownerDocument))
                return true;

        return false;
    }

    public ArrayList<Veterinary> getVeterinaries() {
        return Veterinaries;
    }

    public ArrayList<Treatment> getTreatments() {
        return Treatments;
    }

    public ArrayList<Animal> getAnimals() {
        return Animals;
    }

    public ArrayList<Client> getClients() {
        return Clients;
    }

    public ArrayList<Specie> getSpecies() {
        return Species;
    }

    /**
     * Build string list of all registered veterinaries
     * @return
     */
    private String getVeterinariesStringList(){
        String list = "";

        for(Veterinary object:Veterinaries)
            list += object.toString() + ",\n";

        return list;
    }

    /**
     * Build string list of all registered treatments
     * @return
     */
    private String getTreatmentsStringList(){
        String list = "";

        for(Treatment object:Treatments)
            list += object.toString() + ",\n";

        return list;
    }

    /**
     * Build string list of all registered animals
     * @return
     */
    public String getAnimalsStringList(){
        String list = "\n";

        for(Animal object:Animals)
            list += object.toString() + ",\n";

        return list;
    }

    /**
     * Build string list of all registered clients
     * @return
     */
    public String getClientsStringList(){
        String list = "";

        for(Client object:Clients)
            list += object.toString() + ",\n";

        return list;
    }

    /**
     * Build string list of all registered species
     * @return
     */
    public String getSpeciesStringList(){
        String list = "";

        for(Specie object:Species)
            list += object.toString() + ",\n";

        return list;
    }

    @Override
    public String toString() {
        return "VeterinaryOffice{" +
                "Veterinaries= {" + getVeterinariesStringList() + "}\n" +
                ", Treatments= {" + getTreatmentsStringList() + "}\n" +
                ", Animals= {" + getAnimalsStringList() + "}\n" +
                ", Clients= {" + getClientsStringList() + "}\n" +
                ", Species= {" + getSpeciesStringList() + "}" +
                '}';
    }
}
