import java.util.HashMap;

public class ClassList
{
    public HashMap<Integer, CharacterClass> classMap = new HashMap<Integer, CharacterClass>();
    
    public ClassList()
    {
        //Barbarian
        CharacterClass Barbarian = new CharacterClass();
        Barbarian.setName("barbarian");
        Barbarian.setId(4001);
        Barbarian.setSkills(3, 7, -1, -1);
        classMap.put(Barbarian.getId(), Barbarian);
    }
    
    public CharacterClass getCharacterClass(int i)
    {
        return classMap.get(i);
    }
}
