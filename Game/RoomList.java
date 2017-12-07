import java.util.HashMap;

public class RoomList
{
    public HashMap<Integer, Room> roomList = new HashMap<Integer, Room>();
    
    public RoomList()
    {
        //Tutorial
        Room Tutorial = new Room();
        Tutorial.setId(5001);
        Tutorial.setEvents(0);
        Tutorial.setLoot(true);
    }
    
    public Room getRoom(int i)
    {
        return roomList.get(i);
    }
}
