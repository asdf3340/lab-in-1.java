

enum Size {
    xxs(32) {
        @Override
    public String getDescription()
    {
        return "Детский размер";
    }}, xs(34), s(36), m(38), l(40);
    public String getDescription()
    {
        return "Взрослый размер";
    }


    int euroSize;
    Size(int euroSize)
    {
        this.euroSize = euroSize;
    }
    int euro()
    {
        return euroSize;
    }


}


interface MensClothing
{
   public void DressAMan();
}
interface WomensClothing
{
   public void DressAWomen();
}


abstract class Clothing
{
    Size size;
    double price;
    String color;
    Clothing(Size size, double price, String color)
    {
        this.size = size;
        this.price = price;
        this.color = color;
    }

    public void Out()
    {
        System.out.println("Размер одежды: " + this.size + ", EUR: " + this.size.euroSize + ", Цена: " + this.price + ", Цвет: "+ this.color +", "+ this.size.getDescription());
    }

}

class Tshort extends Clothing implements MensClothing, WomensClothing
{
    Tshort(Size size, double price, String color)
    {
        super(size,price,color);
    }
    @Override
    public void DressAMan()
    {
        System.out.println("Мужская футболка: ");
        Out();
    }
    @Override
    public void DressAWomen()
    {
        System.out.println("Женская футболка: ");
        Out();
    }

}

class Trouses extends Clothing implements MensClothing, WomensClothing
{
    Trouses(Size size, double price, String color)
    {
        super(size,price,color);
    }
    @Override
    public void DressAMan()
    {
        System.out.println("Мужские брюки: ");
        Out();
    }
    @Override
    public void DressAWomen()
    {
        System.out.println("Женские брюки: ");
        Out();
    }

}

class Skirt extends Clothing implements WomensClothing
{
    Skirt(Size size, double price, String color)
    {
        super(size,price,color);
    }
    @Override
    public void DressAWomen()
    {
        System.out.println("Женская юбка: ");
        Out();
    }
}

class Galstuk extends Clothing implements MensClothing
{
    Galstuk(Size size, double price, String colour)
    {
        super(size,price,colour);
    }
    @Override
    public void DressAMan()
    {
        System.out.println("Мужской галстук: ");
        Out();
    }
}

class Atelier
{
    public void DressAMan(Clothing[] size)
    {
        System.out.println("          Мужская одежда:      ");
        for (Clothing c: size)
        {
            if (c instanceof MensClothing)
            {
                ((MensClothing)c).DressAMan();
            }
        }
        System.out.println("           Женская одежда:      ");
        for (Clothing c: size)
        {
            if (c instanceof WomensClothing)
            {
                ((WomensClothing)c).DressAWomen();
            }
        }
    }
    public void DressAWomen(Clothing[] size)
    {

    }
}

class Main
{
    public static void main(String[]args)
    {
        Clothing[] cloth =
        {
            new Tshort(Size.m,500.0,"White"),
            new Trouses(Size.m, 1000.0,"Grey"),
            new Skirt(Size.l, 5200.0,"Red"),
            new Galstuk(Size.xxs, 700.0,"Black")
        };
        Atelier a = new Atelier();
        a.DressAMan(cloth);

        a.DressAWomen(cloth);
    }
}
