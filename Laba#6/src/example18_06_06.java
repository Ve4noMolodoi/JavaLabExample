public class example18_06_06
{
    public static void main(String[] args) 
    {
        int[] arr = {213, 32, 11, 231, 435, 45, 53, 123, 1, 5};
        arr = Program.getArr(arr, 3);

        for (int i=0; i < Program.getArr(arr, 3).length; i++) 
        {
            System.out.print(arr[i]+"; ");
        }
    }

    class Program
    {
        public static int [] getArr (int[] arr, int size)
        {
            if(arr.length < size) 
            {
                return arr;
            }
            
            int[] newArr = new int[size];

            for(int a = 0; a < size; a++)
            {
                newArr[a]= arr[a];
            }

            return newArr;
        }

    }
}