
abstract class Transport
{
    String name;
    String delivery;
    public String toString()
    {
        return "Дoставку осуществляет " + this.name + this.delivery;
    }
}
abstract class Factory
{
    public abstract Transport Type();

}
class Truck extends Factory
{
    public Transport Type()
    {
        return new Truck1();
    }
}
class Ship extends Factory
{
    public Transport Type()
    {
        return new Ship1();
    }
}
class Airplane extends Factory
{
    public Transport Type()
    {
        return new Airplane1();
    }
}
class Truck1 extends Transport
{



    public Truck1()
    {
        name = "грузовик ";
        delivery = "по дороге";
    }
}
class Ship1 extends Transport
{

    public Ship1()
    {
        name = "корабль ";
        delivery = "по морю";
    }
}
class Airplane1 extends Transport
{

    public Airplane1()
    {
        name = "самолет ";
        delivery = "по воздуху";
    }
}
class Main
{
    public static void main(String[] args)
    {
        Factory Truck2 = new Truck();
        Factory Ship2 = new Ship();
        Factory Airplane2 = new Airplane();
        Transport Truck3 = Truck2.Type();
        Transport Ship3 = Ship2.Type();
        Transport Airplane3 = Airplane2.Type();
        System.out.println(Truck3);
        System.out.println(Ship3);
        System.out.println(Airplane3);
    }
}

