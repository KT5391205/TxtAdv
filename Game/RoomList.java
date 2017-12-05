import java.util.HashMap;

public class RoomList
{
    public HashMap<Integer, Room> roomList = new HashMap<Integer, Room>();
    
    public RoomList()
    {
    }
    
    public Room getRoom(int i)
    {
        return roomList.get(i);
    }
}
