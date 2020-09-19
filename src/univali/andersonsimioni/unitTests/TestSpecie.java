package univali.andersonsimioni.unitTests;

import univali.andersonsimioni.Specie;

public class TestSpecie {
    private Specie specie;

    public void run(){
        this.specie = new Specie("pardal", "Passer is a genus in the family Passeridae, also known as sparrow. The genus includes P. domesticus and P. montanus, some of the most common birds in the world.");

        System.out.println("Running test on Specie Class");
        System.out.println("Specie name: " + this.specie.getName());
        System.out.println("Specie description: " + this.specie.getDescription());

    }
}
