package Inheritance.Assisted_Problems;


class Animal
{
    String name;
    int age;

    void makeSound()
    {
        System.out.println("Animal makes a sound.");
    }
}
class Dog extends Animal
{
    void makeSound()
    {
        System.out.println("Dog barks Woof...");
    }
}

class Cat extends Animal
{
    void makeSound()
    {
        System.out.println("Cat Meowss...");
    }
}

class Bird extends Animal
{
    void makeSound()
    {
        System.out.println("Bird Chirps...");
    }
}
public class Program1 {
    public static void main(String[] args) {
        Animal a = new Animal();
        Animal d = new Dog();
        Animal c = new Cat();
        Animal b = new Bird();
        a.makeSound();
        d.makeSound();
        c.makeSound();
        b.makeSound();



    }
    
}
