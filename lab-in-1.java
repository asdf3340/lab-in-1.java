import java.util.Scanner;
public class Main
{
    public static void main(String []args)
    {
        System.out.println("Введите n: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println("Введите x: ");
        double x = scan.nextDouble();
        double sum = 0;
        for (int i=0;i<=n;i++)
        {
            sum +=(Math.pow(-1,i)*Math.pow(x,2*i))/factorial(i);
        }
        System.out.printf("Результат: %f",sum);
    }
    static double factorial(double a)
    {
        double factorial =1;
        for (int i=1;i<=a;i++)
        {
            factorial*=i;
        }
        return factorial;
    }
}
