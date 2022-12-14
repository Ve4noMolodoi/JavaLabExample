
public class example18_06_03 
{
    public static void main(String[] args) 
    {
        int[] arr = new int[]{4,654,1,21,32,324,2,22,20,15};

        System.out.print("Maximum: ");
        Mma.max(arr);

        System.out.print("Minimum: ");
        Mma.min(arr);
        
        System.out.print("Average: ");
        Mma.average(arr);
    }

    static class Mma
    {
        static void max(int... num)
        {
            int[] nums = num;
            int b = 0;

            for ( int a = 0; a < nums.length; a++)
            {
                if (b < nums[a])
                {
                    b = nums[a];
                }
            }
            System.out.println(b);
        }

        static void min(int... num)
        {
            int[] nums = num;
            double b = 3000;

            for (int a = 0; a < nums.length; a++)
            {
                if (b > nums[a])
                {
                    b = nums[a];
                }
            }
            System.out.println(b);
        }

        static void average(int... num)
        {
            int[] nums = num;
            double b = 0;
            for (int a = 0; a < nums.length; a++)
            {
                b += nums[a];
            }

            b = b/nums.length;
            System.out.println(b);
        }
    }
}