import java.util.ArrayList;

public class Zoo {

    //création de la liste d'animaux
    static ArrayList<Animal> listAnimal = new ArrayList<Animal>();
    public static void voiciMesAnimaux(){
        for (Animal animal : listAnimal) {
            System.out.println( "Animal : id: " + animal.getNumPuceId() + "; type: " + animal.getType() );
        }
    }

    public static double budgetNourritureTotal(ArrayList<Animal> animals){
        double res = 0;
        for (Animal animal : animals) {
            res+= animal.coutNourriture();
        }
        return res;
    }

    public static double chercheCoutNourriture(int identification){
        double res = 0;
        for (Animal animal : listAnimal) {
            if(animal.getNumPuceId() == identification){
                res+= animal.coutNourriture();
            }
        }
        return res;
    }


    public static double coutGeneralZoo(ArrayList<Animal> animals){
        double res = 0;
        for (Animal animal : animals) {
            res+=animal.coutNourriture();
            if(animal instanceof PetitPredateur || animal instanceof GrandPredateur || animal instanceof Herbivore)
                res+=animal.coutSoin();
        }
        return res;
    }

    public static void main(String[] args) {

        //Création des grands prédateurs et ajout dans la liste
        GrandPredateur gp1 = new GrandPredateur(1,"Tigre",4,1000,10);
        listAnimal.add(gp1);
        GrandPredateur gp2 = new GrandPredateur(2,"Lion",4,2000,5);
        listAnimal.add(gp2);

        //Création des petit prédateurs et ajout dans la liste
        PetitPredateur pp1 = new PetitPredateur(3,"serpent", 3,10, 10);
        listAnimal.add(pp1);
        pp1.setEstNocturne(true);
        PetitPredateur pp2 = new PetitPredateur(4,"chauve-souris", 3,5, 20);
        listAnimal.add(pp2);

        //Création des herbivores et ajout dans la liste
        Herbivore h1 = new Herbivore(5,"Zèbre",0.05,1000,30);
        listAnimal.add(h1);
        Herbivore h2 = new Herbivore(6,"Vache",0.05,5000,20);
        listAnimal.add(h2);

        //test
        voiciMesAnimaux();
        System.out.println("Prix total nourriture zoo : " + budgetNourritureTotal(listAnimal));
        System.out.println("Prix nourriture animal n°2 : " + chercheCoutNourriture(2));
        System.out.println("Prix global zoo : " + coutGeneralZoo(listAnimal));
        System.out.println("Prix soin : " + pp2.coutSoin());
        System.out.println("Prix soin doublé : " + pp1.coutSoin());




    }


}

