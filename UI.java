import java.util.ArrayList;
import java.util.Scanner;

public class UI {
    private static Scanner entrada = new Scanner(System.in);

    public static Personatge escollirOponent(Personatge atacant, ArrayList<Personatge> personatges) {
        System.out.println();
        System.out.println("És el torn de " + atacant.getNom());
        mostrarPersonatgesIVida(personatges);
        System.out.println(atacant.getNom() + ", escull a qui vols atacar:");
        int escollit = entrada.nextInt();
        return personatges.get(escollit-1);
    }

    public static void mostrarPersonatgesIVida(ArrayList<Personatge> personatges) {
        int i = 0;
        for (Personatge p : personatges) {
            System.out.println((i+1) + ". [" + p.getEquip().getNom() + "] " + p.getNom() + " ("+p.getVidaOMort()+")");
            i++;
        }
    }

    public static void mostrarFerAtac(Personatge atacant, Personatge atacat, int mal) {
        System.out.println(atacant.getNom() + " ataca a " + atacat.getNom() + " i li llança " + mal + " punts de mal");
    }

    public static void mostrarRebreAtac(Personatge p, int vidaActual, boolean viu) {
        System.out.println(p.getNom() + " ha estat atacat, ara té " + vidaActual + " de vida.");
        if (!viu) {
            System.out.println(p.getNom() + " ha mort.");
        }
    }

    public static void mostrarFi(ArrayList<Personatge> personatges) {
        System.out.println();
        System.out.println("Estadístiques finals:");
        mostrarPersonatgesIVida(personatges);
        System.out.println("Gràcies per jugar.");
    }
    public static int escollirAccioCurandera(Personatge origen, Personatge objectiu) {
        System.out.println(origen.getNom() + ", què vols fer amb " + objectiu.getNom() + "?");
        System.out.println("1. Curar");
        System.out.println("2. Atacar");

        return entrada.nextInt();
    }

    public static void mostrarCura(Personatge curador, Personatge elquetris, int quantitat) {
        System.out.println(curador.getNom() + " cura a " + elquetris.getNom() + " +" + quantitat + " vida");
    }

    public static void mostrarVeri(Personatge origen, Personatge elquetris, int mal) {
        System.out.println(elquetris.getNom() + " rep " + mal + " de mal per verí de " + origen.getNom());
    }
}
