public class Armor extends Items
{
    private int ac;
    private String type;
    
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
    
    //Mutator Methods
    public void setAc(int a)
    {
        ac = a;
    }
    
    public void setType(String t)
    {
        type = t;
    }
}
