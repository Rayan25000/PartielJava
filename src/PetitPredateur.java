public class PetitPredateur extends Carnivore implements NecessiteSoins{

    public PetitPredateur(double prixNourritureKg, double poidsAlimentsIngeresParMois, int tempsSoigneurParMois) {
        super(prixNourritureKg, poidsAlimentsIngeresParMois, tempsSoigneurParMois);
    }

    public PetitPredateur(int numPuceId, String type, double prixNourritureKg, double poidsAlimentsIngeresParMois, int tempsSoigneurParMois) {
        super(numPuceId, type, prixNourritureKg, poidsAlimentsIngeresParMois, tempsSoigneurParMois);
    }

    @Override
    public String toString() {
        return "Je suis un.e "+ this.type + " : un animal/carnivore/petit prédateur";
    }

    @Override
    public double coutSoin() {
        if(this.estNocturne){
            return (PRIXSOINS + 100)*2;
        } else {
            return PRIXSOINS + 100;
        }
    }
}
