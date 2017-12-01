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
    protected int wep;
    protected int arm;
    protected int maxHp;
    protected int atkStat;

    WeaponList wList = new WeaponList();
    Roller dice = new Roller();

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
        System.out.println(d.getName() + " takes " + (dice.roll(aMinDam, aMaxDam) + a.mod(a.getAtkStat())) + " damage.");
    }
    
    public int getAtkStat()
    {
        if(wList.getWeapon(wep).getFinesse() == true && dex > str)
        {
            return dex;
        }
        else
        {
            return str;
        }
    }
    
    //Getters and Setters
    /**
     * Name
     */
    public String getName()
    {
        return name;
    }
    public void setName(String n)
    {
        name = n;
    }

    /**
     * Class
     */
    public String getCharClass()
    {
        return charClass;
    }
    public void setCharClass(String c)
    {
        charClass = c;
    }

    /**
     * Level
     */
    public int getLevel()
    {
        return level;
    }
    public void setLevel(int l)
    {
        level = l;
    }

    /**
     * XP
     */
    public int getXp()
    {
        return xp;
    }
    public void setXp(int x)
    {
        xp = x;
    }

    /**
     * Str
     */
    public int getStr()
    {
        return str;
    }
    public void setStr(int s)
    {
        str = s;
    }

    /**
     * Dex
     */
    public int getDex()
    {
        return dex;
    }
    public void setDex(int d)
    {
        dex = d;
    }

    /**
     * Con
     */
    public int getCon()
    {
        return con;
    }
    public void setCon(int f)
    {
        con = f;
    }

    /**
     * Int
     */
    public int getIntel()
    {
        return intel;
    }
    public void setIntel(int i)
    {
        intel = i;
    }

    /**
     * Wis
     */
    public int getWis()
    {
        return wis;
    }
    public void setWis(int w)
    {
        wis = w;
    }

    /**
     * Cha
     */
    public int getCha()
    {
        return cha;
    }
    public void setCha(int c)
    {
        cha = c;
    }
    
    /**
     * Wep
     */
    public int getWep()
    {
        return wep;
    }
    public void setWep(int w)
    {
        wep = w;
    }
    
    /**
     * Arm
     */
    public int getArm()
    {
        return arm;
    }
    public void setArm(int a)
    {
        arm = a;
    }
    
    /**
     * MaxHp
     */
    public int getMaxHp()
    {
        return maxHp;
    }
    
    public int mod(int i)
    {
        int mod = (int)(i / 2 - 5);
        return mod;
    }
}
