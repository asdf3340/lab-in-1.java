class Person
{
   String name;
   String Surname;
   String Dr;
   Person (String name, String Surname,String Dr)
   {
       this.name = name;
       this.Surname = Surname;
       this.Dr = Dr;
   }
   void Out ()
   {
       System.out.println(this.name + " - имя");
       System.out.println(this.Surname + " - фамилия");
       System.out.println(this.Dr + " - год рожедния");
   }
}
class Car
{
    String marka;
    String year;
    String capacity;
    Car (String marka,String year, String capacity)
    {
        this.marka = marka;
        this.year = year;
        this.capacity = capacity;
    }
    void Out()
    {
        System.out.println(this.marka + " - марка автомобиля");
        System.out.println(this.year + " - год выпуска");
        System.out.println(this.capacity + " - объем двигателя");
    }

}
class Book
{
    String name;
    String autor;
    String data;
    Book (String name, String autor,String data)
    {
        this.name = name;
        this.autor = autor;
        this.data = data;
    }
    void Out()
    {
        System.out.println(this.name + " - название книги");
        System.out.println(this.autor + " - автор");
        System.out.println(this.data + " - дата издания");
    }
    void Info (Person N, Car M)
    {
        System.out.printf("%s читает книгу %s про машину %s", N.name,this.name,M.marka);
    }
}
public class Main
{
    public static void main(String[] args)
    {
        Person person = new Person("Алексей","Кочетков","10.09.1978");
        Car car = new Car("Volksvagen Passat","2005","70");

        Book book = new Book("Приключения Том Соейра","Марк Твен","1876");
        person.Out();
        System.out.println("---------------");
        car.Out();
        System.out.println("---------------");
        book.Out();
        System.out.println("---------------");
        book.Info(person, car);
    }
}
