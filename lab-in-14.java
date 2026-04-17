

import java.util.regex.*;
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
        while (m.find())
        {
            System.out.print(m.group());
            System.out.println();
        }
    }
}
