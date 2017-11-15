import java.util.HashMap;

public class WeaponList
{
    HashMap<Integer, Weapon> weaponmap = new HashMap<Integer, Weapon>();
    public WeaponList()
    {
        //Dagger - 1001
        Weapon Dagger = new Weapon();
        Dagger.setName("dagger");
        Dagger.setDesc("a short, double-edged blade made for piercing. It can be thrown");
        Dagger.setValue(10);
        Dagger.setId(1001);
        Dagger.setDamage(1, 4);
        Dagger.setDamType("piercing");
        Dagger.setHands(1);
        weaponmap.put(Dagger.id, Dagger);
        
        //Mace - 1002
        Weapon Mace = new Weapon();
        Mace.setName("mace");
        Mace.setDesc("a one-handed steel club with a flanged end");
        Mace.setValue(15);
        Mace.setId(1002);
        Mace.setDamage(1, 6);
        Mace.setDamType("bludgeoning");
        Mace.setHands(1);
        weaponmap.put(Mace.id, Mace);
        
        //Longsword - 1003
        Weapon Longsword = new Weapon();
        Longsword.setName("longsword");
        Longsword.setDesc("a large blade meant to be used with either one or two hands");
        Longsword.setValue(30);
        Longsword.setId(1003);
        Longsword.setDamage(1, 8);
        Longsword.setDamType("slashing");
        Longsword.setHands(1);
        weaponmap.put(Longsword.id, Longsword);
    }
}
