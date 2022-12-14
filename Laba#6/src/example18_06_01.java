public class example18_06_01 
{
	public static void main(String[] args) 
    {
        char[] arrSymb = new char[]{'x','y','z'};
        char[] symb = new char[]{'b'};

        System.out.print("1. ");
        Arg test1 = new Arg();
        test1.setArg('l');
        test1.getArg();

        System.out.print("2. ");
        Arg test2 = new Arg();
        test2.setArg("String");
        test2.getArg();

        System.out.print("3. ");
        Arg test3 = new Arg();
        test3.setArg(arrSymb);
        test3.getArg();

        System.out.print("4. ");
        Arg test4 = new Arg();
        test4.setArg(symb);
        test4.getArg(); 
    }

    static class Arg 
    {
        char symb;
        String string;

        void setArg(char symb)
        {
            this.symb = symb;
        }

        void setArg(String string)
        {
            this.string = string;
        }

        void setArg(char[] chars)
        {
            if (chars.length == 0)
            {
                this.symb = chars[0];
            }

            else if(chars.length>1)
            {
                String temp = new String(chars);
                string = temp;
            }
        }

        void getArg()
        {
            System.out.println("Symbol: " + symb);
            System.out.println("String: " + string);
        }
	}
}