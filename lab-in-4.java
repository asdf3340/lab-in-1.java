import java.util.Random;
import java.util.Scanner;
class Program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите кол-во строк: ");
        int a = scan.nextInt();
        System.out.println("Введите кол-во столбцов: ");
        int b = scan.nextInt();
        int[][] Array = new int[a][b];
        int[] Q = new int[a * b];
        int count = 0;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                Array[i][j] = random.nextInt(0,10);
            }
        }

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                Q[count] = Array[i][j];
                count++;
            }
        }
        System.out.println("Массив: ");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(Array[i][j] + " ");
            }
            System.out.println();
        }
        ShakerSort(Q,a,b);
    }
    static void ShakerSort(int[] Q, int a, int b) {

        int left = 0;
        int right = Q.length - 1;
        while (left <= right) {
            for (int i = right; i > left; i--) {
                if (Q[i - 1] > Q[i]) {
                    int temp = Q[i];
                    Q[i] = Q[i - 1];
                    Q[i - 1] = temp;
                }
            }
            left++;
            for (int i = left; i < right; i++) {
                if (Q[i] > Q[i + 1]) {
                    int temp = Q[i + 1];
                    Q[i + 1] = Q[i];
                    Q[i] = temp;
                }
            }
            right--;
        }
        int count = 0;
        System.out.println("Отсортированный массив: ");
        for (int i=0;i<a;i++)
        {
            for (int j=0;j<b;j++)
            {
                System.out.print(Q[count] + " ");
                count++;
            }
            System.out.println();
        }
    }
}
