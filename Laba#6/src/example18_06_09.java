public class example18_06_09
{
    public static void main(String[] args) 
    {
        char[] arrCharSymb = new char[]{'a', 'b', 'c','i','e','f','g'};
        arrCharSymb = Program.replacement(arrCharSymb);
        for (char c : arrCharSymb) 
        {
        	System.out.print(c+" ");
		}
    }

    static class Program 
    {
        static char[] replacement(char[] arrCharSymb) 
        {
            char[] newCharSymb = new char[arrCharSymb.length];
            for (int i = 0; i < arrCharSymb.length; i++) 
            {
                newCharSymb[i] = arrCharSymb[arrCharSymb.length - i - 1];
            }
            return newCharSymb;
        }
    }
}