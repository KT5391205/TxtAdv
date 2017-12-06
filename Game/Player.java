public class Player extends Character
{
    public Player()
    {
    }
    
    public Player(String n, int cc, int l, int s, int d, int f, int i, int w, int c, int we, int ar, int mHp)
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
        wep = we;
        arm = ar;
        maxHp = mHp;
    }
}
