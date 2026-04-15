import java.util.Scanner;
interface Interface
{
    default void password()
    {
        System.out.println("Пароль ");
    }
    default void login ()
    {
        System.out.println("Логин ");
    }
}
abstract class People implements Interface
{
    String FIO;
    int years;
    String profetion;
    People (String FIO, int years, String profetion)
    {
        this.FIO = FIO;
        this.years = years;
        this.profetion = profetion;
    }
}
class Teacher extends People
{
    private String login;
    private String password;
    Teacher(String FIO, int years, String profetion, String login, String password)
    {
        super(FIO,years,profetion);
        this.password = password;
        this.login = login;
    }
    String Password()
    {
        return this.password;
    }
    String Login()
    {
        return this.login;
    }
}
class Student extends People
{
    private String login;
    private String password;
    Student(String FIO, int years, String profetion, String login, String password)
    {
        super(FIO,years,profetion);
        this.password = password;
        this.login = login;
    }
    String Password()
    {
        return this.password;
    }
    String Login()
    {
        return this.login;
    }
}
class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Teacher teacher1 = new Teacher("ташкинов", 60,"преподаватель","abcdefg","123456789");
        Teacher teacher2 = new Teacher("кочеткова",38,"психолог","hijklmn","987654321");
        Student student1 = new Student("щаднев",20,"студент","opqrstuv","12345");
        Student student2 = new Student("фролов",18,"студент", "wxyz","54321");
        System.out.println("Введите фамилию, чтобы узнать логин и пароль:  ");
        String Fio = scan.next();
        if (Fio.equals("ташкинов"))
        {
            System.out.println("Логин: ");
            System.out.println(teacher1.Login());
            System.out.println("Пароль: ");
            System.out.println(teacher1.Password());
        }
        else if (Fio.equals("кочеткова"))
        {
            System.out.println("Логин: ");
            System.out.println(teacher2.Login());
            System.out.println("Пароль: ");
            System.out.println(teacher2.Password());
        }
        else if (Fio.equals("щаднев"))
        {
            System.out.println("Логин: ");
            System.out.println(student1.Login());
            System.out.println("Пароль: ");
            System.out.println(student1.Password());
        }
        else if (Fio.equals("фролов"))
        {
            System.out.println("Логин: ");
            System.out.println(student2.Login());
            System.out.println("Пароль: ");
            System.out.println(student2.Password());
        }
        else
        {
            System.out.println("Такого нет");
        }
    }
}

