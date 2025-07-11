package DSImplementation;



class Animal {
    String name;
    public void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("Dog is barking");
    }


}

public class extendsImpl {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.name = "Buddy"; // Inherited from Animal
        myDog.eat(); // Inherited from Animal
        myDog.bark(); // Specific to Dog


    }
}