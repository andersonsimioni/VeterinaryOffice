package univali.andersonsimioni;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;

public class Animal {
    private final String Name;
    private final Specie Specie;
    private final Genre Genre;
    private final LocalDate BirthDate;
    private final String OwnerDocument;

    /**
     * Validate constructor params
     * @param name
     * @param specie
     * @param genre
     * @param birthDate
     * @param ownerDocument
     */
    private void validateParams(String name, Specie specie, Genre genre, LocalDate birthDate, String ownerDocument){
        if(name == null || name.isEmpty())
            throw new IllegalArgumentException("name is null or empty");
        if(specie == null)
            throw new IllegalArgumentException("specie is null");
        if(genre == null)
            throw new IllegalArgumentException("genre is null");
        if(birthDate == null)
            throw new IllegalArgumentException("birthDate is null");
        if(ownerDocument == null || ownerDocument.isEmpty())
            throw new IllegalArgumentException("ownerDocument is empty or null");

        Period d = Period.between(LocalDate.now(), birthDate);
        if(d.getDays() > 0)
            throw new IllegalArgumentException("date now is bigger than birthDate");
    }

    public Animal(String name, Specie specie, Genre genre, LocalDate birthDate, String ownerDocument) {
        validateParams(name, specie, genre, birthDate, ownerDocument);

        this.Name = name;
        this.Specie = specie;
        this.Genre = genre;
        this.BirthDate = birthDate;
        this.OwnerDocument = ownerDocument;
    }

    @Override
    public String toString() {
        return  "{ Name='" + Name + '\'' +
                ", \nSpecie=" + Specie +
                ", \nGenre=" + Genre +
                ", \nBirthDate=" + BirthDate +
                ", \nOwnerDocument='" + OwnerDocument + '\'' +
                '}';
    }

    public Integer getAge(){
        LocalDate today = LocalDate.now();

        Period period = Period.between(this.BirthDate, today);
        return period.getYears();
    }

    public String getName() {
        return Name;
    }

    public Specie getSpecie() {
        return Specie;
    }

    public Genre getGenre() {
        return Genre;
    }

    public LocalDate getBirthDate() {
        return BirthDate;
    }

    public String getOwnerDocument() {
        return OwnerDocument;
    }
}
