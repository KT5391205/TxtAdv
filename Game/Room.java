public class Room
{
    private int id;
    private int events;
    private boolean loot;
    
    public Room()
    {
    }
    
    //Getters and Setters
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
    
    /**
     * Enemies
     */
    public int getEvents()
    {
        return events;
    }
    public void setEvents(int e)
    {
        events = e;
    }
    
    /**
     * Loot
     */
    public boolean getLoot()
    {
        return loot;
    }
    public void setLoot(boolean l)
    {
        loot = l;
    }
}
