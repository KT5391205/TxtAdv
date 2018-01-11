public abstract class Event
{
    protected String name;
    protected int id;
    
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
     * ID
     */
    public int getId()
    {
        return id;
    }
    public void setId(int i)
    {
        id = i;
    }
}
