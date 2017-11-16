import java.util.HashMap;

public class ItemList
{
    public HashMap<Integer, Item> itemmap = new HashMap<Integer, Item>();
    public ItemList()
    {
        Item Broom = new Item();
        Broom.setName("broom");
        Broom.setDesc("a broom");
        Broom.setValue(5);
        Broom.setId(3001);
        itemmap.put(0, Broom);
    }
}
