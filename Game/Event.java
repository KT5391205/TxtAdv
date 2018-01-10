public abstract class Event
{
    protected String name;
    protected int id;
    
    public String getName()
    {
        return name;
    }
    public void setName(String n)
    {
        name = n;
    }
    
    public int getId()
    {
        return id;
    }
    public void setId(int i)
    {
        id = i;
    }
}
