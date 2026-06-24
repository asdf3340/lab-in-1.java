
import java.util.Scanner;

interface Interface
{
    boolean test(int[] arr, int i, int j);
}

class Main {
    public static void main(String[] args) {
        System.out.println("Введите количество элементов массива: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] sortArr = new int[n];//massive
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < n; i++) {
            sortArr[i] = scan.nextInt();
        }
        System.out.print("Было: ");//out
        for (int i = 0; i < n; i++){
            System.out.print(sortArr[i] + " ");
        }
        System.out.println();
        shakerSortWithCondition(sortArr, (arr, i, j) -> arr[i] > arr[j]);
        System.out.print("По возрастанию: ");
        for (int i = 0; i < n; i++){
            System.out.print(sortArr[i] + " ");
        }
        System.out.println();
        shakerSortWithCondition(sortArr,    (arr, i, j) -> arr[i] < arr[j]    );
        System.out.print("По убыванию: ");
        for (int i = 0; i < n; i++){
            System.out.print(sortArr[i] + " ");
        }
    }
    public static void shakerSortWithCondition(int[] q, Interface condition) {
        int left = 0;
        int right = q.length - 1;

        while (left < right)
        {
            for (int i = right; i > left; i--)
            {
                if (condition.test(q, i - 1, i))
                {
                    swap(q, i - 1, i);
                }
            }
            left++;

            for (int i = left; i < right; i++)
            {
                if (condition.test(q, i, i + 1))
                {
                    swap(q, i, i + 1);
                }
            }
            right--;
        }
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}




