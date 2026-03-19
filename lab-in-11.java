import java.util.Scanner;
class Person
{
    private int years;
    public String FIO;
    public long phone;
    Person (int years, String FIO, long phone)
    {
        this.years = years;
        this.FIO = FIO;
        this.phone = phone;
    }
    public int getYears()
    {
        return years;
    }
}
class Student extends Person
{
    public int form;
    public String facultet;
    private int year;
    Student(int years, String FIO, long phone, int form, String facultet, int year)
    {
        super (years, FIO, phone);
        this.form = form;
        this.facultet = facultet;
        this.year = year;
    }
    public int year()
    {
        return year;
    }
}
class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Student one = new Student(20,"Потапов",123456789, 4,"Факультет",2022);
        Student two = new Student(19,"Кочетков",987654321,3,"Факультет2",2023);
        Student three = new Student(18,"Щаднев",432156789,2,"Факультет3",2024);
        Student[] array = {one,two,three};

        System.out.println("a)  ");
        for (Student i:array)
        {
            System.out.print("Фамилия: ");
            System.out.println(i.FIO);
            System.out.print("Возраст: ");
            System.out.println(i.getYears());
        }

        System.out.println("б)  ");
        System.out.println("Введите факультет");
        String fac = scan.next();
        for (Student i:array)
        {
            if (i.facultet.equals(fac))
            {
                System.out.println(i.FIO);
            }
        }

        System.out.println("в)  ");
        System.out.println("Введите год поступления: ");
        int year = scan.nextInt();
        for (Student i: array)
        {
            if (i.year() > year)
            {
                System.out.println(i.FIO);
            }
        }
    }
}
