import java.util.Scanner;
class Student {
    private String Fio;
    private int Date;
    private String Address;
    private String phone;
    private int form;
    private String facultet;

    public Student(String Fio, int Date, String Address, String phone, int form, String facultet) {
        this.Fio = Fio;
        this.Date = Date;
        this.Address = Address;
        this.phone = phone;
        this.form = form;
        this.facultet = facultet;
    }

    public void setFio(String Fio)
    {
        this.Fio = Fio;
    }
    public void setDate(int date)
    {
        this.Date = date;
    }
    public void setAddress(String Address)
    {
        this.Address = Address;
    }
    public void setphone(String phone)
    {
        this.phone = phone;
    }
    public void setform(int form)
    {
        this.form = form;
    }
    public void setfacultet(String facultet)
    {
        this.facultet = facultet;
    }
    public String getFio() {
        return Fio;
    }
    public int getDate()
    {
        return Date;
    }
    public String getAddress()
    {
        return Address;
    } public String getphone()
    {
        return phone;
    } public int getform()
    {
        return form;
    } public String getFacultet()
    {
        return facultet;
    }
}
public class Main
{
    public static void main(String[] args)
    {
        Student one = new Student("Потапов",2024,"qwerty", "1234568",2, "Фкльтет");
        Student two = new Student("Кочетков",2023,"asdfgh", "87654321",3, "asdfgh");
        Student three = new Student("Щаднев",2025,"zxcvbn", "zxcvbn",1, "zxcvbn");
        Scanner scan = new Scanner(System.in);

        Student[] array = {one, two, three};
        System.out.print("а)  ");
        System.out.println("фамилии всех студентов:");
        for(Student q: array)
        {
            System.out.println(q.getFio());
        }
        System.out.print("б)  ");
        System.out.println("введите фкультет:");
        String fac = scan.next();
        for(Student q: array)
        {
            if(q.getFacultet().equals(fac))
            {
                System.out.println(q.getFio());
            }
        }
        System.out.print("в)  ");
        System.out.println("Введите год поступления:");
        int date4 = scan.nextInt();
        for(Student q: array)
        {
            if (q.getDate() == date4)
            {
                System.out.println(q.getFio());
            }
        }
    }
}
