public class EquipGuerrers extends Equip {
    public EquipGuerrers(String nom) {
        super(nom);
        afegirPersonatge(new Guerrer("Kaelen", this));
        afegirPersonatge(new Guerrer("Morvath", this));
    }
}
