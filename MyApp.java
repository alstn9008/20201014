import java.io.*;
/**
 * Write a description of class BufferStream here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyApp
{
    public static void main(String[] args)
    {
        try
        {
            File inputFile = new File("C:\\Users\\Michael Kim\\Desktop\\2020-2\\ADP-2\\실습#3\\sunmoon.jpg");
            FileInputStream fis = new FileInputStream(inputFile);
            BufferedInputStream bis = new BufferedInputStream(fis, 20);
            
            File outputFile = new File("C:\\Users\\Michael Kim\\Desktop\\2020-2\\ADP-2\\실습#3\\Result\\sunmoon-copy.jpg");
            FileOutputStream fos= new FileOutputStream(outputFile);
            BufferedOutputStream bos = new BufferedOutputStream(fos, 20);

            int c;  
            while((c = fis.read()) != -1)
            {
                bos.write((byte)c);
            }
            fis.close();
            bos.flush();
            bos.close();     
            System.out.println("입력파일 : " + inputFile.getPath() + "(파일크기 = " + inputFile.length() + "바이트)");
            System.out.println("입력파일 : " + outputFile.getPath() + "(파일크기 = " + outputFile.length() + "바이트)");
        }
        catch(IOException e)
        {
            System.out.println("IOException Error!");
        }

    }
}
