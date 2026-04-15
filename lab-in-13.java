import java.util.Scanner;

interface Product
{
//    void setname(String name);
    String getname();
//    void setprice(double price);
    double getprice();
//    void setrating(double rating);
    double getrating();
}
interface User
{
//    void setlogin();
     String getlogin();
//    void setpassword();
     String getpassword();
}

class ClassOne implements Product
{
    private String name;
    private double price;
    private double rating;
    ClassOne(String name, double price, double rating)
    {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }
//    @Override
//    public void setname(String name)
//    {
//        this.name = name;
//    }
//    @Override
//    public void setrating(double rating)
//    {
//        this.rating = rating;
//    }
//    @Override
//    public void setprice(double price)
//    {
//        this.price = price;
//    }
    @Override
    public String getname()
    {
        return this.name;
    }
    @Override
    public double getprice()
    {
        return this.price;
    }
    @Override
    public double getrating()
    {
        return this.rating;
    }
}
class ClassTwo implements Product
{
    private String name;
    private double price;
    private double rating;
    ClassTwo(String name, double price, double rating)
    {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }
//    @Override
//    public void setname(String name)
//    {
//        this.name = name;
//    }
//    @Override
//    public void setrating(double rating)
//    {
//        this.rating = rating;
//    }
//    @Override
//    public void setprice(double price)
//    {
//        this.price = price;
//    }
    @Override
    public String getname()
    {
        return this.name;
    }
    @Override
    public double getprice()
    {
        return this.price;
    }
    @Override
    public double getrating()
    {
        return this.rating;
    }
}
class ClassThree implements Product
{
    private String name;
    private double price;
    private double rating;
    ClassThree(String name, double price, double rating)
    {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }
//    @Override
//    public void setname(String name)
//    {
//        this.name = name;
//    }
//    @Override
//    public void setrating(double rating)
//    {
//        this.rating = rating;
//    }
//    @Override
//    public void setprice(double price)
//    {
//        this.price = price;
//    }
    @Override
    public String getname()
    {
        return this.name;
    }

    @Override
    public double getprice()
    {
        return this.price;
    }

    @Override
    public double getrating()
    {
        return this.rating;
    }
}

class ClassFour implements User
{
    private String login;
    private String password;
    ClassFour(String login, String password)
    {
        this.login = login;
        this.password = password;
    }
//    @Override
//    public void setlogin(String login)
//    {
//        this.login = login;
//    }
//    @Override
//    public void setpassword(String password)
//    {
//        this.password = password;
//    }
    @Override
    public String getlogin()
    {
        return this.login;
    }
    @Override
    public String getpassword()
    {
        return this.password;
    }

}
class ClassFive implements User
{
    private String login;
    private String password;
    ClassFive(String login, String password)
    {
        this.login = login;
        this.password = password;
    }
//    @Override
//    public void setlogin(String login)
//    {
//        this.login = login;
//    }
//    @Override
//    public void setpassword(String password)
//    {
//        this.password = password;
//    }
    @Override
    public String getlogin()
    {
        return this.login;
    }
    @Override
    public String getpassword()
    {
        return this.password;
    }
}
class ClassSix implements User
{
    private String login;
    private String password;
    ClassSix(String login, String password)
    {
        this.login = login;
        this.password = password;
    }
//    @Override
//    public void setlogin(String login)
//    {
//        this.login = login;
//    }
//    @Override
//    public void setpassword(String password)
//    {
//        this.password = password;
//    }
    @Override
    public String getlogin()
    {
        return this.login;
    }
    @Override
    public String getpassword()
    {
        return this.password;
    }
}

class ClassSeven implements Product, User
{
    String login;
    String password;
    String name;
    double price;
    double rating;
    ClassSeven(String login,String password, String name, double price, double rating)
    {
        this.login = login;
        this.password = password;
        this.name = name;
        this.price = price;
        this.rating = rating;
    }
    @Override
    public String getlogin()
    {
        return this.login;
    }
    @Override
    public String getpassword()
    {
        return this.password;
    }
    @Override
    public String getname()
    {
        return this.name;
    }

    @Override
    public double getprice()
    {
        return this.price;
    }

    @Override
    public double getrating()
    {
        return this.rating;
    }
    void Out(User user,Product product)
    {
        System.out.printf("Пользователь с логином: %s и паролем: %s купил товар: %s, цена которого равна %.2f, рейтинг: %.2f",user.getlogin(),user.getpassword(),product.getname(), product.getprice(), product.getrating());
    }
}
class Main
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Product one = new ClassOne("book", 500.59, 4.7);
        Product two = new ClassTwo("pen", 20.2, 3.2);
        Product three = new ClassThree("notebook", 350.5, 4.0);

        User four = new ClassFour("QWERTY", "qwerty");
        User five = new ClassFive("ASDFGH", "asdfgh");
        User six = new ClassSix("ZXCVBN", "zxcvbn");

        System.out.println("Введите логин пользователя, чтобы узнать, что он купил: ");
        String a = scan.next();
        System.out.println("Введите пароль: ");
        String b = scan.next();

        ClassSeven end = new ClassSeven("sdcvfdbg","asdfb","qsdfv",1.0,1.0);

        if (a.equals(four.getlogin()) && b.equals(four.getpassword()))
        {
            end.Out(four,one);
        }
        else if (a.equals(five.getlogin()) && b.equals(five.getpassword()))
        {
            end.Out(five,two);
        }
        else if (a.equals(six.getlogin()) && b.equals(six.getpassword()))
        {
            end.Out(six,three);
        }
    }
}


