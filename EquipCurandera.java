public class EquipCurandera extends Equip {
    public EquipCurandera(String nom) {
        super(nom);
        afegirPersonatge(new CuranderaAyoub("Sanador", this));
        afegirPersonatge(new Verinador("Ayoub", this));
    }
}