import java.util.HashMap;
public class ItemList
{
    public HashMap<Integer, Item> itemMap = new HashMap<Integer, Item>();
    public ItemList()
    {
        //Broom - 3001
        Item Broom = new Item();
        Broom.setName("broom");
        Broom.setDesc("a broom");
        Broom.setValue(5);
        Broom.setId(3001);
        itemMap.put(Broom.getId(), Broom);
        
        //Egg - 3002
        Item Egg = new Item();
        Egg.setName("strange egg");
        Egg.setDesc("an egg-shaped object with random human facial features strewn about it");
        Egg.setValue(-1);
        Egg.setId(3001);
        itemMap.put(Egg.getId(), Egg);
    }
}
