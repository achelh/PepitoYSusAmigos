public class EquipArquers extends Equip {
    public EquipArquers(String nom) {
        super(nom);
        afegirPersonatge(new Arquer("Elowen", this));
        afegirPersonatge(new Arquer("Thalion", this));
    }
}
