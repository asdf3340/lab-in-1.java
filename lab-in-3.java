import java.util.Scanner;
import java.util.Random;
public class Main
{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите число строк: ");
        int a = scan.nextInt();
        System.out.println("Введите число стобцов");
        int b = scan.nextInt();
        int[][] Q = new int[a][b];
        for (int i = 0; i < a; i++)
        {
            for (int j = 0; j < b; j++)
            {
                Q[i][j] = random.nextInt(10);

            }
        }
        System.out.println("Было: ");
        for (int i = 0; i < a; i++)
        {
            for (int j = 0; j < b; j++)
            {
                System.out.print(Q[i][j] + " ");
            }
            System.out.println();
        }
        int index1=0;
        int[] Qw = new int[a * b];
        for (int i = 0; i < a; i++)
        {
            for (int j = 0; j < b; j++)
            {

                    Qw[index1] = Q[i][j];
                    index1++;

            }
        }
        int index =0;
        int low = 0;
        int high = Qw.length - 1;
        quickSort(Qw, low, high);
        System.out.println("Стало: ");
        for (int i=0;i<a;i++)
        {
            for (int j=0;j<b;j++)
            {

                    Q[i][j]=Qw[index];
                    index++;

            }
        }
        for (int i=0;i<a;i++)
        {
            for (int j = 0; j < b; j++)
            {
                System.out.print(Q[i][j]+" " );
            }
            System.out.println();
        }
    }
    public static void quickSort(int[]Array,int low, int high)
    {

                 if (Array.length == 0) return;
                if (low >= high) return;
                int middle = low + (high - low) / 2;
                int opora = Array[middle];
                int i = low;
                int j = high;
                while (i <= j)
                {
                    while (Array[i] < opora)
                    {
                        i++;
                    }
                    while (Array[j] > opora)
                    {
                        j--;
                    }
                    if (i <= j)
                    {
                        int temp = Array[i];
                        Array[i] = Array[j];
                        Array [j]= temp;
                        i++;
                        j--;
                    }
                }

                if (low < j)
                {
                    quickSort(Array, low, j);
                }
                if (high > i)
                {
                    quickSort(Array, i, high);
                }
            }
        }
