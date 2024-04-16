public class ServiceLivraison {

    public String livrerColis(infoColis info) {

        if (info.getPoids().equals("large")) {
            return new Voiture().livrer(info);
        }

        if (info.getPoids().equals("small")) {
            return new Moto().livrer(info);
        }

        return "Invalid poids value";
    }
}