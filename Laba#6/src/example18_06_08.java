public class example18_06_08 
{
    public static void main(String[] args) 
    {
        int[] arrNumb = new int[]{1, 2, 3, 4, 5};
        System.out.print("Average value of the array: " + Average.program(arrNumb));
    }

    static class Average
    {
        static double program(int[] nums)
        {
            double result = 0;
            
            for (int a=0; a< nums.length; a++)
            {
                result+=nums[a];
            }
            result /= nums.length;

            return result;
        }
    }
}