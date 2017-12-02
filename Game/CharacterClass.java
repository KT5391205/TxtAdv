
/**
 * Write a description of class CharacterClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CharacterClass
{
    private String name;
    private int hd;
    private int[] skills = new int[4];
    private int id;
    
    public CharacterClass()
    {
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
     * Hit Dice
     */
    public int getHd()
    {
        return hd;
    }
    public void setHd(int h)
    {
        hd = h;
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
    
    /**
     * Skills
     */
    public int getSkills(int i)
    {
        return skills[i];
    }
    public void setSkills(int s1, int s2, int s3, int s4)
    {
        skills[0] = s1;
        skills[1] = s2;
        skills[2] = s3;
        skills[3] = s4;
    }
}
