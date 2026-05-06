import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.util.regex.*;
import java.io.FileWriter;
import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        Pattern p = Pattern.compile("\\b(\\d|\\d\\d|1\\d\\d|2[0-4]\\d|25[0-5])\\.(\\d|\\d\\d|1\\d\\d|2[0-4]\\d|25[0-5])\\.(\\d|\\d\\d|1\\d\\d|2[0-4]\\d|25[0-5])\\.(\\d|\\d\\d|1\\d\\d|2[0-4]\\d|25[0-5])\\b");
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String stroka = scan.nextLine();
        Matcher m = p.matcher(stroka);

        File file = new File("C://Users//Jk//IdeaProjects//Kvaaa");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("note.txt")))
        {
            while (m.find())
            {
                String text = m.group();
                bw.write(text);
                bw.write("  ");
            }
        }
        catch (IOException ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}

