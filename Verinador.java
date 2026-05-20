public class Verinador extends Personatge {

    private final int mal = 10;
    private final int veri = 5;
    private Personatge ultimatacat;

    public Verinador(String nom, Equip equip) {
        super(nom, equip);
        ultimatacat = null;
    }


    public void ferAccio(Personatge atacat) {
        atacarAmbMal(atacat, mal);
        ultimatacat = atacat;
    }

    @Override
    public void torn(Combatents combatents) {

        if (ultimatacat != null && ultimatacat.esViu()) {
            UI.mostrarVeri(this, ultimatacat, veri);
            ultimatacat.rebreMal(veri);
        }

        super.torn(combatents);
    }
}