import java.util.Scanner;
        class Primer
        {
            int a;
            int b;
            int x;
            Primer(int a, int b, int x)
            {
                this.a = a;
                this.b = b;
                this.x = x;
            }
            void sum()
            {
                System.out.println("Результат y=3*x+5: ");
                System.out.println(3*this.x+5);
            }
            void divide ()
            {
                if (this.a-this.b == 0)
                {
                    System.out.println("Результата нет. Знаменатель равен нулю");
                }
                System.out.println("Результат y=(a+b)/(a-b): ");
                System.out.println((this.a+this.b)/(this.a-this.b));
            }
            void factorial()
            {
                int chislo = 1;
                if (this.b == 0)
                {
                    System.out.println("Результата нет, знаменатель равен нулю");
                }
                else
                {
                    chislo = (this.a * this.x) / this.b;
                    if (chislo < 0)
                    {
                        System.out.println("Результата нет, число меньше нуля");
                    }
                    else
                    {
                        int result = 1;
                        System.out.println("Результат y=(ax/b)!: ");
                        for (int i = 1; i <= chislo; i++)
                        {
                            result *= i;
                        }
                        System.out.println(result);
                    }
                }
            }
        }

        public class Main
        {
            public static void main(String [] args)
            {
                Scanner scan = new Scanner(System.in);

                System.out.println("Введите х: ");
                int x = scan.nextInt();
                System.out.println("Введите a: ");
                int a = scan.nextInt();
                System.out.println("Введите b: ");
                int b = scan.nextInt();

                Primer y1 = new Primer(a,b,x);
                y1.sum();
                y1.divide();
                y1.factorial();
                System.out.println("----------------------");
                Primer y2 = new Primer(a+1,b*2,x-3);
                y2.sum();
                y2.divide();
                y2.factorial();
                System.out.println("----------------------");
                Primer y3 = new Primer(a*3,b-8,x+2);
                y3.sum();
                y3.divide();
                y3.factorial();
            }
        }
