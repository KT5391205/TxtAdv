public class Roller
{
    public int roll(int q, int n)
    {
        int result = 0;
        for(int i = 0; i < q; i++)
        {
            int roll = (int)(Math.random() * n + 1);
            result = result + roll;
        }
        return result;
    }
}
