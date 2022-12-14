public abstract class Carnivore extends Animal{


    public Carnivore(double prixNourritureKg, double poidsAlimentsIngeresParMois, int tempsSoigneurParMois) {
        super(prixNourritureKg, poidsAlimentsIngeresParMois, tempsSoigneurParMois);
    }

    public Carnivore(int numPuceId, String type, double prixNourritureKg, double poidsAlimentsIngeresParMois, int tempsSoigneurParMois) {
        super(numPuceId, type, prixNourritureKg, poidsAlimentsIngeresParMois, tempsSoigneurParMois);
    }
}
