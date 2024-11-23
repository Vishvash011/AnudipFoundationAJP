class Animal {
    public void eat(){
        System.out.println("Animal is eating!");
    }
}
class Dog extends Animal{
    public void eat(){
        System.out.println("Dog is eating!");
    }
}

class Cat extends Dog{
    public void eat(){
        System.out.println("Cat is eating!");
    }
}

public class Test{
    public static void main(String[] args) {
        Animal a = new Animal();
        Animal d = new Dog();
        Animal c = new Cat();

        a.eat();
        d.eat();
        c.eat();


    }
}
