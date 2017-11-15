public class Weapon extends Items
{
    private int minDamage;
    private int maxDamage;
    private String damType;
    private int hands;
    
    public Weapon()
    {
    }
    
    //Accessor Methods
    public int getDamage(int i)
    {
        if(i == 1)
        {
            return minDamage;
        }else if(i == 2)
        {
            return maxDamage;
        }else
        {
            return 0;
        }
    }
    
    public String getDamType()
    {
        return damType;
    }
    
    public int getHands()
    {
        return hands;
    }
    
    //Mutator Methods
    public void setDamage(int min, int max)
    {   minDamage = min;
        maxDamage = max;
    }
    
    public void setDamType(String d)
    {
        damType = d;
    }
    
    public void setHands(int h)
    {
        hands = h;
    }
}
