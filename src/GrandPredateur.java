public class GrandPredateur extends Carnivore implements NecessiteSoins{


    public GrandPredateur(double prixNourritureKg, double poidsAlimentsIngeresParMois, int tempsSoigneurParMois) {
        super(prixNourritureKg, poidsAlimentsIngeresParMois, tempsSoigneurParMois);
    }

    public GrandPredateur(int numPuceId, String type, double prixNourritureKg, double poidsAlimentsIngeresParMois, int tempsSoigneurParMois) {
        super(numPuceId, type, prixNourritureKg, poidsAlimentsIngeresParMois, tempsSoigneurParMois);
    }

    @Override
    public String toString() {
        return "Je suis un.e "+ this.type + " : un animal/carnivore/grand prédateur";
    }

    //PRIXSOINS : le coup fixe;
    // 100 : le cout du soignant par mois;
    // 400 : la prime pour les grands prédateurs
    @Override
    public double coutSoin() {
        if(this.estNocturne){
            return (PRIXSOINS + 100 + 400)*2;
        } else {
            return PRIXSOINS + 100 + 400;
        }
    }
}
