import java.util.Scanner;
public class Main
{
    public static void characterCreate()
    {
        //Name
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your name?");
        String name = scanner.next();
        
        //Class
        int charClass = 0;
        try
        {
            System.out.println("Class?\n"
                + "[1]: Barbarian\n"
                + "[2]: Bard\n"
                + "[3]; Cleric\n"
                + "[4]: Druid\n"
                + "[5]: Fighter\n"
                + "[6]: Monk\n"
                + "[7]: Paladin\n"
                + "[8]: Ranger\n"
                + "[9]: Rogue\n"
                + "[10]: Sorcerer\n"
                + "[11]: Warlock\n"
                + "[12]: Wizard");
            charClass = scanner.nextInt();
        }
        catch(Exception e)
        {
            System.out.print("May God have mercy on your soul.");
            charClass = 0;
        }
        charClass += 4000;
        
        //Ability Scores
        
        
        Character PC = new Player();
    }
}
