import java.util.Scanner;

class Animal
{
    String food;
    String location;
    Animal (String food, String location)
    {
        this.food = food;
        this.location = location;
    }
    public void makeNoise()
    {
        System.out.println("шумит");
    }
    public void eat()
    {
        System.out.println("ест");
        System.out.println(this.food);
    }
    public void sleep()
    {
        System.out.println("спит");
    }
}
class Dog extends Animal
{
    String poroda;
    String nickname;
    String year;
    String numberPassport;
    Dog ( String poroda,String food,String location,String nickname, String year, String numberPassport)
    {
        super(food, location);
        this.poroda = poroda;
        this.nickname = nickname;
        this.year = year;
        this.numberPassport = numberPassport;
    }
    @Override
    public void makeNoise()
    {
        System.out.println("Собака гавкает");
    }
    @Override
    public void eat()
    {
        System.out.print("Собака ест: ");
        System.out.println(this.food);
    }
}
class Cat extends Animal
{
    String poroda;
    String nickname;
    String year;
    String numberPassport;
    Cat (String poroda,String food,String location,String nickname, String year, String numberPassport)
    {
        super(food, location);
        this.poroda = poroda;
        this.nickname = nickname;
        this.year = year;
        this.numberPassport = numberPassport;
    }
    @Override
    public void makeNoise()
    {
        System.out.println("Кошка мявкает");
    }
    @Override
    public void eat()
    {
        System.out.print("Кошка ест: ");
        System.out.println(this.food);
    }
}
class Horse extends Animal
{
    String poroda;
    String nickname;
    String year;
    String numberPassport;
    Horse ( String poroda,String food,String location,String nickname, String year, String numberPassport)
    {
        super(food, location);
        this.poroda = poroda;
        this.nickname = nickname;
        this.year = year;
        this.numberPassport = numberPassport;
    }
    @Override
    public void makeNoise()
    {
        System.out.println("Лощадь ржет");
    }
    @Override
    public void eat()
    {
        System.out.print("Лошадь ест: ");
        System.out.println(this.food);
    }
}
class Vet
{
    public static void treatAnimal(Animal animal)
    {
        System.out.println("Еда животного: ");
        System.out.println(animal.food);
        System.out.println("Локация животного: ");
        System.out.println(animal.location);
    }
}
class main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Cat cat = new Cat("Кошка","Рыба","zoo #2","Мотя","3","14423");
        Dog dog = new Dog("Собака","Мясо","zoo #3","Шарик","5","836244");
        Horse horse = new Horse("Лошадь","Яблоко","zoo #1","Геля","11","28744314");
        
        System.out.println("Звуки животных: ");
        cat.makeNoise();
        dog.makeNoise();
        horse.makeNoise();
        System.out.println("--------------------");

        System.out.println("Еда животных: ");
        cat.eat();
        dog.eat();
        horse.eat();
        System.out.println("--------------------");

        System.out.println("Животное, пришедшее на прием(введите кличку животного):  ");
        String patient = scan.next();

        if (patient.equals("Геля"))
        {
            Vet.treatAnimal(horse);
        }
        else if(patient.equals("Мотя"))
        {
            Vet.treatAnimal(cat);
        }
        else if (patient.equals("Шарик"))
        {
            Vet.treatAnimal(dog);
        }
        else
        {
            System.out.println("Такого животного нет");
        }
    }
}
