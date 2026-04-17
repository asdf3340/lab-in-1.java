import java.util.Scanner;

interface User
{
    void login();

    default void password()
    {
        System.out.println(" ");
    }
}

abstract class People implements User
{
    String FIO;
    int years;
    String work;
    String login;
    String password;

    public People(String FIO, int years, String work, String login, String password)
    {
        this.FIO = FIO;
        this.years = years;
        this.work = work;
        this.login = login;
        this.password = password;
    }


    public abstract void login();

    public abstract void password();
}

class Student extends People
{
    public Student(String FIO, int years, String work, String login, String password)
    {
        super(FIO, years, work, login, password);
    }
    @Override
    public void login() {
        System.out.println("Логин: " + this.login);
    }

    @Override
    public void password() {
        System.out.println("Пароль: " + this.password);
    }
}

class Teacher extends People {
    public Teacher(String FIO, int years, String work, String login, String password)
    {
        super(FIO, years, work, login, password);
    }
    @Override
    public void login()
    {
        System.out.println("Логин: " + this.login);
    }

    @Override
    public void password()
    {
        System.out.println("Пароль: " + this.password);
    }
}

class Main {
    public static void main(String[] args)
    {
        Student student1 = new Student("потапов", 18, "студент", "qwerty", "QWERTY");
        Student student2 = new Student("бевулляев", 18, "ученик", "ASDFGH", "asdfgh");
        Teacher teacher1 = new Teacher("кочеткова", 32, "учитель", "ZXCVBN", "zxcvbn");
        Teacher teacher2 = new Teacher("щаднева", 54, "преподаватель", "QWERTY", "qwerty");

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите фамилию: ");
        String a = scan.nextLine();

        if (a.equals(student1.FIO))
        {
            student1.login();
            student1.password();
        } else if (a.equals(student2.FIO))
        {
            student2.login();
            student2.password();
        } else if (a.equals(teacher1.FIO))
        {
            teacher1.login();
            teacher1.password();
        } else if (a.equals(teacher2.FIO))
        {
            teacher2.login();
            teacher2.password();
        } else
        {
            System.out.println("Такого нет");
        }
    }
}
