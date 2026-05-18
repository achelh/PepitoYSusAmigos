public class EquipArquerIGuerrer extends Equip {
    public EquipArquerIGuerrer(String nom) {
        super(nom);
        afegirPersonatge(new Arquer("Alys", this));
        afegirPersonatge(new Guerrer("Borguin", this));
    }
}
