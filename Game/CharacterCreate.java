import java.util.Scanner;
public class CharacterCreate
{
    static Scanner scanner = new Scanner(System.in);
    static Character character = new Player();
    static String[] abilityNames = new String[6];
    
    public static void chooseName()
    {
        System.out.print("What is your name?");
        String name = scanner.next();

        int response = 0;
        while(response != 1 && response != 2)
        {
            try
            {
                System.out.println("Your name is " + name + "?\n"
                    + "[1]: Yes.\n"
                    + "[2]: No.");
                response = scanner.nextInt();
            }
            catch(Exception e)
            {
                System.out.println("That is not a valid response.");
            }
        }
        if(response == 2)
        {
            chooseName();
        }
    }
    
    public static void chooseAbl()
    {
        
        int abl = 0;
        while(abl < 1 | abl > 6)
        {
            try
            {
                System.out.println("What would you like your greatest ability score to be?");
                abl = scanner.nextInt();
            }
            catch(Exception e)
            {
            }
        }
    }
}
