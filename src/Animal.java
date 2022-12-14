public abstract class Animal {
    int numPuceId;
    String type;
    double prixNourritureKg;
    double poidsAlimentsIngeresParMois;
    int tempsSoigneurParMois;

    boolean estNocturne;

    public Animal(double prixNourritureKg, double poidsAlimentsIngeresParMois, int tempsSoigneurParMois) {
        this.numPuceId = 0;
        this.type = "NonConnu";
        this.estNocturne = false;
        this.prixNourritureKg = prixNourritureKg;
        this.poidsAlimentsIngeresParMois = poidsAlimentsIngeresParMois;
        this.tempsSoigneurParMois = tempsSoigneurParMois;
    }

    public Animal(int numPuceId, String type, double prixNourritureKg, double poidsAlimentsIngeresParMois, int tempsSoigneurParMois) {
        this.estNocturne = false;
        this.numPuceId = numPuceId;
        this.type = type;
        this.prixNourritureKg = prixNourritureKg;
        this.poidsAlimentsIngeresParMois = poidsAlimentsIngeresParMois;
        this.tempsSoigneurParMois = tempsSoigneurParMois;
    }

    public int getNumPuceId() {
        return this.numPuceId;
    }

    public String getType() {
        return this.type;
    }

    public void setEstNocturne(boolean estNocturne) {
        this.estNocturne = estNocturne;
    }

    public double coutNourriture(){
        return this.prixNourritureKg * this.poidsAlimentsIngeresParMois;
    }


    public double coutSoin() {
        return 0;
    }
}
