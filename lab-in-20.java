class Primer
{
    private static Primer primer = new Primer(3.0,3.0);
    double x;
    double y;
    private Primer (double x,double y)
    {
        this.x = x;
        this.y = y;
    }
    public static Primer getInstance()
    {
        if (primer == null)
        {
            return primer;
        }
        else
        {
            return primer;
        }
    }
    public void Result()
    {
        System.out.println("Результат: " + (2*x+3/y));
    }
}
class Main
{
    public static void main(String[] args)
    {
        Primer primmer = Primer.getInstance();
        primmer.Result();
    }
}

