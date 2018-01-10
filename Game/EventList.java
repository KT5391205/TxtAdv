import java.util.HashMap;

public class EventList
{
    public HashMap<Integer, Event> eventMap = new HashMap<Integer, Event>();
    
    public EventList()
    {
        //Test Event
        Event testEvent = new Dialogue();
        testEvent.setName("Test");
        testEvent.setId(6000);
        eventMap.put(0, testEvent);
    }
}
