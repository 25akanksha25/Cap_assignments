package Inheritance.Hybrid_Inheritance;

interface Worker {
    void performDuties();
}

class Person{
    String name;
    int id;

    Person(String name,int id)
    {
        this.name = name;
        this.id = id;
    }
}

class Chef extends Person implements Worker
{
    Chef(String name,int id)
    {
        super(name, id);
    }

    public void performDuties()
    {
        System.out.println("I am Chef my duty is to cook food."+"\nName : "+name+"\nId : "+id);
    }

}
class Waiter extends Person implements Worker
{
    Waiter(String name,int id)
    {
        super(name,id);
    }

    public void performDuties()
    {
        System.out.println("I am a Waiter my duty is to serve food."+"\nName : "+name+"\nId : "+id);
    }

}
public class Program1 {
    public static void main(String[] args) {
        Worker p = new Chef("Ram", 1212);
        Worker p1 = new Waiter("Sham",1220);
        p.performDuties();
        p1.performDuties();
    }
    
}
