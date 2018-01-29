public class Armor extends Items
{
    private int ac;
    private String type;
    private int minStr;
    
    public Armor()
    {
    }
    
    //Accessor Methods
    public int getAc()
    {
        return ac;
    }
    
    public String getType()
    {
        return type;
    }
    
    public int getMinStr()
    {
        return minStr;
    }
    
    //Mutator Methods
    public void setAc(int a)
    {
        ac = a;
    }
    
    public void setType(String t)
    {
        type = t;
    }
    
    public void setMinStr(int s)
    {
        minStr = s;
    }
}
