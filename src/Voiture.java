public class Voiture implements ModeLivraison {
    @Override
    public String livrer(infoColis info) {

        return "Delivering by car with package poids: " + info.getPoids();
    }
}
