public class Room
{
    private int id;
    private boolean enemies;
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
    public boolean getEnemies()
    {
        return enemies;
    }
    public void setEnemies(boolean e)
    {
        enemies = e;
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
