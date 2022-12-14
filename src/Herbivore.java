public class Herbivore extends Animal implements NecessiteSoins{


    public Herbivore(double prixNourritureKg, double poidsAlimentsIngeresParMois, int tempsSoigneurParMois) {
        super(prixNourritureKg, poidsAlimentsIngeresParMois, tempsSoigneurParMois);
    }

    public Herbivore(int numPuceId, String type, double prixNourritureKg, double poidsAlimentsIngeresParMois, int tempsSoigneurParMois) {
        super(numPuceId, type, prixNourritureKg, poidsAlimentsIngeresParMois, tempsSoigneurParMois);
    }

    @Override
    public String toString() {
        return "Je suis un.e "+ this.type + " : un animal/herbivore";
    }

    //PRIXSOINS : le coup fixe;
    // 100 : le cout du soignant par mois;
    // 100 : la prime pour les herbivores
    @Override
    public double coutSoin() {
        if(this.estNocturne){
            return (PRIXSOINS + 100 +100)*2;
        } else {
            return PRIXSOINS + 100 +100;
        }
    }
}
