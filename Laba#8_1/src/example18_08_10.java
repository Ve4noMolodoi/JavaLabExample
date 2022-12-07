import java.io.*;

public class example18_08_10 
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader br = null;
        PrintWriter out = null;
        try 
        {
            br = new BufferedReader(new InputStreamReader(
                            new FileInputStream("E:\\MyFile1.txt"),"cp1251"));
            out = new PrintWriter("E:\\MyFile2.txt", "cp1251");
            
            int lineCount = 0;
            String s;
            
            while ((s = br.readLine()) != null) 
            {
                lineCount++;
                out.println(lineCount + ": " + s);
            }
        } catch (IOException e) 
        {
            System.out.println("Warning!!!"); 
        }finally
        {
            br.close();
            out.flush();
            out.close();
        }
    }
}