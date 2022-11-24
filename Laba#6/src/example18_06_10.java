public class example18_06_10
{
    public static void main(String[] args) 
    {
        int[] arr = new int[]{4,654,1,21,32,324,2,1,20,15};
        int[] res = new int[2];
        
        res = Program.minMax(arr);
        System.out.print("Min:"+res[0]+"\nMax:"+res[1]);

    }

    static class Program
    {
        static int[] minMax(int ... nums)
        {
            int max = 0, min = 3;
            int[] mm = new int[2];
            
            for (int i=0; i<nums.length; i++)
            {
                if (max<nums[i])
                {
                    max=nums[i];
                }else if (min>nums[i])
                {
                    min=nums[i];
                }
            }
            mm[0] = min;
            mm[1] = max;
            
            return mm;
        }
    }
}