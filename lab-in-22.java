interface Obedinenie
{
    public void result380();
}
class V380 implements Obedinenie
{
    public void result380()
    {
        System.out.println("Устройство заряжается от зарядки на 380V");
    }
}


interface Otdelnost
{
    public void notresult220();
}
class V220 implements Otdelnost
{
    public void notresult220()
    {
        System.out.println("Устройство не может заряжаться от зарядки на 220V");
        System.out.println("Нужно напряжение 380V");
    }
}
class Central
{
    Obedinenie asd;
    public Central(Obedinenie asd)
    {
        this.asd = asd;
    }
    public void power()
    {
        asd.result380();
    }
}

class Adapter implements Obedinenie
{
    Otdelnost qwe;
    public Adapter (Otdelnost qwe)
    {
        this.qwe = qwe;
    }
    public void result380()
    {
        qwe.notresult220();
    }
}

class Main
{
    public static void main(String[] args)
    {
        Adapter v220 = new Adapter(new V220());
        Central cen1 = new Central(v220);
        cen1.power();

        Obedinenie v380 = new V380();
        Central cen = new Central(v380);
        cen.power();
    }
}
