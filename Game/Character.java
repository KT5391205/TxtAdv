public abstract class Character
{
    protected String name;
    protected String charClass;
    protected int level;
    protected int xp;
    protected int str;
    protected int dex;
    protected int con;
    protected int intel;
    protected int wis;
    protected int cha;
    protected int strMod;
    protected int dexMod;
    protected int conMod;
    protected int intelMod;
    protected int wisMod;
    protected int chaMod;
    protected int wep;
    protected int arm;
    
    WeaponList wList = new WeaponList();
    Roller roller = new Roller();
    
    public void attack(Character a, Character d)
    {
        //Assailant Stats
        Character Assailant = a;
        Weapon aWeapon = wList.getWeapon(Assailant.getWep());
        int aMinDam = aWeapon.getDamage(1);
        int aMaxDam = aWeapon.getDamage(2);
        
        //Defender Stats
        Character Defender = d;
        Weapon dWeapon = wList.getWeapon(Defender.getWep());
        int dMinDam = dWeapon.getDamage(1);
        int dMaxDam = dWeapon.getDamage(2);
        
        System.out.println(a.getName() + " attacks " + d.getName() + " with a " + aWeapon.getName() + ".");
        System.out.println(d.getName() + " defends with a " + dWeapon.getName() + " with " + d.getArm());
    }
    
    //Accessor Methods
    public String getName()
    {
        return name;
    }

    public String getCharClass()
    {
        return charClass;
    }
    
    public int getLevel()
    {
        return level;
    }

    public int getXp()
    {
        return xp;
    }

    public int getStr()
    {
        return str;
    }

    public int getDex()
    {
        return dex;
    }

    public int getCon()
    {
        return con;
    }

    public int getIntel()
    {
        return intel;
    }

    public int getWis()
    {
        return wis;
    }

    public int getCha()
    {
        return cha;
    }

    public int getStrMod()
    {
        return strMod;
    }

    public int getDexMod()
    {
        return dexMod;
    }

    public int getConMod()
    {
        return conMod;
    }

    public int getIntelMod()
    {
        return intelMod;
    }

    public int getWisMod()
    {
        return wisMod;
    }

    public int getChaMod()
    {
        return chaMod;
    }
    
    public int getWep()
    {
        return wep;
    }
    
    public int getArm()
    {
        return arm;
    }

    //Mutator Methods
    public void setName(String n)
    {
        name = n;
    }

    public void setCharClass(String cc)
    {
        charClass = cc;
    }

    public void setLevel(int l)
    {
        level = l;
    }

    public void setXp(int x)
    {
        xp = x;
    }

    public void setStr(int s)
    {
        str = s;
        strMod = s / 2 - 5;
    }

    public void setDex(int d)
    {
        dex = d;
        dexMod = d / 2 - 5;
    }

    public void setCon(int f)
    {
        con = f;
        conMod = f / 2 - 5;
    }

    public void setIntel(int i)
    {
        intel = i;
        intelMod = i / 2 - 5;
    }

    public void setWis(int w)
    {
        wis = w;
        wisMod = w / 2 - 5;
    }

    public void setCha(int c)
    {
        cha = c;
        chaMod = c / 2 - 5;
    }
    
    public void setWep(int w)
    {
        wep = w;
    }
    
    public void setArm(int a)
    {
        arm = a;
    }
}
