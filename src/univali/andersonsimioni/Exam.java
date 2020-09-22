package univali.andersonsimioni;

public class Exam {
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

    public Exam(String name, String description) {
        validateParams(name, description);

        Name = name;
        Description = description;
    }

    @Override
    public String toString() {
        return "Exam{" +
                "Name='" + Name + '\'' +
                ", Description='" + Description + '\'' +
                '}';
    }

    public String getName() {
        return Name;
    }

    public String getDescription() {
        return Description;
    }
}
