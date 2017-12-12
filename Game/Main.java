import java.util.Scanner;
public class Main
{
    static Character PC = new Player();
    static ClassList cList = new ClassList();
    static Scanner scanner = new Scanner(System.in);

    public static void chooseName()
    {
        System.out.println("What is your name?");
        String name = scanner.next();

        int response = 0;
        while(response != 1 || response != 2){
            try
            {
                System.out.println("Your name is " + name + "?\n"
                    + "[1]: Yes.\n"
                    + "[2]: No.");
                response = scanner.nextInt();
            }
            catch(Exception e)
            {
            }
        }
        if(response == 2)
        {
            chooseName();
        }
        else
        {
            PC.setName(name);
        }
    }

    public static void chooseClass(){
        int charClass = 0;
        while(charClass < 1 || charClass > 12)
        {
            try
            {
                System.out.println("What class would you like to be?\n"
                    + "[1]: Barbarian\n"
                    + "[2]: Bard\n"
                    + "[3]: Cleric\n"
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
            }
        }
        charClass += 4000;

        int response = 0;
        while(response != 1 || response != 2){
            try
            {
                System.out.println("You want to be a " + cList.classMap.get(charClass).getName() + "?\n"
                    + "[1]: Yes.\n"
                    + "[2]: No.");
                response = scanner.nextInt();
            }
            catch(Exception e)
            {
            }
        }
        if(response == 2)
        {
            chooseClass();
        }
        else
        {
            PC.setCharClass(charClass);
        }
    }

    public static void main()
    {
        chooseName();
        chooseClass();
    }
}

