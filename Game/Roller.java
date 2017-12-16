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
    
    public int rollPool(int q)
    {
        int result = 0;
        int ones = 0;
        
        for(int i = 0; i < q; i++)
        {
            int roll = roll(1, 6);
            if(roll > 3)
            {
                result += 1;
            }
            else if(roll == 1)
            {
                ones += 1;
            }
        }
        if(ones > (int)(q / 2))
        {
            result = 0;
        }
        return result;
    }
}
