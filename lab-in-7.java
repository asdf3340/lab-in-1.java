import java.util.Scanner;

class Customer
{
    String surname;
    String name;
    String otchestvo;
    String adress;
    long telephone;
    long card;

    Customer (String surname, String name, String otchestvo, String adress,long telephone,long card)
    {
        this.surname = surname;
        this.name = name;
        this.otchestvo = otchestvo;
        this.adress = adress;
        this.telephone = telephone;
        this.card = card;
    }
}
public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        Customer one = new Customer("Кочетков","Алексей","Николаевич","Саратов", 123456789, 98765);

        Customer two = new Customer("Щаднева","Людмила","Валерьевна","Пенза", 123456789, 34576);

        Customer three = new Customer("Григорьев","Антон","Борисович","Нижний Ломов", 123456789, 12345);

        Customer[] Array = {one, two, three};

        System.out.println("Введите нужный номер кредитной карты: ");
        long CARD = scan.nextInt();
        int kva = 0;
        for (Customer customer:Array)
        {
                if (customer.card == CARD)
                {
                    System.out.print(customer.surname + " ");
                    System.out.print(customer.name + " ");
                    System.out.print(customer.otchestvo + " ");
                    kva++;
                }
        }
        if (kva == 0)
        {
            System.out.println("Совпадений не обнаружено");
        }
    }
}
