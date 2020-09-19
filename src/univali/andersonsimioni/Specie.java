package univali.andersonsimioni;

public class Specie {
    private final String Name;
    private final String Description;

    public Specie(String name, String description) {
        Name = name;
        Description = description;
    }

    public String getName() {
        return Name;
    }

    public String getDescription() {
        return Description;
    }
}
