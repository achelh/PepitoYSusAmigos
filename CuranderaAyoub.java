import java.util.Scanner;

public class CuranderaAyoub extends Personatge {

    private final int CURACIO = 20;
    private final int MAL = 8;

    public CuranderaAyoub(String nom, Equip equip) {
        super(nom, equip);
    }

    @Override
    public void ferAccio(Personatge elquetris) {

        int missatge = UI.escollirAccioCurandera(this, elquetris);

        if (missatge == 1) {
            curar(elquetris);
        } else {
            atacarAmbMal(elquetris, MAL);
        }
    }

    private void curar(Personatge p) {
        UI.mostrarCura(this, p, CURACIO);
        p.curar(CURACIO);
    }
}