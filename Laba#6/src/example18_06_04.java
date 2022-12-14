public class example18_06_04 
{
    public static void main(String[] args) 
    {    
        System.out.print("Factorial not recursion 5: ");
        FactorialNotRecursion.doubleFactorialNotRecursion(5);
        FactorialRecursion.setOne();
        
        System.out.print("Factorial with recursion 6: ");
        FactorialRecursion.doubleFactorialRecursion(6);
        FactorialRecursion.print();
        FactorialRecursion.setOne();
    }

    static class FactorialNotRecursion
    {
        static void doubleFactorialNotRecursion(int numb)
        {
            int c = 1;

            while (numb > 0)
            {
                if(numb > 2)
                {
                    c = c * numb;
                } else if (numb == 2) 
                {
                    c = c * 2;
                } else if (numb == 1)
                {
                    c = c * 1;
                }
                numb -= 2;
            }
            System.out.println(c);
        }
    }

    static class FactorialRecursion
    {
        static int c = 1;
        static void doubleFactorialRecursion(int numb)
        {
            c *= numb;
            if (numb-2 > 2)
            {
                doubleFactorialRecursion(numb-2);
            } else if (numb-2 == 2) 
            {
                c *= 2;
            } else if (numb-2 == 1)
            {
                c *= 1;
            }
        }

        static void print()
        {
            System.out.println(c);
        }

        static void setOne()
        {
            c = 1;
        }
    }
}