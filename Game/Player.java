public class Player extends Character
{
    public Player()
    {
    }
    
    public Player(String n, String cc, int l, int s, int d, int f, int i, int w, int c, int wep, int arm)
    {
        name = n;
        charClass = cc;
        level = l;
        str = s;
        dex = d;
        con = f;
        intel = i;
        wis = w;
        cha = c;
        wep = this.wep;
        arm = this.arm;
    }
}
