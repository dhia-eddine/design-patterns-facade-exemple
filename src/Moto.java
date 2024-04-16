public class Moto implements ModeLivraison{
    @Override
    public String livrer(infoColis info) {
        return "Delivering by moto with package poids: " + info.getPoids();
    }
}
