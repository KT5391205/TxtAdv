import java.util.Scanner;

public class Dialogue extends Event
{
    static Scanner scanner = new Scanner(System.in);
    
    /**
     * Test Method
     */
    public static void test()
    {
        int response = 0;
        while(response != 1 && response != 2)
        {
            try
            {
                System.out.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore"
                    + " et dolore magna aliqua.\n"
                    + "[1]: Yes\n"
                    + "[2]: No\n");
                response = scanner.nextInt();
            }
            catch(Exception e)
            {
            }
        }
        if(response == 1)
        {
            System.out.println("Yes.");
            response = 0;
            
            while(response != 1 && response != 2 && response != 3)
            {
                try
                {
                    System.out.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut"
                    + "labore et dolore magna aliqua.\n"
                    + "[1]: Option 1\n"
                    + "[2]: Option 2\n"
                    + "[3]: Option 3");
                    response = scanner.nextInt();
                }
                catch(Exception e)
                {
                }
                if(response == 1)
                {
                    System.out.println("One.");
                }
                else if(response == 2)
                {
                    System.out.println("Two.");
                }
                else if(response == 3)
                {
                    System.out.println("Three.");
                }
            }
        }
        else if(response == 2)
        {
            System.out.println("No.");
        }
    }
}
