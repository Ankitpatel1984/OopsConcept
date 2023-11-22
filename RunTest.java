package Oopsconcept1;

public class RunTest {
    public static void main(String[] args) {
        System.out.println("Parent Class Animal");
        Animal a= new Animal();
        a.Food();
        a.Run();
        a.Tall();
        a.Weight();

        System.out.println("Child Class Dog");
        Dog d = new Dog();
        d.Food();
        d.Run();
        d.Tall();
        d.Weight();

        System.out.println("Child Class Elephant");
        Elephant e= new Elephant();
        e.Food();
        e.Run();
        e.Tall();
        e.Weight();

        System.out.println("Child Class Lion");
        Lion l= new Lion();
        l.Food();
        l.Run();
        l.Tall();
        l.Weight();
    }

}
