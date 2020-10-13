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
            FileReader fr = new FileReader(inputFile);
            BufferedReader br = new BufferedReader(fr, 20);
            
            File outputFile = new File("C:\\Users\\Michael Kim\\Desktop\\2020-2\\ADP-2\\실습#3\\Result\\sunmoon-copy.jpg");
            FileWriter fw = new FileWriter(outputFile);
            BufferedOutputStream bos = new BufferedOutputStream(fw, 20);

            int c;  
            while((c = fr.read()) != -1)
            {
                bos.write((byte)c);
            }
            fr.close();
            bos.flush();
            bos.close();     
            System.out.println("입력파일 : " + inputFile.getPath() + "(파일크기 = " + inputFile.getTotalSpace() + "바이트)");
            System.out.println("입력파일 : " + outputFile.getPath() + "(파일크기 = " + outputFile.getTotalSpace() + "바이트)");
        }
        catch(IOException e)
        {
            System.out.println("IOException Error!");
        }

    }
}
