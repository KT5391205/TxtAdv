public abstract class Items
{
    protected String name;
    protected String desc;
    protected int value;
    protected int id;
    protected int hands;
    
    //Accessor Methods
    public String getName()
    {
        return name;
    }
    
    public String getDesc()
    {
        return desc;
    }
    
    public int getValue()
    {
        return value;
    }
    
    public int getId()
    {
        return id;
    }
    
    public int getHands()
    {
        return hands;
    }
    
    //Mutator Methods
    public void setName(String n)
    {
        name = n;
    }
    
    public void setDesc(String d)
    {
        desc = d;
    }
    
    public void setValue(int v)
    {
        value = v;
    }
    
    public void setId(int i)
    {
        id = i;
    }
    
    public void setHands(int h)
    {
        hands = h;
    }
}
