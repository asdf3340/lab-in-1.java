import java.io.*;
import java.util.Scanner;

class Calculator implements Serializable
{
    double x;
    double y;
    public Calculator(double x)
    {
        this.x = x;
        this.y = 0;
    }

    public void Calc(double x)//метод для вывода
    {
        y = x - Math.sin(x);
        System.out.println("y = " + y);

    }



    void save()
    {
        try (ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("save.txt")))
        {
            o.writeObject(this);//this - объект текущего класса
            System.out.println("Сохраненно");
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
    }

    void upload() {
        try(ObjectInputStream i = new ObjectInputStream(new FileInputStream("save.txt")))
        {
            Calculator c = (Calculator)i.readObject();
            this.x = c.x;
            this.y = c.y;
            System.out.println("Загружено: x = " + x + ", y = " + y);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}



public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Bведите x: ");
        double x = scan.nextDouble();

        Calculator virazhenie = new Calculator(x);
        virazhenie.Calc(x);

        while (true)
        {
            System.out.print("Введите: save/upload: ");
            String s = scan.next();

            if(s.equals("save"))
            {
                virazhenie.save();
            }
            else if (s.equals("upload"))
            {
                virazhenie.upload();
            }
            else
            {
                System.out.println("Выход совершен");
                break;
            }
        }
    }
}
