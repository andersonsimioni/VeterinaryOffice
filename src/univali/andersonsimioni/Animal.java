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

    public Animal(String name, univali.andersonsimioni.Specie specie, univali.andersonsimioni.Genre genre, LocalDate birthDate, String ownerDocument) {
        Name = name;
        Specie = specie;
        Genre = genre;
        BirthDate = birthDate;
        OwnerDocument = ownerDocument;
    }

    public Integer getAge(){
        LocalDate today = LocalDate.now();

        Period period = Period.between(this.BirthDate, today);
        return period.getYears();
    }

    public String getName() {
        return Name;
    }

    public univali.andersonsimioni.Specie getSpecie() {
        return Specie;
    }

    public univali.andersonsimioni.Genre getGenre() {
        return Genre;
    }

    public LocalDate getBirthDate() {
        return BirthDate;
    }

    public String getOwnerDocument() {
        return OwnerDocument;
    }
}
