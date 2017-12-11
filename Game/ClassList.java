import java.util.HashMap;

public class ClassList
{
    public HashMap<Integer, CharacterClass> classMap = new HashMap<Integer, CharacterClass>();
    
    public ClassList()
    {
        //Deprived
        CharacterClass Deprived = new CharacterClass();
        Deprived.setName("deprived");
        Deprived.setId(4000);
        Deprived.setSkills(-1, -1, -1, -1);
        classMap.put(Deprived.getId(), Deprived);
        
        //Barbarian
        CharacterClass Barbarian = new CharacterClass();
        Barbarian.setName("barbarian");
        Barbarian.setId(4001);
        Barbarian.setSkills(3, 7, -1, -1);
        classMap.put(Barbarian.getId(), Barbarian);
        
        //Bard
        CharacterClass Bard = new CharacterClass();
        Bard.setName("bard");
        Bard.setId(4002);
        Bard.setSkills(4, 12, 13, -1);
        classMap.put(Bard.getId(), Bard);
        
        //Cleric
        CharacterClass Cleric = new CharacterClass();
        Cleric.setName("cleric");
        Cleric.setId(4003);
        Cleric.setSkills(2, 14, -1, -1);
        classMap.put(Cleric.getId(), Cleric);
        
        //Fighter
        CharacterClass Fighter = new CharacterClass();
        Fighter.setName("fighter");
        Fighter.setId(4004);
        Fighter.setSkills(3, 11, -1, -1);
        classMap.put(Fighter.getId(), Fighter);
        
        //Monk
        CharacterClass Monk = new CharacterClass();
        Monk.setName("monk");
        Monk.setId(4005);
        Monk.setSkills(6, 11, -1, -1);
        classMap.put(Monk.getId(), Monk);
        
        //Ranger
        CharacterClass Ranger = new CharacterClass();
        Ranger.setName("ranger");
        Ranger.setId(4006);
        Ranger.setSkills(6,6,6,6);
    }
    
    public CharacterClass getCharacterClass(int i)
    {
        return classMap.get(i);
    }
}
