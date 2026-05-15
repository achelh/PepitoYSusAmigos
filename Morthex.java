public class Morthex extends Personatge {

    public Morthex(String nom) {
        super(nom);
    }

    public void atacar(Personatge oponent) {
        int malTotal = 0;

        for (int i = 0; i < 5; i++) {
            malTotal += Dau.tirar(6);
        }

        augmentarMalFet(malTotal);
        super.atacarAmbMal(oponent, malTotal);
    }
}
