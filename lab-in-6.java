import java.util.Scanner;

class Reader
{
        String FIO;
        int bilet;
        String facultet;
        int data;
        long PhoneNumber;

        Reader(String FIO, int bilet,String facultet, int data, long PhoneNumber)
        {
                this.FIO = FIO;
                this.bilet = bilet;
                this.facultet = facultet;
                this.data = data;
                this.PhoneNumber = PhoneNumber;
        }

        void takeBook(String FIO, int n)
        {
                System.out.printf("%s вернул %d книг(и)", FIO,n);
                System.out.println();
        }

        void takeBook(String FIO, String...Books)
        {
                System.out.printf("%s вернул книг(и): " , FIO);
                for (String book: Books)
                {
                        System.out.print(book + ", ");
                }
                System.out.println();
        }

        void returnBook(String FIO, int k)
        {
                System.out.printf("%s взял %d книг(и)", FIO, k);
                System.out.println();
        }
        void returnBook(String FIO, String ... Books)
        {
                System.out.printf("%s взял книг(и): ", FIO);
                for (String Book: Books)
                {
                      System.out.print(Book + ", ");
                }
                System.out.println();
        }
}
public class Main
{
        public static void main(String[] args)
        {
                Reader books = new Reader("qwe",123,"qwer",13,123);
                Scanner scan = new Scanner(System.in);

                System.out.println("Введите ФИО:");
                String FIO = scan.nextLine();
                System.out.println("Введите номер билета:");
                int bilet = scan.nextInt();
                System.out.println("Введите факультет:");
                String facultet = scan.nextLine();
                scan.nextLine();

                System.out.println("Введите дату рождения:");
                int data = scan.nextInt();
                System.out.println("Введите номер телефона:");
                long PhoneNumber = scan.nextInt();
                System.out.println("Хотите вернуть(1) или взять(2) книги?");
                int choise = scan.nextInt();


                if (choise == 1)
                {

                        System.out.println("Введите название книг, которые вернули через запятую");
                        String pop = scan.next();
                        String[] Books = pop.split(",");
                        int N = Books.length;
                        books.takeBook(FIO,N);

                        books.takeBook(FIO, Books);
                }
                else if (choise == 2)
                {
                        System.out.println("Введите название книг, которые взяли через запятую:");
                        String BOOK = scan.next();
                        String[] BOOKS = BOOK.split(",");
                        int n = BOOKS.length;
                        books.returnBook(FIO, n);
                        books.returnBook(FIO, BOOKS);
                }
                else
                {
                        System.out.println("Данные введены некорректно!");
                }
        }
}
