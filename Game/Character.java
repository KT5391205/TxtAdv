public abstract class Character
{
    protected String name;
    protected int charClass;
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
    protected int currentHp;
    protected int atkStat;

    ClassList cList = new ClassList();
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
    
    public void hpInit()
    {
        int charHd = cList.getCharacterClass(charClass).getHd();
        maxHp = (int)(charHd + (level - 1) * (charHd / 2 + 1));
    }
    
    public void gainXp(int x)
    {
        xp = xp + x;
        
        while(level < xp / 300)
        {
            level++;
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
    public CharacterClass getCharClass()
    {
        return cList.getCharacterClass(charClass);
    }
    public void setCharClass(int c)
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
     * Strength
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
     * Dexterity
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
     * Constitution
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
     * Intelligence
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
     * Wisdom
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
     * Charisma
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
     * Weapon
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
     * Armor
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
     * Hit Points
     */
    public int getMaxHp()
    {
        return maxHp;
    }
    public int getCurrentHp()
    {
        return currentHp;
    }
    
    public int mod(int i)
    {
        int mod = (int)(i / 2 - 5);
        return mod;
    }
}
