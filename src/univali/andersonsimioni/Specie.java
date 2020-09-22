package univali.andersonsimioni;

public class Specie {
    private final String Name;
    private final String Description;

    /**
     * Validate constructor params
     * @param name
     * @param description
     */
    private void validateParams(String name, String description){
        if(name == null || name.isEmpty())
            throw new IllegalArgumentException("name is null or empty");
        if(description == null || description.isEmpty())
            throw new IllegalArgumentException("description is null or empty");
    }

    public Specie(String name, String description) {
        validateParams(name, description);

        this.Name = name;
        this.Description = description;
    }

    public String getName() {
        return Name;
    }

    public String getDescription() {
        return Description;
    }

    @Override
    public String toString() {
        return "Specie{" +
                "Name='" + Name + '\'' +
                ", Description='" + Description + '\'' +
                '}';
    }
}
