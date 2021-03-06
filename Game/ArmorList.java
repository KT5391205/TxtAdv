import java.util.HashMap;

public class ArmorList
{
    public HashMap<Integer, Armor> armormap = new HashMap<Integer, Armor>();
    public ArmorList()
    {
        //Gambeson - 2001
        Armor Gambeson = new Armor();
        Gambeson.setName("gambeson");
        Gambeson.setDesc("a protective, padded doublet");
        Gambeson.setValue(10);
        Gambeson.setId(2001);
        Gambeson.setAc(11);
        Gambeson.setType("light");
        armormap.put(Gambeson.getId(), Gambeson);
        
        //Half-Plate - 2002
        Armor HalfPlate = new Armor();
        HalfPlate.setName("half-plate");
        HalfPlate.setDesc("a metal breastplate with gauntlets and greaves");
        HalfPlate.setValue(30);
        HalfPlate.setId(2002);
        HalfPlate.setAc(14);
        HalfPlate.setType("medium");
        armormap.put(HalfPlate.getId(), HalfPlate);
        
        //Plate - 2003
        Armor Plate = new Armor();
        Plate.setName("plate");
        Plate.setDesc("a full suit of plate metal");
        Plate.setValue(60);
        Plate.setId(2003);
        Plate.setAc(18);
        Plate.setType("heavy");
        Plate.setMinStr(14);
        armormap.put(Plate.getId(), Plate);
        
        //Buckler - 2004
        Armor Buckler = new Armor();
        Buckler.setName("buckler");
        Buckler.setDesc("a small, round shield");
        Buckler.setValue(15);
        Buckler.setId(2004);
        Buckler.setAc(1);
        Buckler.setType("shield");
        armormap.put(Buckler.getId(), Buckler);
    }
}
