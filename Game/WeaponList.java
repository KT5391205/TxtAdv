import java.util.HashMap;

public class WeaponList
{
    public HashMap<Integer, Weapon> weaponMap = new HashMap<Integer, Weapon>();
    
    public WeaponList()
    {
        //Dagger - 1001
        Weapon Dagger = new Weapon();
        Dagger.setName("dagger");
        Dagger.setDesc("a short, double-edged blade made for piercing");
        Dagger.setValue(10);
        Dagger.setId(1001);
        Dagger.setDamage(1, 4);
        Dagger.setDamType("piercing");
        Dagger.setMinStr(-1);
        weaponMap.put(Dagger.id, Dagger);
        
        //Mace - 1002
        Weapon Mace = new Weapon();
        Mace.setName("mace");
        Mace.setDesc("a one-handed steel club with a flanged end");
        Mace.setValue(15);
        Mace.setId(1002);
        Mace.setDamage(1, 6);
        Mace.setDamType("bludgeoning");
        Mace.setMinStr(8);
        weaponMap.put(Mace.id, Mace);
        
        //Longsword - 1003
        Weapon Longsword = new Weapon();
        Longsword.setName("longsword");
        Longsword.setDesc("a large blade meant to be used with either one or two hands");
        Longsword.setValue(30);
        Longsword.setId(1003);
        Longsword.setDamage(1, 8);
        Longsword.setDamType("slashing");
        Longsword.setMinStr(10);
        weaponMap.put(Longsword.id, Longsword);
        
        //Stick - 1004
        Weapon Stick = new Weapon();
        Stick.setName("stick");
        Stick.setDesc("a simple wooden stick");
        Stick.setValue(1);
        Stick.setId(1004);
        Stick.setDamage(1, 1);
        Stick.setDamType("bludgeoning");
        Stick.setMinStr(-1);
        weaponMap.put(Stick.id, Stick);
        
        //Dragon Slayer - 1005
        Weapon DragonSlayer = new Weapon();
        DragonSlayer.setName("Dragon Slayer");
        DragonSlayer.setDesc("an oversized sword wielded by a hero after a great eclipse");
        DragonSlayer.setValue(-1);
        DragonSlayer.setId(1005);
        DragonSlayer.setDamage(4, 24);
        DragonSlayer.setDamType("slashing");
        DragonSlayer.setMinStr(18);
        weaponMap.put(DragonSlayer.id, DragonSlayer);
    }
    
    public Weapon getWeapon(int i)
    {
        return weaponMap.get(i);
    }
}
