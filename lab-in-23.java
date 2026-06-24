

import java.util.List;
import java.util.ArrayList;


interface Notifier
{
    void addObserver(Observer obs);
    void deleteObserver(Observer obs);
    void notifyObserver();
}
class Group implements Notifier
{
    String gname;
    String message;
    List <Observer> observerList = new ArrayList<>();
    public Group (String gname)
    {
        this.gname = gname;
    }
    @Override
    public void addObserver(Observer obs)
    {
        observerList.add(obs);
    }
    @Override
    public void deleteObserver(Observer obs)
    {
        int i = observerList.indexOf(obs);
        if (i>=0)
        {
            observerList.remove(obs);
        }
    }
    @Override
    public void notifyObserver()
    {
        for (int i = 0; i<observerList.size();i++)
        {
            Observer obs = observerList.get(i);
            obs.update(gname, message);
        }
    }
    public void changeData(String message)
    {
        this. message = message;
        notifyObserver();
    }
}
interface Observer
{
    public void update(String gname, String message);
}

class Users implements Observer
{
    String name;
    Notifier notifier;
    public Users (String name, Notifier notifier)
    {
        this.name = name;
        this.notifier = notifier;
        notifier.addObserver(this);
    }
    @Override
    public void update(String gname, String message)
    {
        this.name = name;
        show(gname, message);
    }
    public void show(String gname, String message)
    {
        System.out.println("Сообщение для: " + name + " от "+ gname +" : "+ message );
    }
}


class Main
{
    public static void main(String[] args)
    {
        Group g1 = new Group("One");
        Group g2 = new Group("Two");
        Group g3 = new Group("Three");
        Group g4 = new Group("Four");

        Users u1 = new Users("first", g1);
        g2.addObserver(u1);
        g3.addObserver(u1);

        Users u2 = new Users("second", g2);
        g1.addObserver(u2);
        g3.addObserver(u2);
        g4.addObserver(u2);

        g1.changeData("hello");
        g2.changeData("hello world");
        g3.changeData("hight");
        g4.changeData("good hight");

    }
}
