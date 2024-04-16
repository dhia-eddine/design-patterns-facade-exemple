public class Client {
    public void passerCommande(infoColis info, ModeLivraison mode) {
        mode.livrer(info);
    }
}