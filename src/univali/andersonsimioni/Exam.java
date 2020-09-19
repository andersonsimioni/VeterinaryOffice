package univali.andersonsimioni;

public class Exam {
    private final String Name;
    private final String Description;

    public Exam(String name, String description) {
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
